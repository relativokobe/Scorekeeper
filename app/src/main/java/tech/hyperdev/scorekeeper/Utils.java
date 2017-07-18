package tech.hyperdev.scorekeeper;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by asus on 18/07/2017.
 */

public class Utils {
    private static Boolean sTheme = true;
   // Boolean sTheme;

    Boolean piste = false;
    Boolean fck = true;

    public static void changeToTheme(Activity activity, Boolean theme) {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    public static void onActivityCreateSetTheme(Activity activity) {
       /* switch (sTheme) {
            default:
            case false:
                activity.setTheme(R.style.AppTheme);
                break;
            case true:
                activity.setTheme(R.style.AppTheme_KobeTheme);
                break;
        }*/

        if(sTheme == true){
            activity.setTheme(R.style.AppTheme);
        }
        else activity.setTheme(R.style.AppTheme_KobeTheme);
    }


}


