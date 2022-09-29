package Assement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("blue jeans", 20, 'L');
        Clothing shirt = new Clothing("red", 5, 'm');
        Clothing jacket = new Clothing("big", 30, 'm');
        Clothing[] mangerCart = {jacket, shirt, jeans};
        Manager manger1 = new Manager(mangerCart, 'm', "aqil", .25);
        Clothing[] employeeCart = {jacket, shirt, jeans};
        HourlyEmployee employees = new HourlyEmployee(employeeCart, 'l', "ali", .10);
        ArrayList<Clothing> clothingitems = new ArrayList<>();
        clothingitems.add(jacket);
        clothingitems.add(shirt);
        clothingitems.add(jeans);
        for (Clothing i :clothingitems){
            System.out.println(i);
        }







        System.out.println(ShopApp.isAFit(employees,jacket));
        System.out.println(ShopApp.isAFit(manger1,shirt));
        ShopApp.printEmployeeName(employees);
        ShopApp.printEmployeeName(manger1);
       employees.printEmpPriceAfterDisc(shirt);
       employees.printEmpPriceAfterDisc(jacket);
       manger1.printEmpPriceAfterDisc(shirt);

        }
    }

