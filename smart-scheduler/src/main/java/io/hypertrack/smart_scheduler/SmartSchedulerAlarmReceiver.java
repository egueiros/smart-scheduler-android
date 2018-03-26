package io.hypertrack.smart_scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by piyush on 25/11/16.
 */
public class SmartSchedulerAlarmReceiver extends BroadcastReceiver {
    private static final String TAG = SmartSchedulerAlarmReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent onAlarmReceiverServiceIntent = new Intent(context, SmartSchedulerAlarmReceiverService.class);
        onAlarmReceiverServiceIntent.putExtras(intent.getExtras());
        SmartSchedulerAlarmReceiverService.enqueueWork(context, SmartSchedulerAlarmReceiverService.class, 1, intent);
    }
}