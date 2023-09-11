public class Cat {
    private String name;
    private Integer appetite;
    private Boolean isHungry;               // добавлено поле "сытость"

    public String getName() {
        return name;
    }
    public Boolean getIsHungry() {
        return isHungry;
    }

    public Cat(String name, Integer appetite, Boolean isHungry) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = isHungry;
    }

    public void eating(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isHungry = false;
        }
    }
}
