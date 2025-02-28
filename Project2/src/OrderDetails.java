public class OrderDetails {
    private int orderDetailID;
    private int orderID;
    private Product product;
    private int quantity;
    private double subTotal;

    public OrderDetails(int orderDetailID, int orderID, Product product, int quantity) throws OutOfStockException {
        this.orderDetailID = orderDetailID;
        this.orderID = orderID;
        this.product = product;
        this.quantity = quantity;
        this.subTotal = (product.getPrice() - product.calculateDiscount()) * quantity;


        if (quantity > product.getStockQuantity()) {
            throw new OutOfStockException("Insufficient stock for product: " + product.getName());
        }


    }
    public int getOrderDetailID() {
        return orderDetailID;
    }
    public int getOrderID() {
        return orderID;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getSubTotal() {
        return subTotal;
    }
    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    @Override
    public String toString() {
        return product.getName() + " x" + quantity + " = $" + subTotal;
    }

}
