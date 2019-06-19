package rktuhinbd.salahchallenge.ViewModel;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class AlarmStopper extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {

            MediaController.getInstance(context).stopMusic();
        }
    }

