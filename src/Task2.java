public class Task2 {

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 13 Pro", "15.03.2025", "Apple Inc.", "USA", 6499, false);
        productsArray[2] = new Product("Xiaomi Mi 11", "22.01.2025", "Xiaomi Corp.", "China", 4999, true);
        productsArray[3] = new Product("Sony Xperia 5", "28.02.2025", "Sony Corp.", "Japan", 4599, false);
        productsArray[4] = new Product("Huawei P50", "10.04.2025", "Huawei Technologies", "China", 5399, true);

        for (Product product : productsArray) {
            product.displayProductInfo();
            System.out.println();
        }
    }
}
