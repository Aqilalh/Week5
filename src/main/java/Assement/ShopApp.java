package Assement;

import java.util.ArrayList;

public class ShopApp {
    public static double CalcTotal(Clothing[] clothingItems) {
        int total = 0;
        for (int i = 0; i < clothingItems.length; i++){
           total += clothingItems[i].getPrice();
        }
return total;
    }
    public static boolean isAFit(Customer customer, Clothing clothing) {
        if (customer.getSize() == clothing.getSize()) {
            return true;
        } else {
            return false;
        }
    }
    public static void sortAndPrintClothing(ArrayList<Clothing> clothing){
        System.out.println();
}
public static void printEmployeeName(Employee employee){
    System.out.println(employee.name);
    }
    public static void printDiscAmtOff(Discountable[] discountables, Clothing clothing){
        System.out.println();
    }
}
