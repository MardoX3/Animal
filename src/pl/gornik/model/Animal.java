package pl.gornik.model;

public class Animal {
    private String name;
    private double weight;
    private String  type;

    public Animal(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal(Animal animal){
        this(animal.name, animal.weight, animal.type);
    }
}
