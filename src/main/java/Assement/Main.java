package Assement;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Clothing jeans = new Clothing("blue jeans", 20, 'L');
        Clothing shirt = new Clothing("red", 10, 's');
        Clothing jacket = new Clothing("big", 30, 'm');
        Clothing[] mangerCart = {jacket, shirt, jeans};
        Manager manger1 = new Manager(mangerCart,'m',"aqil",.25);
       Clothing[] employeeCart = {jacket, shirt, jeans};
        HourlyEmployee employee = new HourlyEmployee(employeeCart,'l',"ali",.10);
        System.out.println(ShopApp.CalcTotal(mangerCart));
       Customer customer = new Customer(employeeCart,'l',"michael",.10);
        System.out.println(ShopApp.isAFit());
        }
    }

