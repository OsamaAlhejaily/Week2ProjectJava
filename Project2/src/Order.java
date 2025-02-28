import java.util.*;

public class Order {
    private int orderID;
    private int userID;
    private List<OrderDetails> orderDetailsList = new ArrayList<>();

    public Order(int orderID, int userID) {
        this.orderID = orderID;
        this.userID = userID;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public void addOrderDetail(OrderDetails orderDetail) {
        orderDetailsList.add(orderDetail);
    }
    public double calculateTotal() {
        double total = 0;
        for (OrderDetails detail : orderDetailsList) {
            total += detail.getSubTotal();
        }
        return total;
    }
    public String displayOrders() {
        StringBuilder sb = new StringBuilder("Order ID: " + orderID + "\n");
        for (OrderDetails detail : orderDetailsList) {
            sb.append(detail).append("\n");
        }
        sb.append("Total: $").append(calculateTotal()).append("\n");
        return sb.toString();
    }
}
