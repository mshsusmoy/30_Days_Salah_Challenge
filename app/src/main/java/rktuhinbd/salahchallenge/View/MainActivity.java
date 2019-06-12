package rktuhinbd.salahchallenge.View;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;

import rktuhinbd.salahchallenge.Model.DatabaseHelper;
import rktuhinbd.salahchallenge.R;
import rktuhinbd.salahchallenge.ViewModel.AlertReceiver;
import rktuhinbd.salahchallenge.ViewModel.AlertReceiverDefault;
import rktuhinbd.salahchallenge.ViewModel.DefaultNotificationReceiver;

public class MainActivity extends AppCompatActivity {

    final long intervalPeriod = 1;
    AlarmManager mAlarmManager;

    private ImageView ivQuran, ivHadith, ivSalatChallenge, ivAlarm, ivDeliverance, ivReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivQuran = findViewById(R.id.iv_quran);
        ivHadith = findViewById(R.id.iv_hadith);
        ivSalatChallenge = findViewById(R.id.iv_salat);
        ivAlarm = findViewById(R.id.iv_alarm);
        ivDeliverance = findViewById(R.id.iv_deliverance);
        ivReset = findViewById(R.id.iv_reset);

        SetDefaultAlarm();

        //showNotification(this, "Assalamu Alaikum", "Read verse from Quran or read any Hadith");

        ivQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QuranActivity.class));
            }
        });

        ivHadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HadithActivity.class));
            }
        });

        ivSalatChallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SalahChallengeActivity.class));
            }
        });

        ivAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SalahReminderActivity.class));
            }
        });

        ivDeliverance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QuranActivity.class));
            }
        });

        ivReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper databaseHelper = new DatabaseHelper(MainActivity.this);
                databaseHelper.clearSalahInformation();
                Toast.makeText(getApplicationContext(), "Salah Record Cleared!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showNotification(Context context, String title, String body) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        int notificationId = 1;
        String channelId = "channel-01";
        String channelName = "Notification";
        int importance = NotificationManager.IMPORTANCE_HIGH;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, channelId)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle(title)
                .setContentText(body);

        notificationManager.notify(notificationId, mBuilder.build());
    }
    public void notification_method_call(Context context, String title, String body){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,9);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,1);
        Intent intent = new Intent(getApplicationContext(), DefaultNotificationReceiver.class);
        PendingIntent pendingIntent =  PendingIntent.getBroadcast(getApplicationContext(),100,intent,PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_HOUR,pendingIntent);

    }

    public void SetDefaultAlarm(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 21);
        c.set(Calendar.MINUTE, 38);
        c.set(Calendar.SECOND, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, AlertReceiverDefault.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 9, intent, 0);

        if (c.before(Calendar.getInstance())) {
            c.add(Calendar.DATE, 1);
        }

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),AlarmManager.INTERVAL_HALF_DAY,pendingIntent);
    }

}