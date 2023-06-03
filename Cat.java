package Hw2.OOP_HW2;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public boolean eat(int feed) {
        if (fullness == true) {
            System.out.printf("Кот %s сыт и не притронулся к еде!", name);
            System.out.println();
            return false;
        } else if (feed >= appetite) {
            System.out.printf("Кот %s съел %d корма. ", name, appetite);
            System.out.println("Кот сыт.");
            fullness = true;
            return true;
        } else {
            System.out.printf("Для кота %s не достаточно корма. ", name);
            System.out.println("Кот остался голодным.");
            return false;
        }
    }
}
