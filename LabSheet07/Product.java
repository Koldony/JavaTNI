public class Product {
    public String name;
    public double price = 0;
    public int quantity = 0;
    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }
    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + " items");
        } else {
            System.out.println("Not enough items in stock...");
        }
    }
    public void changePrice(double newPrice) {
        if(newPrice > 0) {
            price = newPrice;
        }
    }
    public double stockValue() {
        return quantity * price;
    }
    public void showInfo() {
        System.out.println("Name            : " + name);
        System.out.println("Price           : " + price + " Baht/Item");
        System.out.println("Stock           : " + quantity + " Items");
        System.out.println("Stock value     : " + stockValue() + " Baht");
    }
}