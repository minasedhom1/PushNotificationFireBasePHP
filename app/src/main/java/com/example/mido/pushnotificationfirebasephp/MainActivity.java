package com.example.mido.pushnotificationfirebasephp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("tok",refreshedToken);

    }

   // http://197.45.12.35/NotifyServices/api/ServiceNotify/?Id=Aya&Token=eJgG_Gpc92g:APA91bFQmYcvzn_c4svt6c08w4aLSggHH8qMlwNOtzFLAqjZvEp3jFY8YLyTdSxhtamXjJ9ovnTmP44lA4AYLNFvpqGmLD4J_GId2i6R4mIB92Qnm0sbMsPh-4BcxPhOG-mmP5_geGFr



}
