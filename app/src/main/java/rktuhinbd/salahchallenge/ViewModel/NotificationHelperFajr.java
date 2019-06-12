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
import rktuhinbd.salahchallenge.View.MainActivity;

public class NotificationHelperFajr extends ContextWrapper {
    public static final String channelID = "channelID";
    public static final String channelName = "Channel Name";

    private NotificationManager mManager;

    public NotificationHelperFajr(Context base) {
        super(base);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannel();
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel channel = new NotificationChannel(channelID, channelName, NotificationManager.IMPORTANCE_HIGH);

        getManager().createNotificationChannel(channel);
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
        PendingIntent pendingIntent_fajr =  PendingIntent.getActivity(getApplicationContext(),1,repeating_intent,PendingIntent.FLAG_UPDATE_CURRENT);
        return new NotificationCompat.Builder(getApplicationContext(), channelID)
                .setContentIntent(pendingIntent_fajr)
                .setContentTitle("Salah Reminder!")
                .setContentText("Its time for Fajr")
                .setAutoCancel(true)
                .setDefaults(RingtonePreference.DEFAULT_ORDER)
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM))
                .setVibrate(new long[] { 0, 200, 100, 200 })
                .setSmallIcon(R.drawable.ic_launcher_foreground);
    }
}