package Ten;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args){

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "Светлана", LocalDate.of(2024, 12, 27), "PENDING", 300));
        orders.add(new Order(102, "Владимир", LocalDate.of(2024, 12, 28), "SHIPPED", 500));
        orders.add(new Order(103, "Кирилл", LocalDate.of(2024, 12, 22), "DELIVERED", 750));
        orders.add(new Order(104, "Сергей", LocalDate.of(2024, 12, 23), "SHIPPED", 1000));
        orders.add(new Order(105, "Ярослав", LocalDate.of(2024, 12, 20), "PENDING", 750));
        orders.add(new Order(106, "Анна", LocalDate.of(2024, 12, 21), "DELIVERED", 400));

        LocalDate specificDate = LocalDate.of(2024, 12, 22);

        List<Order> ordersAfterDate = orders.stream()
                .filter(order -> order.getOrderDate().isAfter(specificDate))
                .collect(Collectors.toList());
        System.out.println("Заказ после " + specificDate + ": " + ordersAfterDate);


        List<Order> shippedOrders = orders.stream()
                .filter(order -> "SHIPPED".equals(order.getStatus()))
                .collect(Collectors.toList());
        System.out.println("Отправленный заказ: " + shippedOrders);


        Map<String, Long> orderStatusCount = orders.stream()
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));
        System.out.println("Количество заказов каждого статуса: " + orderStatusCount);


        List<Order> ordersAbove500 = orders.stream()
                .filter(order -> order.getAmount() > 500)
                .collect(Collectors.toList());
        System.out.println("Список заказов с общей суммой более 500: " + ordersAbove500);


        Optional<Order> maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getAmount));
        maxOrder.ifPresent(order ->
                System.out.println("Клиент сделавший наиболший заказ: " + order.getCustomerName() + ", Сумма заказа: " + order.getAmount()));
    }
}

