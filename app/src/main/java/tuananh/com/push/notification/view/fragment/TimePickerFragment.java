package tuananh.com.push.notification.view.fragment;

import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by framgia on 23/05/2017.
 */
public class TimePickerFragment extends DialogFragment {
    public static TimePickerFragment newInstance() {
        Bundle bundle = new Bundle();
        TimePickerFragment timePickerFragment = new TimePickerFragment();
        timePickerFragment.setArguments(bundle);
        return timePickerFragment;
    }
}
