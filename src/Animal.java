abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0;
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void eat(String food);
    public abstract void getVoice();

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}

abstract class Mammal extends Animal {
    private String order;

    public Mammal() {
        super();
        this.order = "Unknown Order";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(String name, String order) {
        super(name, 0);
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void drinkMilk() {
        System.out.println(getName() + " is drinking milk.");
    }

    @Override
    public void eat(String food) {
        System.out.println("Mammal " + getName() + " eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal makes a generic sound.");
    }

    @Override
    public String toString() {
        return "Mammal [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight() + ", order=" + order + "]";
    }
}

abstract class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Gray";
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name, 0);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public void layEggs() {
        System.out.println(getName() + " is laying eggs.");
    }

    @Override
    public void eat(String food) {
        System.out.println("Bird " + getName() + " pecks at " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Bird chirps.");
    }

    @Override
    public String toString() {
        return "Bird [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight() + ", featherColor=" + featherColor + "]";
    }
}

abstract class Fish extends Animal {
    private String scaleColor;

    public Fish() {
        super();
        this.scaleColor = "Silver";
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, String scaleColor) {
        super(name, 0);
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public void eat(String food) {
        System.out.println("Fish " + getName() + " eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Fish is silent.");
    }

    @Override
    public String toString() {
        return "Fish [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight() + ", scaleColor=" + scaleColor + "]";
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Mixed";
    }

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Carnivora");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void aport() {
        System.out.println(getName() + " brings the stick back!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dog " + getName() + " eagerly eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Dog says: Woof! Woof!");
    }

    @Override
    public String toString() {
        return "Dog [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight()
                + ", order=" + getOrder() + ", breed=" + breed + "]";
    }
}

class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Common Pigeon";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Gray");
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void transportsMail() {
        System.out.println(getName() + " is delivering a letter!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Pigeon " + getName() + " pecks seeds of " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon says: Coo-coo!");
    }

    @Override
    public String toString() {
        return "Pigeon [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight()
                + ", featherColor=" + getFeatherColor() + ", species=" + species + "]";
    }
}

class Blowfish extends Fish {
    private int diameter;

    public Blowfish() {
        super();
        this.diameter = 10;
    }

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(String name, int diameter) {
        super(name, "Spotted");
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void blows() {
        System.out.println(getName() + " is puffing up into a ball!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Blowfish " + getName() + " carefully nibbles on " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish makes bubbling sounds.");
    }

    @Override
    public String toString() {
        return "Blowfish [name=" + getName() + ", age=" + getAge() + ", weight=" + getWeight()
                + ", scaleColor=" + getScaleColor() + ", diameter=" + diameter + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[3];

        zoo[0] = new Dog("LUCKY", 1, 1, "Carnivora", "LABRADOR");
        zoo[1] = new Pigeon("Kesha", 2, 1, "Gray", "Rock Dove");
        zoo[2] = new Blowfish("Puffy", 1, 2, "Spotted", 15);

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("--- Object at index " + i + " ---");
            System.out.println(zoo[i].toString());
            zoo[i].getVoice();
            zoo[i].eat("food");

            if (zoo[i] instanceof Dog) {
                ((Dog) zoo[i]).aport();
            } else if (zoo[i] instanceof Pigeon) {
                ((Pigeon) zoo[i]).transportsMail();
            } else if (zoo[i] instanceof Blowfish) {
                ((Blowfish) zoo[i]).blows();
            }
            System.out.println();
        }
    }
}