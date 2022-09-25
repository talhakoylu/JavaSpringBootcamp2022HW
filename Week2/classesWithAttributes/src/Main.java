public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.description = "Description of the relevant product.";
        product.unitPrice = 1500;
        product.unitsInStock = 2;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}