public class Lizard extends Pet
{
    private String name;
    private String species;
    private int age;
    private double weight; //kg

    public Lizard(String name, String breed, int age, double weight)
    {
        super(name,age,weight);
        this.species = breed;
    }

    @Override
    public String toString() {
        String output = super.toString() + "\nSpecies: " + species;
        return output;
    }
}
