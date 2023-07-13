package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderSystemTest {

    @Test
    void addMenu() {
        OrderSystem orderSystem = new OrderSystem();
        Menu cheeseburgerMenu = new Menu(1, "Cheeseburger Menu", 7.99, "Cheeseburger", "Fries", "Cola");

        orderSystem.addMenu(cheeseburgerMenu);

        // Check that the menu is correctly added
        assertEquals(cheeseburgerMenu, orderSystem.getOrderById(1));
    }

    @Test
    void getOrderById() {
        OrderSystem orderSystem = new OrderSystem();
        Menu cheeseburgerMenu = new Menu(1, "Cheeseburger Menu", 7.99, "Cheeseburger", "Fries", "Cola");
        Menu chickenBurgerMenu = new Menu(2, "Chicken Burger Menu", 8.99, "Chicken Burger", "Fries", "Sprite");

        orderSystem.addMenu(cheeseburgerMenu);
        orderSystem.addMenu(chickenBurgerMenu);

        // Check that the correct menus are returned
        assertEquals(cheeseburgerMenu, orderSystem.getOrderById(1));
        assertEquals(chickenBurgerMenu, orderSystem.getOrderById(2));
    }
}