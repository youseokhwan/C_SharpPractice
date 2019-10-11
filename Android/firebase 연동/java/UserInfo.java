//package com.example.gbridge;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//
//public class UserInfo implements Serializable {
//    String id;
//    String password;
//    String name;
//    String phone;
//    boolean gender;
//    ArrayList<String> hobbies;
//
//    public String getId() {
//        return this.id;
//    }
//
//    public String getPassword() {
//        return this.password;
//    }
//
//    public UserInfo() {}
//
//    public UserInfo(String id, String password, String name, String phone, boolean gender, ArrayList<String> hobbies) {
//        this.id = id;
//        this.password = password;
//        this.name = name;
//        this.phone = phone;
//        this.gender = gender;
//        this.hobbies = hobbies;
//    }
//}

package com.example.gbridge;

import java.io.Serializable;

public class UserInfo implements Serializable {
    public String id;
    public String password;
    public String name;
    public String gender;
    public String hobby;

    public UserInfo() {

    }

    public UserInfo(String id, String pw, String name, int gender, String hobby) {
        this.id = id;
        this.password = pw;
        this.name = name;
        if(gender == 0 || gender == 1)
            this.gender = String.valueOf(gender);
        else
            this.gender = String.valueOf(0);
        this.hobby = hobby;
    }
}
