public class SingleRoom extends AbstractRoom{
    public SingleRoom(int roomNumber, RoomType type) {
        super(roomNumber, type);
    }

    @Override
    public double calculateBill() {
        double total = getBasePrice();
        for (Makanan makanan : orderedMakanan) {
            total += makanan.getPrice();
        }
        return total;
    }

    @Override
    protected double getBasePrice() {
        return type == RoomType.LUXURY ? 2200 : 1200;
    }
}
