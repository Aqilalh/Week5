package Assement;

public abstract class Employee extends Customer{
    private final double discount = .10;

    public Employee(Clothing[] clothingitems, char size, String name, double discount) {
        super(clothingitems, size, name, discount);
    }


    public double getDiscount() {
        return discount ;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);
}
