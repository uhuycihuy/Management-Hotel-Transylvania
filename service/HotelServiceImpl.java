package hotelmanagement.service;

import hotelmanagement.model.Customer;
import hotelmanagement.model.Makanan;
import hotelmanagement.model.RoomType;
import hotelmanagement.room.AbstractRoom;
import hotelmanagement.room.SingleRoom;

import java.util.HashMap;
import java.util.Map;

public class HotelServiceImpl {
    private Map<Integer, AbstractRoom> roomMap;

    public HotelServiceImpl() {
        this.roomMap = new HashMap<>();

        // Inisialisasi beberapa kamar
        roomMap.put(101, new SingleRoom(101, RoomType.STANDARD));
        roomMap.put(102, new SingleRoom(102, RoomType.LUXURY));
        // Tambahkan kamar lain jika perlu
    }

    public boolean bookRoom(int roomNumber, Customer customer) {
        AbstractRoom room = roomMap.get(roomNumber);
        if (room != null && room.isAvailable()) {
            room.bookRoom(customer);
            return true;
        }
        return false;
    }

    public boolean orderMakanan(int roomNumber, Makanan makanan) {
        AbstractRoom room = roomMap.get(roomNumber);
        if (room != null && !room.isAvailable()) {
            room.orderMakanan(makanan);
            return true;
        }
        return false;
    }

    public double checkOut(int roomNumber) {
        AbstractRoom room = roomMap.get(roomNumber);
        if (room != null && !room.isAvailable()) {
            double totalBill = room.calculateBill();
            room.checkOut();
            return totalBill;
        }
        return 0.0;
    }

    public AbstractRoom getRoom(int roomNumber) {
        return roomMap.get(roomNumber);
    }

    public void printRoomStatus() {
        for (Map.Entry<Integer, AbstractRoom> entry : roomMap.entrySet()) {
            AbstractRoom room = entry.getValue();
            System.out.println("Room " + room.roomNumber + " - " +
                    (room.isAvailable() ? "Available" : "Occupied"));
        }
    }
}
