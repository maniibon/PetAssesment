package Asssements;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static Object Dog;
    private static Object Tiger;
    private static Object Lion;
    private static Object Wolf;

    public static void main(String[] args) {

       Dog dog = new Dog("pitbull");
       Wolf wolf = new Wolf("wherewolf");
       Tiger tiger= new Tiger("Snow");
       Lion lion = new Lion("west african");
       Animal[] animals = {(Animal) Dog, (Animal) Tiger, (Animal) Lion, (Animal) Wolf};
        System.out.println(Arrays.toString(animals));

        ArrayList<String> pets = new ArrayList();
        pets.add(dog.speak());
        pets.add(tiger.speak());
        pets.add(wolf.speak());
        pets.add(lion.speak());

        for (String animal :pets) {
            System.out.println(pets);
            break;
       }
//
//      System.out.println( new Dog());
//      System.out.println( new Wolf());
//      System.out.println( new Tiger());
//      System.out.println( new Lion());
//
//  }



 }

}