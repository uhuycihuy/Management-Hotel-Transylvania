package hotelmanagement.model;

public class DoubleRoom extends AbstractRoom {
    private final RoomType roomType;
    private Customer secondCustomer;

    public DoubleRoom(RoomType roomType) {
        this.roomType = roomType;
    }

    public void setSecondCustomer(Customer customer) {
        this.secondCustomer = customer;
    }

    public Customer getSecondCustomer() {
        return secondCustomer;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }
}
