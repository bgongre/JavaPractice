/************************************************************************************************************************
 *The jungle contains several species of animals; tigers, monkeys and snakes.                                          *
 *All animals can do three things, make a sound, eat food, and sleep.                                                   *
 *Each species of animal knows how many others of its kind exist.                                                       *
 *By default when an animal¹s energy level changes, it changes in the following ways:                                   *
 *-3 for making a sound                                                                                                 *
 *+5 for eating food                                                                                                    *
 *+10 for sleeping                                                                                                      *
 *The jungle can perform a sound off. This involves all of the animals in the jungle each making their sound, along with*
 *reporting their energy level.                                                                                         *
 *Tigers get +5 energy for sleeping.                                                                                    *
 *Monkeys get +2 energy for eating and -4 energy for making a sound.                                                    *
 *Some animals have the ability to play.                                                                                *
 *Only monkeys can play. When they do they say "Oooo Oooo Oooo" and get -8 energy. If a monkey doesn't have energy      *
 *to play they say "Monkey is too tired"                                                                                *
 *The jungle contains several types of food; meat, fish, bugs and grain.                                                *
 *Tigers can't eat grain because they have sensitive digestive systems.                                                 *
 *Bonus Item: The jungle can have each animal perform a random activity out of the ones possible for that animal.       *
 ************************************************************************************************************************/

public class Main {

    public static void main(String args[]){

        //create each animal and set their starting energy level
        Snake snake = new Snake(5);
        Tiger tiger = new Tiger(5);
        Monkey monkey = new Monkey(5);

        //create jungle that holds animals
        Jungle jungle = new Jungle(snake, tiger, monkey);

        //call for animals to do random activities
        monkey.rndMonkeyActivity();
        monkey.rndMonkeyActivity();
        monkey.rndMonkeyActivity();
        monkey.rndMonkeyActivity();
        monkey.rndMonkeyActivity();
        System.out.println("==========================");
        snake.rndSnakeActivity();
        snake.rndSnakeActivity();
        snake.rndSnakeActivity();
        snake.rndSnakeActivity();
        snake.rndSnakeActivity();
        System.out.println("==========================");
        tiger.rndTigerActivity();
        tiger.rndTigerActivity();
        tiger.rndTigerActivity();
        tiger.rndTigerActivity();
        tiger.rndTigerActivity();
        tiger.rndTigerActivity();
        System.out.println("==========================");

        //have each animal report their sound and energy level
        jungle.jungleSoundOff();

    }
}
