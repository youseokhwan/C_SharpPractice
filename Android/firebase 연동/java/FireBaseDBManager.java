package com.example.gbridge;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Map;
import androidx.annotation.NonNull;

public class FireBaseDBManager {

    FireBaseDBCallback callback_instance = null;
    private DatabaseReference mDatabase;

    public FireBaseDBManager(){
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public void addFirebaseDBCallback(FireBaseDBCallback callback_instance){
        this.callback_instance = callback_instance;
    }

    public void insertUserInfo(UserInfo info){
        mDatabase.child("users").child(info.id).setValue(info).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                if(callback_instance != null)
                    callback_instance.writeResult(true);
            }
        })
        .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                if(callback_instance != null)
                    callback_instance.writeResult(false);
            }
        });
    }

    public void updateUserInfo(UserInfo info){
        mDatabase.child("users").child(info.id).setValue(info).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                if(callback_instance != null)
                    callback_instance.updateResult(true);
            }
        })
        .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                if(callback_instance != null)
                    callback_instance.updateResult(false);
            }
        });
    }

    public void readUserInfo(String id){
        DatabaseReference ref = mDatabase.child("users").child(id);
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                UserInfo user = makeUser((Map<String,Object>) dataSnapshot.getValue());
                if(callback_instance != null){
                    callback_instance.readResult(user, true);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                if(callback_instance != null){
                    callback_instance.readResult(null, false);
                }
            }
        });
    }


    public void readAllUserInfo(){
        DatabaseReference ref = mDatabase.child("users");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ArrayList<UserInfo> list = makeUserList((Map<String,Object>) dataSnapshot.getValue());
                if(callback_instance != null){
                    callback_instance.readAllResult(list, true);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                if(callback_instance != null){
                    callback_instance.readAllResult(null, false);
                }
            }
        });
    }

    private UserInfo makeUser(Map<String,Object> users){
        String id = (String)users.get("id");
        String pw = (String)users.get("password");
        String name = (String)users.get("name");
        String gender = (String)users.get("gender");
        String hobby = (String)users.get("hobby");

        UserInfo info = new UserInfo(id, pw, name, Integer.parseInt(gender), hobby);
        return info;
    }

    private ArrayList<UserInfo> makeUserList(Map<String,Object> users) {
        ArrayList<UserInfo> user_list = new ArrayList<>();

        for (Map.Entry<String, Object> entry : users.entrySet()){
            Map singleUser = (Map) entry.getValue();
            String id = (String)singleUser.get("id");
            String pw = (String)singleUser.get("password");
            String name = (String)singleUser.get("name");
            String gender = (String)singleUser.get("gender");
            String hobby = (String)singleUser.get("hobby");

            UserInfo info = new UserInfo(id, pw, name, Integer.parseInt(gender), hobby);
            user_list.add(info);
        }
        return user_list;
    }
}
