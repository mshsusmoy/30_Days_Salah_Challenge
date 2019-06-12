package rktuhinbd.salahchallenge.ViewModel;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.Build;
import android.preference.RingtonePreference;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import rktuhinbd.salahchallenge.R;
import rktuhinbd.salahchallenge.View.MainActivity;

public class NotificationHelper_Asr extends ContextWrapper {
    public static final String channelID = "channelID";
    public static final String channelName = "Channel Name";

    private MediaPlayer player;
    private NotificationManager mManager;

    public NotificationHelper_Asr(Context base) {
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
        PendingIntent pendingIntent_fajr =  PendingIntent.getActivity(getApplicationContext(),3,repeating_intent,PendingIntent.FLAG_UPDATE_CURRENT);
        player = MediaPlayer.create(getApplicationContext(), Settings.System.DEFAULT_ALARM_ALERT_URI);
        player.setLooping(true);
        player.start();
        return new NotificationCompat.Builder(getApplicationContext(), channelID)
                .setContentIntent(pendingIntent_fajr)
                .setContentTitle("Salah Reminder!")
                .setContentText("Its time for Asr")
                .setAutoCancel(false)
                .setDefaults(RingtonePreference.DEFAULT_ORDER)
                .setVibrate(new long[] { 0, 200, 100, 200 })
                .setSmallIcon(R.drawable.ic_launcher_foreground);
    }
}

