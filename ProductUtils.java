import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ProductUtils {

    private ProductUtils() {
    }

    public static void createTable() {

        String createSql = "CREATnE TABLE PRODUCTS (" +
                "PRICE INTEGER NOT NULL AUTO_INCREMENT, " +
                "NAME VARCHAR(255), " +
                "COLOUR VARCHAR(255)," +
                " INTEGER NOT NULL," +
                "PRIMARY KEY(NAME))";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Table created");

    }

    public static void insert(Product product) {

        String insertSql = "INSERT INTO PRODUCTS(NAME, COLOUR, YEAR) VALUES(" +
                "'" + product.getName() + "', " +
                "'" + product.getColour() + "', " +
                "" + product.getPrice() + ")";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Product> getAllProducts() {

        String selectSql = "SELECT * FROM PRODUCTS";


        List<Product> products = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                products.add(new Product(
                        resultSet.getInt("PRICE"),
                        resultSet.getString("NAME"),
                        resultSet.getString("COLOUR"),
                        resultSet.getInt("BIRTH_YEAR")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;

    }

    public static void updateProduct(Integer price, String newName) {

        String updateSql = "UPDATE PRODUCTS SET NAME = '" + newName + "' WHERE PRICE = " + price;

        try {
            JDBCUtil.getStatement().executeUpdate(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(

            );
        }

    }

    public static void deleteProducts(Integer Price) {

        String deleteAll = "DELETE FROM PRODUCTS WHERE PRICE = " + Price;

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteAll() {
        String deleteAll = "DELETE FROM PRODUCTS";

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
