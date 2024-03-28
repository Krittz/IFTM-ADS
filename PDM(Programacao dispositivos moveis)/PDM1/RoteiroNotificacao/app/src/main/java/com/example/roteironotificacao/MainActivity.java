package com.example.roteironotificacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String NOTIFICATION_COUNT_KEY = "notification_count";

    private int notificationCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        if (getIntent().getAction() != null && getIntent().getAction().equals("NOTIFICATION_CLICKED")) {
            notificationCount = 0;
            SharedPreferences.Editor editor = sharedPrefs.edit();
            editor.putInt(NOTIFICATION_COUNT_KEY, notificationCount);
            editor.apply();
        } else {
            notificationCount = sharedPrefs.getInt(NOTIFICATION_COUNT_KEY, 0);
        }

        AppCompatButton btnNotify = findViewById(R.id.btn);
        btnNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationCount++;
                notificar(notificationCount);
            }
        });
    }

    public void notificar(int count) {
        NotificationManagerCompat notify = NotificationManagerCompat.from(this);
        String ID_CANAL = "id_notificacao_01";
        int ID_NOT = 1;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(ID_CANAL, "Minha notificação", NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.setDescription("Descrição do canal de notificação");
            notify.createNotificationChannel(notificationChannel);
        }

        String notificationText = (count == 1) ?
                "Você recebeu 1 notificação" :
                "Você recebeu " + count + " notificações";

        Intent cancelIntent = new Intent(this, NotificationReceiver.class);
        cancelIntent.setAction("CANCEL_NOTIFICATION");
        PendingIntent cancelPendingIntent = PendingIntent.getBroadcast(this, 0, cancelIntent, PendingIntent.FLAG_CANCEL_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        Intent mainIntent = new Intent(this, MainActivity.class);
        mainIntent.setAction("NOTIFICATION_CLICKED");
        mainIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent mainPendingIntent = PendingIntent.getActivity(this, 0, mainIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, ID_CANAL);
        notificationBuilder.setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_ALL)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Notificações")
                .setContentText(notificationText)
                .setContentInfo("Info")
                .addAction(R.drawable.ic_cancel, "Cancelar", cancelPendingIntent)
                .setContentIntent(mainPendingIntent);

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        notify.notify(ID_NOT, notificationBuilder.build());
    }
}
