package Assement;

public class Clothing {
    private String desciption;

    private double price;
    private char size;
    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    public Clothing(String desciption, double price, char size) {
        this.desciption = desciption;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "desciption='" + desciption + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
