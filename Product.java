public class Product {
    private Integer price;
    private String name;
    private String colour;
    private Integer year;

    public Product() {
    }

    public Product(Integer price, String name, String colour, Integer year) {
        this.price = price;
        this.name = name;
        this.colour = colour;
        this.year = year;
    }

    public Product(String name, String colour, Integer year) {
        this.name = name;
        this.colour = colour;
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer year() {
        return year;
    }

    public void setYear(Integer Year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", Name='" + name + '\'' +
                ", Colour='" + colour + '\'' +
                ", Year=" + year +
                '}';
    }

}

