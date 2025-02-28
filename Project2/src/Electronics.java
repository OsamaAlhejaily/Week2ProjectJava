public class Electronics extends Product{
    private int modelNumber;
    private String powerUsage;

    public Electronics(int id, String name, double price, int stockQuantity, String Category) {
        super(id, name, price, stockQuantity,"Electronics");
        this.powerUsage = powerUsage;
        this.modelNumber = modelNumber;
    }
    public int getModelNumber() {
        return modelNumber;
    }
    public String getPowerUsage() {
        return powerUsage;
    }
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }
    public void setPowerUsage(String powerUsage) {
        this.powerUsage = powerUsage;
    }

    @Override
    public double calculateDiscount() {
        return super.getPrice() * 0.80; // The electronics part of the company gives you 20% discount!
    }
}
