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
        return "Mammal [name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", order=" + order + "]";
    }
}