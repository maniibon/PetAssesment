package Asssements;

public class Lion extends Feline implements Pet {
    private String name;



    public Lion (String name ) {
        super("west","snow");
        this.name = name;
    }

    public Lion() {
        super("west","snoow");
    }

    public String speak(){
        return "Rawwwwwwwwwww";
    }

    @Override
    public String toString() {
        return "A west Afican Lion is  a Feline" +
                " that says '" + speak() + '\'' +
                '}';
    }
}

