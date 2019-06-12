package rktuhinbd.salahchallenge.ViewModel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import rktuhinbd.salahchallenge.View.AlarmActivity;

public class AlertReceiverMaghrib extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AlarmActivity.class);
        i.putExtra("Title","Salah Reminder");
        i.putExtra("Desc","Its time for Maghrib");
        context.startActivity(i);
//        NotificationHelper_Maghrib notificationHelper = new NotificationHelper_Maghrib(context);
//        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
//        notificationHelper.getManager().notify(4, nb.build());
    }
}
