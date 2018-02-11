import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tiger {

    private int energy;

    String[] food = {"Meat", "Bugs", "Fish"};

    List<Runnable> activity = Arrays.asList(this::sound, this::eat, this::sleep);

    public Tiger(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        System.out.println("Tiger energy level: " + energy);
        return energy;
    }

    public void sound(){
        if (energy >= 3) {
            System.out.println("Tiger: Rawr~!");
            energy -= 3;
        }else{
            System.out.println("Tiger does not have enough energy");
        }
//        System.out.println("Energy remaining: " + energy);
    }

    public void eat(){
        Random random = new Random();
        int index = random.nextInt(food.length);
        System.out.println("Tiger begins to eat " + food[index]);
        energy += 5;
//        System.out.println("Energy remaining: " + energy);
    }

    public void sleep(){
        System.out.println("Tiger is sleeping: Zzz...");
        energy += 5;
//        System.out.println("Energy remaining: " + energy);
    }

    Random random = new Random();

    public void rndTigerActivity(){
        activity.get(random.nextInt(activity.size())).run();
    }
}
