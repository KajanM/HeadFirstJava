import org.omg.PortableInterceptor.LOCATION_FORWARD;

/**
 * Created by GM_Kajan on 4/7/2017.
 */
public class SimpleDotCom {
    private int[] locationCells;
    private int noOfHits = 0;

    public String checkYourSelf(String string) {
        String result = "miss";
        int guess = Integer.parseInt(string);


        for (int i = 0; i < 3; i++) {
            if (locationCells[i] == guess) {
                noOfHits += 1;
                locationCells[i] = -1;
                result = "hit";
                return result;

            }
        }

        return result;
    }

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }
}
