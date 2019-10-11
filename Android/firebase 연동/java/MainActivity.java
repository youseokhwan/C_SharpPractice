package com.example.gbridge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FireBaseDBCallback {

    EditText edt_id, edt_pw;
    Button btn_login, btn_signup, btn_bgm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
        btn_signup = (Button)findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(this);
        btn_bgm = (Button)findViewById(R.id.btn_bgm);
        btn_bgm.setOnClickListener(this);
        edt_id = (EditText)findViewById(R.id.edt_id);
        edt_pw = (EditText)findViewById(R.id.edt_pw);

//        UserInfo userInfo = new UserInfo("testid2", "pw123", "지브리지", 0, "영화보기:게임하기");
//
//        FireBaseDBManager dbm = new FireBaseDBManager();
//        dbm.addFirebaseDBCallback(this);
//        dbm.insertUserInfo(userInfo);
    }

    @Override
    protected void onPause() {
        super.onPause();
        edt_id.setText("");
        edt_pw.setText("");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_login) {
            FireBaseDBManager dbm = new FireBaseDBManager();
            dbm.addFirebaseDBCallback(this);
            dbm.readAllUserInfo();
        }
        else if(v.getId() == R.id.btn_signup) {
            Intent i = new Intent(this, SignUpActivity.class);
            startActivityForResult(i, 11);
        }
        else if(v.getId() == R.id.btn_bgm) {
            Intent i = new Intent(this, MyService.class);
            startService(i);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        try {
            UserInfo userInfo = (UserInfo)data.getExtras().getSerializable("info");

            edt_id.setText(userInfo.id);
            edt_pw.setText(userInfo.password);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeResult(boolean flag) {

    }

    @Override
    public void updateResult(boolean flag) {

    }

    @Override
    public void readResult(UserInfo info, boolean flag) {

    }

    @Override
    public void readAllResult(ArrayList<UserInfo> infolist, boolean flag) {
        for (UserInfo temp : infolist) {
            if(temp.id.equals(edt_id.getText().toString())) {
                if(temp.password.equals(edt_pw.getText().toString())) {
                    Intent i = new Intent(this, Main2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("info", temp);
                    i.putExtras(bundle);
                    startActivity(i);
                    return;
                }
            }
        }
        Toast.makeText(this, "일치하는 아이디나 비밀번호가 없습니다.", Toast.LENGTH_SHORT).show();
    }
}
