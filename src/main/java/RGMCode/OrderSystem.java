package RGMCode;

/*      Aufgabe Burgerbestell System (Seite 2 von 2)
        OrderSystem:
        - Enthält eine Map von Menus.
        - Erstelle eine addMenu Methode um deinen Gästen neue Menüs anbieten zu können.
        - Schreibe eine getOrderById Methode, die dir das entsprechende Menü aus der Map zurückgibt.
        - Ergänze eine placeOrder Methode, die eine Eingabe des Users per Konsole erwartet und getOrderById aufruft. Ergänze
          diese mit der Ausgabe der bestellten Artikel im Menu und dem Preis.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {
    Map<Integer, Menu> menus;

    OrderSystem() {
        this.menus = new HashMap<>();
    }

    void addMenu(Menu menu) {
        menus.put(menu.id, menu);
    }

    Menu getOrderById(int id) {
        return menus.get(id);
    }

    void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Menünummer ein: ");
        int menuId = scanner.nextInt();

        Menu orderedMenu = getOrderById(menuId);

        if (orderedMenu != null) {
            System.out.println("Sie haben das folgende Menü bestellt: ");
            System.out.println(orderedMenu);
        } else {
            System.out.println("Entschuldigung, wir konnten kein Menü mit der gegebenen Nummer finden.");
        }
    }

}
