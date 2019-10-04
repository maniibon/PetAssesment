package Asssements;

public class Canine implements Pet {
    private String dog;
    private String wolf;

    public Canine(String dog, String wolf) {
        this.dog = dog;
        this.wolf = wolf;
    }

    public Canine(String pitbull) {
    }


    @Override
    public void greet() {

    }

    @Override
    public String toString() {
        return "Canine{" +
                "dog='" + dog + '\'' +
                ", wolf='" + wolf + '\'' +
                '}';
    }
}
