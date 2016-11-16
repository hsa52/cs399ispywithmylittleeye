package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class viewscreen extends AppCompatActivity {

    private MainGlobal mainGlobal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewscreen);
        mainGlobal = (MainGlobal) this.getApplication();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable back navigation
        getSupportActionBar().setTitle(mainGlobal.cameras.get(mainGlobal.currentCamera));

        VideoView mVideoView = (VideoView) findViewById(R.id.videoView);

        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.start(); //need to make transition seamless.
            }
        });

        String uriPath = "android.resource://com.example.haydenpunchescamels.ispywithmylittleeye/" + R.raw.ghosties;
        Uri uri2 = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri2);
        mVideoView.requestFocus();
        mVideoView.start();



        Button deleteCamera = (Button) findViewById(R.id.deleteCamera);

        deleteCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainGlobal.cameras.remove(mainGlobal.currentCamera);
                Intent intent = new Intent(getApplicationContext(), devicelist.class);
                startActivity(intent);
            }
        });

        }
    }

