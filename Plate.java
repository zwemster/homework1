public class Plate  {
    private Integer food;

    public Plate(Integer food) {
        this.food = food;
    }

    public void plateInfo(){
        System.out.println("Plate: " + food);
    }

    public void addFood(Integer amountOfFood) {
        if (amountOfFood >= 0) {
            food += amountOfFood;
        }
    }

    public void decreaseFood(Integer amountOfFood) {
        if (amountOfFood >= 0) {
            food -= amountOfFood;
        }
    }

    public Integer getFood() {
        return food;
    }
}
