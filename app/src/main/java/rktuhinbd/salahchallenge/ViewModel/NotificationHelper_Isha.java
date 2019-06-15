package rktuhinbd.salahchallenge.ViewModel;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.RingtoneManager;
import android.os.Build;
import android.preference.RingtonePreference;
import android.support.v4.app.NotificationCompat;

import rktuhinbd.salahchallenge.R;
import rktuhinbd.salahchallenge.View.AlarmActivity;
import rktuhinbd.salahchallenge.View.MainActivity;

public class NotificationHelper_Isha extends ContextWrapper {
    public static final String channelID = "channelID";
    public static final String channelName = "Channel Name";

    private NotificationManager mManager;

    public NotificationHelper_Isha(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannel(base);
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createChannel(Context context) {
        //NotificationChannel channel = new NotificationChannel(channelID, channelName, NotificationManager.IMPORTANCE_HIGH);

        //getManager().createNotificationChannel(channel);

        Intent i = new Intent(context, AlarmActivity.class);
        i.putExtra("Title","Salah Reminder");
        i.putExtra("Desc","Its time for Isha");
        context.startActivity(i);
    }

    public NotificationManager getManager() {
        if (mManager == null) {
            mManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }

        return mManager;
    }

    public NotificationCompat.Builder getChannelNotification() {
        Intent repeating_intent = new Intent(getApplicationContext(), MainActivity.class);
        repeating_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent_fajr =  PendingIntent.getActivity(getApplicationContext(),5,repeating_intent,PendingIntent.FLAG_UPDATE_CURRENT);
        return new NotificationCompat.Builder(getApplicationContext(), channelID)
                .setContentIntent(pendingIntent_fajr)
                .setContentTitle("Salah Reminder!")
                .setContentText("Its time for Isha")
                .setAutoCancel(true)
                .setDefaults(RingtonePreference.DEFAULT_ORDER)
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM))
                .setVibrate(new long[] { 0, 200, 100, 200 })
                .setSmallIcon(R.drawable.ic_launcher_foreground);
    }
}

