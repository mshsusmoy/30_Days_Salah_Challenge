package rktuhinbd.salahchallenge.ViewModel;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import rktuhinbd.salahchallenge.R;
import rktuhinbd.salahchallenge.View.AlarmActivity;
import rktuhinbd.salahchallenge.View.MainActivity;


public class AlertReceiverFajr extends BroadcastReceiver {

    public static final String channelID = "channelID";
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelperFajr notificationHelper = new NotificationHelperFajr(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());


//        Intent mIntent = new Intent(context, AlarmStopper.class);
//        mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 1, mIntent,PendingIntent.FLAG_UPDATE_CURRENT);
//
//        //MediaController.getInstance(context).playMusic();
//
//        CharSequence dismissAlarm = "DISMISS";
//
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,channelID)
//                .setSmallIcon(R.drawable.ic_launcher_background)
//                .setContentTitle("Salah Reminder!")
//                .setContentText("Its time for Fajr")
//                .setContentIntent(pendingIntent)
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//                .addAction(R.drawable.ic_launcher_foreground, dismissAlarm , pendingIntent)
//                .setAutoCancel(true);
//
//
//        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.notify(1, builder.build());
    }
}