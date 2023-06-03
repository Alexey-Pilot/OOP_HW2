package Hw2.OOP_HW2;

public class Plate {
    private int food;

    public void setFood(int food) {
        this.food = food;
    }

    private final int maxFood = 100;

    public Plate(int food) {
        this.food = checkFood(food);
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void addFood() {
        this.food = maxFood;
    }

    private int checkFood(int food) {
        if (food > maxFood) {
            return maxFood;
        } else if (food < 0) {
            return -food;
        }
        return food;
    }
}
