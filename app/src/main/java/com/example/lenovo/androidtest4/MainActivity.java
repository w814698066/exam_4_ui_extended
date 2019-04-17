package com.example.lenovo.androidtest4;

import android.preference.PreferenceActivity;
import android.os.Bundle;
public class MainActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mypreference);
//        setContentView(R.layout.activity_main);
    }
}
