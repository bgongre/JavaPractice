import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Snake {

    private int energy;

    String[] food = {"Meat", "Bugs", "Fish", "Grain"};

    List<Runnable> activity = Arrays.asList(this::sound, this::eat, this::sleep);

    public Snake(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        System.out.println("Snake energy level: " + energy);
        return energy;
    }

    public void sound(){
        if (energy >= 3) {
            System.out.println("Snake: Hiss~!");
            energy -= 3;
        }else{
            System.out.println("Snake is too tired to make a sound");
        }
//        System.out.println("Energy remaining: " + energy);
    }

    public void eat(){
        Random random = new Random();
        int index = random.nextInt(food.length);
        System.out.println("Snake beings to eat " + food[index]);
        energy += 5;
//        System.out.println("Energy remaining: " + energy);
    }

    public void sleep(){
        System.out.println("Snake is sleeping: Zzz...");
        energy += 10;
//        System.out.println("Energy remaining: " + energy);
    }

    Random random = new Random();

    public void rndSnakeActivity(){
        activity.get(random.nextInt(activity.size())).run();
    }

}
