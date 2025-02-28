public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(int id, String name, double price, int stockQuantity, String Category) {
        super(id, name, price, stockQuantity,"Clothing");
        this.size = size;
        this.material = material;
    }
    public String getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public double calculateDiscount() {
       return super.getPrice() * 0.70; //The Clothing part of the company gives you 30% discount

    }
}
