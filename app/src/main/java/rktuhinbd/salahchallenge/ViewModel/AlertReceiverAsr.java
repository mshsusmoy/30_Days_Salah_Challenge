package rktuhinbd.salahchallenge.ViewModel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import rktuhinbd.salahchallenge.View.AlarmActivity;
import rktuhinbd.salahchallenge.View.QuranActivity;

public class AlertReceiverAsr extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationHelper_Asr notificationHelper = new NotificationHelper_Asr(context);
        //NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        //notificationHelper.getManager().notify(3, nb.build());
    }
}
