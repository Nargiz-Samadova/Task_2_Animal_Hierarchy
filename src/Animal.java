abstract class Animal implements AnimalMove {
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
