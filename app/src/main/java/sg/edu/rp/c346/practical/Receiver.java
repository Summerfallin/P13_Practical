package sg.edu.rp.c346.practical;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 16003749 on 13/8/2018.
 */

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {


        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        int pos = prefs.getInt("pos",0);
        if(pos==1){
            Toast my_toast = Toast.makeText(context,"You have a good taste!",Toast.LENGTH_LONG);
            my_toast.show();
        }else{
            Toast my_toast = Toast.makeText(context,"Bro, think twice about it",Toast.LENGTH_LONG);
            my_toast.show();
        }


    }
}
