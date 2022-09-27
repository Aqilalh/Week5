package Assement;

public class Manager extends Employee implements Discountable{
private final double discount = .25;

    public Manager(Clothing[] clothingitems, char size, String name, double discount) {
        super(clothingitems, size, name, discount);
    }


    public double getDiscount(){
        return 0;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {

    }

    public String toString(){
        return "";
    }

    @Override
    public double calsDiscount(Clothing clothing) {
        return 0;
    }
}
