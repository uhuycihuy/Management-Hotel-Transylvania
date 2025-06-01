package service;

import hotelmanagement.model.Makanan;
import java.util.List;

public class FoodService {
    private static final String[] MENU_ITEMS = {"Nasi Goreng", "Rendang", "Mie Goreng", "Es Teler"};
    private static final int[] MENU_PRICES = {50, 60, 70, 30}; // Match with Makanan

    public static void displayMenu() {
        System.out.println("\n==========\n   Menu:  \n==========");
        System.out.println("Daftar Makanan/Minuman:");
        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.printf("%d. %s\tRp.%,d\n", i+1, MENU_ITEMS[i], MENU_PRICES[i]);
        }
    }

    public static Makanan createFoodOrder(int itemNo, int quantity) {
        if (itemNo < 1 || itemNo > MENU_ITEMS.length) {
            throw new IllegalArgumentException("Nomor menu tidak valid");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Jumlah harus lebih dari 0");
        }
        return new Makanan(itemNo, quantity);
    }

    public static double calculateFoodBill(List<Makanan> foodItems) {
        double total = 0;
        for (Makanan item : foodItems) {
            total += item.getPrice();
        }
        return total;
    }

    public static void printFoodOrder(List<Makanan> foodItems) {
        System.out.println("Item       Jumlah    Harga");
        System.out.println("-------------------------");
        for (Makanan item : foodItems) {
            System.out.printf("%-10s%-10dRp.%,-10.2f%n", 
                MENU_ITEMS[item.getItemNo()-1], 
                item.getQuantity(), 
                item.getPrice());
        }
    }
}