package main;

import java.util.ArrayList;

public class Zoo {
    private String zooName;
    private ArrayList<Animal> animals = new ArrayList<>();



    public Zoo(String zooName)    {
        this.zooName = zooName;

    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals()   {
        System.out.println( zooName + " pitää sisällään seuraavat eläimet:");
        
        for (Animal animal : animals) {
            System.out.println(animal.getSpecies() + ": " + animal.getName() + ", " + animal.getAge() + " vuotta" );
            
            
        }
    }

    public void runAnimals(int laps)    {
        for (Animal animal : animals)   {
            animal.run(laps);
        }

    }
}
