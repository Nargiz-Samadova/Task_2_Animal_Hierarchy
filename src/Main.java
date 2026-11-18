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


        System.out.println("=== AnimalBehavior: sleep() ===");
        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("LUCKY", 1, 1, "Carnivora", "LABRADOR");
        behaviors[1] = new Pigeon("Kesha", 2, 1, "Gray", "Rock Dove");
        behaviors[2] = new Blowfish("Puffy", 1, 2, "Spotted", 15);

        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();


        System.out.println("\n=== AnimalMove: move() ===");
        for (Animal animal : zoo) {
            animal.move();
        }


        System.out.println("\n=== AnimalName: static name() ===");
        for (Animal animal : zoo) {
            AnimalName.name(animal.getName());
        }
    }
}