
/**
 * Created by GM_Kajan on 4/7/2017.
 */

import java.util.ArrayList;

public class SimpleDotCom {

    private ArrayList<String> locationCells;


    public String checkYourSelf(String guessedString) {
        String result = "miss";

        int index = locationCells.indexOf(guessedString);

        if (index >= 0) {

            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else result = "hit";
        }


        System.out.println(result);
        return result;
    }

    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }
}
