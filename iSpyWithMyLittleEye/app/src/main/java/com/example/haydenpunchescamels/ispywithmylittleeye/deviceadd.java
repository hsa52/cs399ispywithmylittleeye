package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.content.res.Resources;
import android.support.v4.app.NotificationCompat;

public class deviceadd extends AppCompatActivity {

    private MainGlobal mainGlobal;

    private EditText cameraName;
    private Spinner cameraType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deviceadd);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable back navigation
        mainGlobal = (MainGlobal) this.getApplication();

        initNavigationListeners();

    }

    private void initNavigationListeners() {
        // Set play button listener
        findViewById(R.id.addDevice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText deviceName = (EditText) findViewById(R.id.deviceName);
                EditText cameraType = (EditText) findViewById(R.id.chooseDevice);
                mainGlobal.cameras.add(deviceName.getText().toString()+ " " + cameraType.getText().toString() );

                Intent intent = new Intent(getApplicationContext(), devicelist.class);
                startActivity(intent);
            }
        });
    }


}
