package rktuhinbd.salahchallenge.ViewModel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import rktuhinbd.salahchallenge.View.AlarmActivity;

public class AlertReceiverZuhr extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AlarmActivity.class);
        i.putExtra("Title","Salah Reminder");
        i.putExtra("Desc","Its time for Zuhr");
        context.startActivity(i);
//        NotificationHelper_Zuhr notificationHelper = new NotificationHelper_Zuhr(context);
//        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
//        notificationHelper.getManager().notify(2, nb.build());
    }
}
