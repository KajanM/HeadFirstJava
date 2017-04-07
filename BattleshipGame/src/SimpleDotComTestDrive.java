/**
 * Created by GM_Kajan on 4/7/2017.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,4,5};
        dot.setLocationCells(locations);

        String userGuess = "5";
        String result = dot.checkYourSelf(userGuess);

        String  testResult = "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
