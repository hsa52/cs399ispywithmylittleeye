package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class devicelist extends AppCompatActivity {

    public MainGlobal mainGlobal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devicelist);
        mainGlobal = (MainGlobal) this.getApplication();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable back navigation

        initNavigationListeners();

        ListView lv = (ListView) findViewById(R.id.devices);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                mainGlobal.cameras );

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mainGlobal.currentCamera = position;
                Intent intent = new Intent(getApplicationContext(), viewscreen.class);
                startActivity(intent);
            }
        });



    }

    private void initNavigationListeners() {
        findViewById(R.id.edit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), editdevice.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), deviceadd.class);
                startActivity(intent);
            }
        });

    }

}
