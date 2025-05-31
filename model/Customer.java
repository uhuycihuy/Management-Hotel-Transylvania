package hotelmanagement.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private final String id;
    private String name;
    private String contactNumber;
    private Gender gender;
    
    // Constructor
    public Customer(String name, String contactNumber, Gender gender) {
        this.id = generateCustomerId();
        this.name = name;
        this.contactNumber = contactNumber;
        this.gender = gender;
    }
    
    // ID generation logic
    private String generateCustomerId() {
        return "CUST-" + System.currentTimeMillis() + "-" + (int)(Math.random() * 1000);
    }
    
    // Getters and Setters
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama Tidak Boleh Kosong!!");
        }
        this.name = name;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        if(!contactNumber.matches("\\d{10,15}")) {
            throw new IllegalArgumentException("Format Nomor Telp Tidak Valid");
        }
        this.contactNumber = contactNumber;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    // Override methods
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", contact=" + contactNumber + ", gender=" + gender + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer other = (Customer) obj;
        return id.equals(other.id);
    }
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }
    
    // Nested Enum for Gender
    public enum Gender {
        MALE("Mr."),
        FEMALE("Ms."),
        OTHER("");
        
        private final String title;
        
        Gender(String title) {
            this.title = title;
        }
        
        public String getTitle() {
            return title;
        }
    }
}
