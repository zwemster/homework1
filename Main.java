public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5, true),
                new Cat("Pushistik", 10, true),
                new Cat("Kotofey", 15, true)
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            if (cat.getIsHungry()) {
                cat.eating(plate);
                System.out.println(cat.getName() + " is hungry:" + cat.getIsHungry());
            }
        }
        plate.plateInfo();

        plate.addFood(30);
        plate.plateInfo();
    }
}