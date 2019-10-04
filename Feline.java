package Asssements;

public class Feline implements Pet {
    private String Lion;
    private String Tiger;



    public Feline(String Lion ,String Tiger){
        this.Tiger =Tiger;
        this.Lion= Lion;
    }


    @Override
    public void greet() {

    }

    @Override
    public String toString() {
        return "Feline{" +
                "West African'" + Lion + '\'' +
                ", Tiger='" + Tiger + '\'' +
                '}';
    }
}
