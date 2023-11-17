package pl.gornik.model;

public class Cat extends Animal {

    String cos;


    public Cat(String name, double weight, String type,String cos) {
        super(name, weight, type);
        this.cos = cos;
    }

    public Cat(Animal animal) {
        super(animal);
    }

    @Override
    public void giveVoice(String str) {
        str = "miau miau";
        super.giveVoice(str);
    }
}