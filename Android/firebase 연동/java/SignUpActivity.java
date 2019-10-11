package com.example.gbridge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener, FireBaseDBCallback {

    Button btn_idcheck, btn_signup, btn_cancel;
    EditText edt_id, edt_pw1, edt_pw2, edt_name, edt_phone;
    String id, pw1, name, phone, hobbies;
    int gender;
    RadioButton radioBtn1, radioBtn2;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        btn_idcheck = (Button)findViewById(R.id.btn_idcheck);
        btn_idcheck.setOnClickListener(this);
        btn_signup = (Button)findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(this);
        btn_cancel = (Button)findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);
        edt_id = (EditText)findViewById(R.id.edt_id);
        edt_pw1 = (EditText)findViewById(R.id.edt_pw1);
        edt_pw2 = (EditText)findViewById(R.id.edt_pw2);
        edt_name = (EditText)findViewById(R.id.edt_name);
        edt_phone = (EditText)findViewById(R.id.edt_phone);
        radioBtn1 = (RadioButton)findViewById(R.id.radioBtn1);
        radioBtn1.setChecked(true);
        radioBtn2 = (RadioButton)findViewById(R.id.radioBtn2);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
    }

    @Override
    public void onClick(View v) {
        id = edt_id.getText().toString();
        pw1 = edt_pw1.getText().toString();
        name = edt_name.getText().toString();
        phone = edt_phone.getText().toString();
        if(radioBtn1.isChecked()) gender = 0;
        else gender = 1;
        hobbies = "";
        if(checkBox1.isChecked()) hobbies += ":독서";
        if(checkBox2.isChecked()) hobbies += ":자전거";
        if(checkBox3.isChecked()) hobbies += ":음악 감상";
        if(checkBox4.isChecked()) hobbies += ":스포츠 관람";
        try { hobbies = hobbies.substring(1); } catch (Exception e) { }

        if(v.getId() == R.id.btn_idcheck) {
            FireBaseDBManager dbm = new FireBaseDBManager();
            dbm.addFirebaseDBCallback(this);
            dbm.readAllUserInfo();
        }
        else if(v.getId() == R.id.btn_signup) {
            if(!edt_pw1.getText().toString().equals(edt_pw2.getText().toString())) {
                Toast.makeText(this, "패스워드가 일치하지 않습니다.", Toast.LENGTH_LONG).show();
            }
            else if(id.equals("") || pw1.equals("") || name.equals("") || phone.equals("")) {
                Toast.makeText(this, "입력되지 않은 항목이 있습니다.", Toast.LENGTH_LONG).show();
            }
            else if(!(checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked())) {
                Toast.makeText(this, "취미를 하나 이상 선택해주세요.", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, "회원가입이 완료되었습니다.", Toast.LENGTH_LONG).show();

                Intent i = new Intent();
                UserInfo userInfo = new UserInfo(id, pw1, name, gender, hobbies);

                FireBaseDBManager dbm = new FireBaseDBManager();
                dbm.addFirebaseDBCallback(this);
                dbm.insertUserInfo(userInfo);

                Bundle bundle = new Bundle();
                bundle.putSerializable("info", userInfo);
                i.putExtras(bundle);

                setResult(RESULT_OK, i);
                finish();
            }
        }
        else if(v.getId() == R.id.btn_cancel) {
            finish();
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
                Toast.makeText(this, "중복된 아이디입니다!", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        Toast.makeText(this, "사용 가능한 아이디입니다!", Toast.LENGTH_SHORT).show();
    }
}
