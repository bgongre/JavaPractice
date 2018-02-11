public class Jungle {

    private Snake snake;
    private Tiger tiger;
    private Monkey monkey;

    public Jungle(Snake snake, Tiger tiger, Monkey monkey) {
        this.snake = snake;
        this.tiger = tiger;
        this.monkey = monkey;
    }

    //did not call methods for each animal sound to avoid energy being used,
    //this is purely for getting energy after random activities
    public void jungleSoundOff(){
        System.out.println("Tiger: Rawr~!");
        tiger.getEnergy();
        System.out.println("Snake: Hiss~!");
        snake.getEnergy();
        System.out.println("Monkey: Oooo oooo oooo~!");
        monkey.getEnergy();
    }

}
