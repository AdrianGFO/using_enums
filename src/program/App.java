package program;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        Order o1 = new Order(12, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(o1.toString());
    }
}
