package com.example.roteironotificacao;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationManagerCompat;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("CANCEL_NOTIFICATION".equals(intent.getAction())) {

            NotificationManagerCompat.from(context).cancel(1);
        }
    }
}

