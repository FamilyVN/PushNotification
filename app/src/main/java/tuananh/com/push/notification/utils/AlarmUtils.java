package tuananh.com.push.notification.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import java.util.Calendar;

import tuananh.com.push.notification.Constant;
import tuananh.com.push.notification.service.SchedulingService;

/**
 * Created by framgia on 23/05/2017.
 */
public class AlarmUtils {
    private static int INDEX = 1;

    public static void create(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, SchedulingService.class);
        for (int i = 0; i < 10; i++) {
            intent.putExtra(Constant.KEY_TYPE, INDEX);
            PendingIntent pendingIntent =
                PendingIntent.getService(context, INDEX, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            INDEX++;
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.MINUTE, INDEX);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                alarmManager
                    .setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
            } else {
                alarmManager
                    .set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
            }
        }
    }
}
