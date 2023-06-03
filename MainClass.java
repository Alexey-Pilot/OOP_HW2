package Hw2.OOP_HW2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 15);
        Cat cat2 = new Cat("Murzik", 17);
        Cat cat3 = new Cat("Vasili", 20);
        Cat cat4 = new Cat("Murka", 15);
        Cat cat5 = new Cat("Masha", 10);
        Cat cat6 = new Cat("Rizhik", 25);
        Cat cat7 = new Cat("Homeless", 50);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);


        Plate plate = new Plate(100);
        eating(cats, plate);

    }

    public static int minAppetite(List<Cat> cats) {
        int res = 100;
        for (Cat cat: cats){
            if (!cat.isFullness() & res > cat.getAppetite()){
                res = cat.getAppetite();
            }
        }
        return res;
    }
    public static void eating(List<Cat> cats, Plate plate){
        while (plate.getFood() >= minAppetite(cats) ) {
            int rnd = new Random().nextInt(7);
            if (cats.get(rnd).eat(plate.getFood())) {
                plate.setFood(plate.getFood() - cats.get(rnd).getAppetite());
            }
            plate.info();

        }if (minAppetite(cats) == 100){
            System.out.println("Все коты сыты!!!");
        }else {
            System.out.println("Насыпьте еще корма!");
            plate.addFood();
            eating(cats, plate);
        }
    }
}

