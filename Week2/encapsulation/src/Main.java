public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Description of the relevant product.");
        product.setUnitPrice(1500);
        product.setUnitsInStock(2);

        Product product1 = new Product(1, "Product 2", "Descriptiop of the relevant product 2", 150, 3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product1);

        System.out.println(product.getProductCode());
    }
}