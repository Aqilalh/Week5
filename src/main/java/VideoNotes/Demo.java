package VideoNotes;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        setDemo();
    }



    public static void setDemo() {
        Set <String>fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");

        System.out.println(fruit.size());
        System.out.println(fruit);

        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for(String item: fruit){
            System.out.println(item);
        }
        fruit.forEach(x -> System.out.println(x));
    }
}