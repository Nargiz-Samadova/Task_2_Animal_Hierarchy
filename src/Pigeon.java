class Pigeon extends Bird implements AnimalBehavior, AnimalMove{
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
        return "Pigeon [name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", featherColor=" + getFeatherColor()
                + ", species=" + species + "]";
    }
    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon fly.");
    }
}
