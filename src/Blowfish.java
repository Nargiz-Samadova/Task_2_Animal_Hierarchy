class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
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
        return "Blowfish [name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", scaleColor=" + getScaleColor()
                + ", diameter=" + diameter + "]";
    }
    @Override
    public void sleep() {
        System.out.println("Blowfish is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim.");
    }
}
