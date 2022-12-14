public class Main {

    public static void main(String[] args) {

        ProductUtils.getAllProducts()
                .stream()
                .forEach(product -> System.out.println(product));

        ProductUtils.updateProduct(2, "HEISENBERG");

        ProductUtils.getAllProducts()
                .stream()
                .forEach(product -> System.out.println(product));

    }

}