public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
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
        return "Dog [name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", order=" + getOrder()
                + ", breed=" + breed + "]";
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Dog run.");
    }
}