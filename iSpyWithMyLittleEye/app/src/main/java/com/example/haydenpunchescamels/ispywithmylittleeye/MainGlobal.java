package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.app.Application;
import android.provider.Settings;

import java.util.ArrayList;

/**
 * Created by Kaina on 11/9/16.
 */

public class MainGlobal extends Application {
    public ArrayList<String> cameras;
    public int currentCamera = -1;


    public MainGlobal() {
        this.cameras = new ArrayList<String>();
    }


}