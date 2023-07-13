package RGMCode;

public class Main {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        orderSystem.addMenu(new Menu(1, "Cheeseburger Menu", 7.99, "Cheeseburger", "Fries", "Cola"));
        orderSystem.addMenu(new Menu(2, "Chicken Burger Menu", 8.99, "Chicken Burger", "Fries", "Sprite"));

        orderSystem.printMenus();
        orderSystem.placeOrder();
    }
}