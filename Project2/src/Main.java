import java.util.ArrayList;
import java.util.HashMap;

    public class Main {
        public static void main(String[] args) {

            ArrayList<Order> orders = new ArrayList<>();
            HashMap<Integer, Order> userOrderHistory = new HashMap<>();


            Product laptop = new Electronics(1, "Laptop", 1000.00, 10, "Electronics");
            Product tshirt = new Clothing(2, "T-Shirt", 50.00, 30, "Clothing");


            System.out.println("Products:");
            System.out.println(laptop);
            System.out.println(tshirt);

            try {
                Order order1 = new Order(101, 1);
                order1.addOrderDetail(new OrderDetails(1, 101, laptop, 1));
                order1.addOrderDetail(new OrderDetails(2, 101, tshirt, 2));


                orders.add(order1);
                userOrderHistory.put(1, order1);


                System.out.println("\nOrder Details:");
                System.out.println(order1.displayOrders());


                System.out.println("User 1 Order History:");
                System.out.println(userOrderHistory.get(1).displayOrders());
            }catch (OutOfStockException e) {
                System.out.println(e.getMessage());
            }
        }
    }

