package pl.gornik.model;

public class Dog extends Animal{
    @Override
    public void giveVoice(String str) {
        str = "hou hou";
        super.giveVoice(str);
    }

    public Dog(String name, double weight, String type) {
        super(name, weight, type);
    }

    public Dog(Animal animal) {
        super(animal);
    }
}