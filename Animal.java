package Asssements;

public class Animal  implements Pet {
   private String Feline;
   private String Canine;

    public Animal(String Feline,String Canine){
        this.Feline = Feline;
        this.Canine = Canine;
    }



    @Override
    public void greet() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "Feline='" + Feline + '\'' +
                ", Canine='" + Canine + '\'' +
                '}';
    }
}
