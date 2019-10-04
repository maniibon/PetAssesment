package Asssements;

public class Dog extends Canine implements Pet {
    private String name;


    public Dog(String name){
        super("Pitbull", "Werewolf");
        this.name = name;

    }

    public Dog() {
        super("pitbull");
    }

    public String speak(){
        return "woof woof";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A Blue Pit bull tat is a Canine " +
                "that says '" + speak() +'\'' +
                '}';
    }
}
