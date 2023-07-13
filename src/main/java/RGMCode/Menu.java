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

    private String name;
    private double price;
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu(String name, double price, String mainDish, String sideDish, String beverage) {
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (Double.compare(menu.price, price) != 0) return false;
        if (!Objects.equals(name, menu.name)) return false;
        if (!Objects.equals(mainDish, menu.mainDish)) return false;
        if (!Objects.equals(sideDish, menu.sideDish)) return false;
        return Objects.equals(beverage, menu.beverage);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (mainDish != null ? mainDish.hashCode() : 0);
        result = 31 * result + (sideDish != null ? sideDish.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }
}
