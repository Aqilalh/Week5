public class Main {
    public static void main(String[] args) {
Person person1 = new Person("aqil","alhaidari");
Person[] names = new Person[1];
names[0] = person1;

PersonHandler ppl = new PersonHandler(names);
        System.out.println(ppl.forLoop());
        System.out.println(ppl.forEachLoop());
        System.out.println(ppl.whileLoop());
    }
}
