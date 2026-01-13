public class ProductMain3 {
    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i=0; i<products.length; i++) {
            products[i] = new Product();
            products[i] =.name = names[i];
            
        }
    }
}
