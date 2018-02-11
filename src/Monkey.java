import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Monkey {

    private int energy;

    String[] food = {"Meat", "Fish", "Bugs", "Grain"};

    List<Runnable> activity = Arrays.asList(this::sound, this::play, this::eat, this::sleep);

    public Monkey(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        System.out.println("Monkey energy level: " + energy);
        return energy;
    }

    public void sound() {
        if (energy >= 4) {
            System.out.println("Monkey: Oooo oooo oooo~!");
            this.energy -= 4;
//            System.out.println("Energy remaining: " + energy);
        } else {
            System.out.println("Monkey too tired to make a sound");
        }
    }

    public void play(){
        if (energy >= 8){
            System.out.println("Monkey begins to play.");
            energy -= 8;
        }else {
            System.out.println("Monkey is too tired to play");
        }
//        System.out.println("Energy remaining: " + energy);
    }

    public void eat(){
        Random random = new Random();
        int index = random.nextInt(food.length);
        System.out.println("Monkey beings to eat " + food[index]);
        energy += 2;
//        System.out.println("Energy remaining: " + energy);
    }

    public void sleep(){
        System.out.println("Monkey is sleeping: Zzz...");
        energy += 10;
//        System.out.println("Energy remaining: " + energy);
    }

    Random random = new Random();

    public void rndMonkeyActivity(){
        activity.get(random.nextInt(activity.size())).run();
    }
}
