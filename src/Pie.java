public class Pie extends Bakery {
    private int slice;
    private double cost;

    public Pie(int slice, double cost) {
        this.slice = slice;
        this.cost = cost;
    }
    public Pie() {
        this(0, 0.0);
    }
    public double getCost() {
        return this.cost;
    }
    public int getSlice() {
        return this.slice;
    }
    public int getPaperBagNumber() {
        return this.slice % 5;
    }
    public boolean isPackingGift() {
        return this.slice >= 5;
    }
    public int getGiftNumber() {
        if (isPackingGift())
            return this.slice / 5;
        return 0;
    }
    @Override
    public int getPackingCost() {
        if (isPackingGift())
            return 10;
        return getPaperBagNumber() * super.getPackingCost();
    }
    @Override
    public double calculateTotalPrice() {
        if (isPackingGift())
            return getCost() * this.slice + getPackingCost();
        return getCost() * this.slice;
    }
    public String toString() {
        return super.toString() +
                "\n" + getSlice() + " piece of pie (" +
                " with " + (isPackingGift() ? getGiftNumber() + " Gift Box " : " ")
                + getPaperBagNumber() + " Paper bag )" +
                "\nTotal cost of pie = " + calculateTotalPrice();
    }

}
