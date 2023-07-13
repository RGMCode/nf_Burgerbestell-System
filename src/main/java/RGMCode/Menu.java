package RGMCode;

import java.util.Objects;

/*      Aufgabe Burgerbestell System(Seite 1von 2)
        Erstelle ein kleines Programm mit dem der Benutzer ein Burgermenü bestellen kann,indem er
        dessen Menünummer angibt.

        Das bestellte Menü wird mit Inhalt und Preis ausgeben.
        Es soll eine Menu und eine OrderSystem Klasse enthalten.

        Menu:
        - Menu enthält den name,price,mainDish,sideDish,beverage,überlege dir hierfür sinnvolle Datentypen.
        - Überlege welche Methoden du noch benötigst und ergänze sie.
*/

public class Menu {
    int id;
    String name;
    double price;
    String mainDish;
    String sideDish;
    String beverage;

    Menu(int id, String name, double price, String mainDish, String sideDish, String beverage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
