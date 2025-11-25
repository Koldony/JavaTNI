import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
        String code = "PB-001";
        String name = "Pencil Box";
        int item = 112;
        double price_per_item = 30.20;

        DecimalFormat form = new DecimalFormat("#,###.00");

        System.out.println("Product name: "+ code + " (" + name + ")");
        System.out.println("Product item: "+ item + " (" + form.format(price_per_item) + " baht/piece" + ")");

        double total_price = item*price_per_item;

        System.out.println("Total price : "+ form.format(total_price) + " bath");
    }
}
