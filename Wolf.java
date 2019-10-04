package Asssements;

public class Wolf extends Canine implements Pet {
    private String name;


    public Wolf (String name){
        super("p","k");
        this.name = name;

    }

    public Wolf() {
        super("blue","were");
    }

    public String speak() {
        return "aWooooooooooo";
    }

    @Override
    public String toString() {
        return "A Werewolf is a Canine " + "that says "+ speak()+'\'' +
                '}';
    }
}

