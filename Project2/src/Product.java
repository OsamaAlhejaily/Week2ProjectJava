public class Product {
    private int id;
    private String name;
    private double price;
    private int StockQuantity;
    private String Category;

    public Product(int id, String name, double price, int StockQuantity, String Category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.StockQuantity = StockQuantity;
        this.Category = Category;

    }
    public Product(){

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return StockQuantity;
    }
    public String getCategory() {
        return Category;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStockQuantity(int StockQuantity) {
        this.StockQuantity = StockQuantity;
    }
    public void setCategory(String Category) {
        this.Category = Category;
    }
    public double calculateDiscount() {
        return price;
    }
    @Override
    public String toString() {
        return name + " (" + Category + ") - $" + price;
    }


}
