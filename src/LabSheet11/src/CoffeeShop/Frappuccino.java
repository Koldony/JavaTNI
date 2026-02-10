package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;

    public Frappuccino(String size, boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        if (whipped) {
            return getBasePrice() + 15 + getSizeExtra();
        }
        return getBasePrice() + getSizeExtra();
    }

    public String toString() {
        return super.toString() +
                (whipped ? "Add whipped 15 baht" : "") +
                "\nTotal price = " + calculateFinalPrice() + " Baht";
    }
}
