package Assement;

import java.util.Arrays;

public class Customer {
Clothing[] clothingitems = new Clothing[3];
private char size;
public String name;
double discount;

   public Customer(Clothing[] clothingitems, char size, String name, double discount) {
      this.clothingitems = clothingitems;
      this.size = size;
      this.name = name;
      this.discount = discount;
   }

   public Customer(char size) {
      this.size = size;
   }

   public char getSize(){
      return size;
   }
   @Override
   public String toString() {
      return "Customer{" +
              "clothingitems=" + Arrays.toString(clothingitems) +
              ", size=" + size +
              '}';
   }


}


