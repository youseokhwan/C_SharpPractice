package com.example.gbridge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    UserInfo userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        userInfo = (UserInfo)i.getExtras().getSerializable("info");

        Toast.makeText(this, "환영합니다. " + userInfo.name + "님", Toast.LENGTH_SHORT).show();
    }
}
