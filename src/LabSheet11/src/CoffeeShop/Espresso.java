package CoffeeShop;

public class Espresso extends Drink{
    private int shot;

    public Espresso(String size) {
        super("Espresso", 35, size);
        this.shot = 0;
    }

    public void addShot(int shot) {
        this.shot = this.shot + shot;
    }

    public int getShot() {
        return this.shot;
    }

    @Override
    public double calculateFinalPrice() {
        if (getShot()>0) {
            return getBasePrice() + (shot * 15) + getSizeExtra();
        }
        return getBasePrice() + getSizeExtra();
    }

    public String toString() {
        return super.toString() +
                (getShot()>0 ? "Added " + shot + " shot" : "") +
                "\nTotal price = " + calculateFinalPrice() + " Baht";
    }
}
