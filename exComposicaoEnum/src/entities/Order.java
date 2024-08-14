package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getProducts() {
        return orderItems;
    }

    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public Double total(){
        double sum = 0.0;
        for(OrderItem item : orderItems){
            sum += item.SubTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary:\n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order Items: \n");
        for (OrderItem item : orderItems){
            sb.append(item + "\n");
        }
        sb.append("Total Price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();

    }

}
