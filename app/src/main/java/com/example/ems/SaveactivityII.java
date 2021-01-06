package com.example.ems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SaveactivityII extends AppCompatActivity {
    Button saveBtn;
    TextView getFood;
    public String sGetFood,sUserEmail;
    DatabaseReference databaseReference;
    String keyMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saveii);
        getFood=findViewById(R.id.etTakeFood);
        saveBtn=findViewById(R.id.btnSaveFood);
        keyMail=LoginForDriver.userMail;
        keyMail=keyMail.replace(".","");
        keyMail=keyMail.replace("#","");
        keyMail=keyMail.replace("$","");
        keyMail=keyMail.replace("]","");
        keyMail=keyMail.replace("[","");
        databaseReference= FirebaseDatabase.getInstance().getReference("Foods");
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveInfo();
                Intent intent=new Intent(getApplicationContext(),MapsActivityForDriver.class);
                startActivity(intent);

            }
        });
    }
    public void saveInfo(){
        saveFood sf=new saveFood(getFood.getText().toString());
        databaseReference.child(keyMail).setValue(sf);
    }
}
