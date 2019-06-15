package rktuhinbd.salahchallenge.ViewModel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import rktuhinbd.salahchallenge.View.AlarmActivity;


public class AlertReceiverFajr extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelperFajr notificationHelper = new NotificationHelperFajr(context);
        //NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        //notificationHelper.getManager().notify(1, nb.build());
    }
}