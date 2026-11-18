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
        return "Bird [name=" + getName() + ", age=" + getAge()
                + ", weight=" + getWeight() + ", featherColor=" + featherColor + "]";
    }
}