package day10.practicingAlone;

public class Test {

    public static void main(String[] args) {


        Animal dog = new Animal("Dog", "김코코", 4, 'f', 010123123);

        AnimalHostpital ah = new AnimalHostpital();
        ah.newAnimalInscription(dog);

        Animal animal = ah.getInscriptedAnimal("김코코");

        System.out.println("animal = " + animal);

        boolean inscriptCheck = ah.animalInscriptedCheck("김코코");
        System.out.println(inscriptCheck);


    }

}
