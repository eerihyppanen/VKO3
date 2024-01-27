package main;

public class Animal {
    private String species;
    private String name;
    private int age;


    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;


    }


    public void run(int laps)   {
        for (int i = 0; i< laps; i++)   {
            System.out.println(name + " juoksee kovaa vauhtia!");
        }
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }







}
