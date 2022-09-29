 import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int requiredSalary = 30000;
        int requiredYearsOfExperience = 2;
        int employeeSalary = scanner.nextInt();
        int employeeExperience = scanner.nextInt();
        if (employeeSalary >= requiredSalary) {
            if (employeeExperience >= requiredYearsOfExperience) {
                System.out.println("Accepeted");
            } else {
                System.out.println("not enough experience");
            }
        }
        else {
            System.out.println("not enough salary");

    }

        int sales = 10;
        System.out.println("how many sales you made");
       int employeeSales = scanner.nextInt();
       if(employeeSales >= sales){
           System.out.println("very good job");
       }else {
           employeeSales = sales - employeeSales;
           System.out.println(" you didnt meet the expecations this week your off by " + employeeSales);
       }



        int salesPeopleIncome = 1000;
        int bonus = 250;
        System.out.println("how many sales did the user make this week");
        int saless = scanner.nextInt();
        if(sales >= 10){
            salesPeopleIncome = bonus + salesPeopleIncome;
        }else{
            System.out.println("no bounce");
        }
        System.out.println("my new income is " + salesPeopleIncome);









        System.out.println("season of the year");
String seaosn = scanner.nextLine();
        System.out.println("give us a whole number");
        int number = scanner.nextInt();
        System.out.println("give us an adjective");
        String adjective = scanner.next();
        scanner.close();
        System.out.println("On a " + adjective + seaosn + " day, I drink a minimum " + number + "cups of coffee");



    }













}
