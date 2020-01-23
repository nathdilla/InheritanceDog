public class PetDriver
{
    public static void main(String[] args)
    {
        Dog boomer = new Dog("Boomer", "Nazi German", 42, 23);
        Lizard zuck = new Lizard("Zuck", "Robot", 35, 66);

        System.out.println(boomer.toString());
        System.out.println(zuck.toString());
    }
}
