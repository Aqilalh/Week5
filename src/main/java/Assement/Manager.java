package Assement;

public class Manager extends Employee implements Discountable{
private final double discount = .25;

    public Manager(Clothing[] clothingitems, char size, String name, double discount) {
        super(clothingitems, size, name, discount);
    }


    public double getDiscount(){
        return discount;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double total = clothing.getPrice() - calsDiscount(clothing);
        System.out.println(total);
    }

    public String toString(){
        return "";
    }

    @Override
    public double calsDiscount(Clothing clothing) {
        return getDiscount() * clothing.getPrice();
    }
}
