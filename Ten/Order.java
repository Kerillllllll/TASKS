package Ten;

import java.time.LocalDate;

public class Order {
    private int orderId;
    private String customerName;
    private LocalDate orderDate;
    private String status;
    private int amount;

    public Order(int orderId, String customerName, LocalDate orderDate, String status, int amount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.status = status;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }
    public String toString() {
        return "Заказ: " + "ID: " + orderId + ", Имя заказчика: " + customerName + ", Дата заказа" + orderDate + ", Стасус'" + status  + ", Сумма заказа" + amount;
    }
}

