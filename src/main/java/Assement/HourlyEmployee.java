package Assement;

public class HourlyEmployee extends Employee implements Discountable{

    public HourlyEmployee(Clothing[] clothingitems, char size, String name, double discount) {
        super(clothingitems, size, name, discount);
    }

    @Override
    public double calsDiscount(Clothing clothing) {
      return getDiscount() * clothing.getPrice();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{}";
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        double total = clothing.getPrice() - calsDiscount(clothing);
        System.out.println(total);
    }
}

