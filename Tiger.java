package Asssements;

public class Tiger extends Feline implements Pet {
    private String name;



    public Tiger (String name ) {
        super("west","snow");
        this.name = name;
    }

    public Tiger() {
        super("","snow");
    }

    public String speak(){
        return "Rawwwwwwwwwww";
    }

    @Override
    public String toString() {
        return "A Snow Tiger is a Feline " +
                "that says '"+ speak()+ '\'' +
                '}';
    }
}


