import java.util.ArrayList;

/**
 * Created by GM_Kajan on 4/7/2017.
 */

public class DotComBust {
    private ArrayList<DotCom> dotComList = new ArrayList();
    private GameHelper gameHelper = new GameHelper();
    private int noOfGuesses = 0;

    public void setUpGame() {
        //initialize the DotCom objects with names and locations
        //display brief instruction to the user
        DotCom dotcom1 = new DotCom();
        DotCom dotcom2 = new DotCom();
        DotCom dotcom3 = new DotCom();

        dotcom1.setName("java.com");
        dotcom2.setName("is.com");
        dotcom3.setName("great.com");

        dotComList.add(dotcom1);
        dotComList.add(dotcom2);
        dotComList.add(dotcom3);

        System.out.println("Your goal is to sink three dot.coms.");
        System.out.println("java.com, is.com, great.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotCom : dotComList){
            ArrayList<String> newLocation = gameHelper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);
        }

    }

    public void startPlaying() {
        //asks the player for guesses
        //calls the checkUserGuess() method
        String userGuess;

        while (!dotComList.isEmpty()){
            userGuess = gameHelper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        //loops through all remaining DotCom objects
        //calls each DotCom object's checkYourSelf() mehtod
        noOfGuesses++;
        String result = "miss";

        for (DotCom dotCom : dotComList){
            result = dotCom.checkYourSelf(userGuess);

            if(result.equals("hit")){
                break;
            }

            if(result.equals("kill")){
                dotComList.remove(dotCom);
                break;
            }

        }

        System.out.printf(result);


    }

    public void finishGame() {
        //prints a message about the user's performance based on how many guesses took
        System.out.println("All Dot Coms are dead!");

        if(noOfGuesses<=18){
            System.out.println("It only took you " + noOfGuesses + " gusses");
            System.out.println("You got our before your options sank");
        }else{
            System.out.println("Took long enough. "+ noOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }


    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
