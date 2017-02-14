package com.example.mido.pushnotificationfirebasephp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by mido on 2/14/2017.
 */

public class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
   static String title,msg;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("tag", "From: " + remoteMessage.getFrom());
        Log.d("tag", "Notification Message Body: " + remoteMessage.getNotification().getBody());
      /* title=remoteMessage.getNotification().getTitle();*/
     /*   msg=remoteMessage.getNotification().getBody();*/
sendNotification(remoteMessage.getNotification().getBody());      //  Toast.makeText(MyFirebaseMessagingService.this.getApplicationContext(),remoteMessage.getNotification().getBody(),Toast.LENGTH_LONG).show();
    }








    private void sendNotification(String msg) {
        NotificationManager mNotificationManager = (NotificationManager)
                this.getSystemService(Context.NOTIFICATION_SERVICE);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                new Intent(this, MainActivity.class), 0);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this.getApplicationContext());
                        mBuilder.setSmallIcon(R.mipmap.ic_launcher)
                        //    .setNumber(++increase)
                        .setAutoCancel(true)
                        .setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE)
                        .setContentTitle("TheGroup")
                        .setContentText(msg);
        mBuilder.setContentIntent(contentIntent);
        mNotificationManager.notify(1, mBuilder.build());
    }

}
