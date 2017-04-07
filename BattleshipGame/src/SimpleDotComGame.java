import java.util.ArrayList;

/**
 * Created by GM_Kajan on 4/7/2017.
 */

public class SimpleDotComGame {
    public static void main(String[] args) {
        int noOfGuesses = 0;
        GetInput input = new GetInput();

        SimpleDotCom dotcom = new SimpleDotCom();

        int startIndex = (int)(Math.random()*5);

        ArrayList locationCells = new ArrayList<String>();
        locationCells.add(Integer.toString(startIndex));
        locationCells.add(Integer.toString(startIndex + 1));
        locationCells.add(Integer.toString(startIndex + 2));



        dotcom.setLocationCells(locationCells);

        boolean isAlive = true;

        while (isAlive){
            String guess = input.getUserInput("enter a number");
            String result = dotcom.checkYourSelf(guess);

            noOfGuesses++;

            if(result.equals("kill")){
                isAlive = false;
                System.out.println("you took " + noOfGuesses + " guesses");
            }

        }

    }
}
