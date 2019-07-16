package com.aac.nandroid.runtimepermissions;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                requestPermissions(new String[]{
                        Manifest.permission.READ_CONTACTS,
                                Manifest.permission.CAMERA,
                                Manifest.permission.INTERNET,
                                Manifest.permission.NFC,
                                Manifest.permission.READ_CALENDAR,
                                Manifest.permission.READ_CALL_LOG,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                                Manifest.permission.ACCESS_COARSE_LOCATION,
                                Manifest.permission.READ_SMS,
                                Manifest.permission.ACCESS_FINE_LOCATION,
                                Manifest.permission.ACCESS_NETWORK_STATE,
                                Manifest.permission.ACCESS_WIFI_STATE,
                                Manifest.permission.BLUETOOTH
                        },
                        PackageManager.PERMISSION_GRANTED);
            }
        });
    }
}
