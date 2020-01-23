public class Dog extends Pet
{
    private String name;
    private String breed;
    private int age;
    private double weight; //kg

    public Dog(String name, String breed, int age, double weight)
    {
        super(name,age,weight);
        this.breed = breed;
    }

    @Override
    public String toString() {
        String output = super.toString() + "\nBreed: " + breed;
        return output;
    }
}
