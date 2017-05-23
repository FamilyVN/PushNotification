package tuananh.com.push.notification.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tuananh.com.push.notification.R;
import tuananh.com.push.notification.utils.AlarmUtils;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlarmUtils.create(this);
    }
}
