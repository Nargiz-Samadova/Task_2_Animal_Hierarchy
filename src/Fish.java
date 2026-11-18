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
        return "Fish [name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", scaleColor=" + scaleColor + "]";
    }
}