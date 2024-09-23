package entities;

public class Product {
    private String productName;
    private Double price;
    private Integer qtd;

    public Product(){}

    public Product(String productName, Double price, Integer qtd) {
        this.productName = productName;
        this.price = price;
        this.qtd = qtd;
    }

    public String getProductName() {
        return productName;
    }


    public Double getPrice() {
        return price;
    }


    public Integer getQtd() {
        return qtd;
    }

    public double totalPrice(){
        return price * qtd;
    }

    @Override

    public String toString(){
        return productName + ", " + totalPrice();
    }

}
