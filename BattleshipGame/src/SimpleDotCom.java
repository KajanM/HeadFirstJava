import org.omg.PortableInterceptor.LOCATION_FORWARD;

/**
 * Created by GM_Kajan on 4/7/2017.
 */
public class SimpleDotCom {
    private int[] locationCells;
    private int noOfHits = 0;

    public String checkYourSelf(String guessedString) {
        String result = "miss";
        int guess = Integer.parseInt(guessedString);


        for (int i = 0; i < 3; i++) {
            if (locationCells[i] == guess) {
                noOfHits ++;
                locationCells[i] = -1;
                result = "hit";
                break;
            }
        }

        if(noOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }
}
