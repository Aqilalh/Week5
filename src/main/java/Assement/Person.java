package Assement;

public abstract class Person extends Customer{


    public Person(char size) {
        super(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
