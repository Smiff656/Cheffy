package com.example.cheffy380;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import java.util.ArrayList;

import java.sql.Array;

public class LaunchRecipesActivity extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12;
    Button btnReset,btnSubmit;
    ArrayList selected = new ArrayList<String>() ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_recipes);
        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);
        cb5 = findViewById(R.id.checkBox5);
        cb6 = findViewById(R.id.checkBox6);
        cb7 = findViewById(R.id.checkBox7);
        cb8 = findViewById(R.id.checkBox8);
        cb9 = findViewById(R.id.checkBox9);
        cb10 = findViewById(R.id.checkBox10);
        cb11 = findViewById(R.id.checkBox11);
        cb12 = findViewById(R.id.checkBox12);
        btnReset = findViewById(R.id.button4);
        btnSubmit = findViewById(R.id.button5);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             selected.clear();
                                             if (cb1.isChecked() && (cb10.isChecked()||cb2.isChecked()) && cb3.isChecked() && cb4.isChecked() && cb5.isChecked() && cb6.isChecked()) {
                                                 selected.add("Pasta");
                                             }
                                             if (cb1.isChecked() && (cb10.isChecked()||cb2.isChecked()) && cb3.isChecked() && cb4.isChecked() && cb5.isChecked() && cb6.isChecked() && cb7.isChecked()) {
                                                 selected.add("Pasta With Chicken");
                                             }
                                             if (cb9.isChecked() && (cb10.isChecked()||cb2.isChecked()) && cb3.isChecked()){
                                                 selected.add("Steak");
                                             }
                                             if(cb8.isChecked() && (cb10.isChecked()||cb2.isChecked()) && cb4.isChecked() && cb3.isChecked()){
                                                 selected.add("Roasted Chicken");
                                             }
                                             if(cb7.isChecked() && (cb10.isChecked()||cb2.isChecked()) && cb4.isChecked() && cb3.isChecked()){
                                                 selected.add("Chicken Breast");
                                             }
                                             if (cb11.isChecked() && cb12.isChecked() && (cb10.isChecked()||cb2.isChecked()) && cb6.isChecked() && cb4.isChecked()){
                                                 selected.add("Burger");
                                             }

                                             System.out.println(selected);
                                             //Start Search





                                         }
                                     });


        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    cb1.setChecked(false);
                    cb2.setChecked(false);
                    cb3.setChecked(false);
                    cb4.setChecked(false);
                    cb5.setChecked(false);
                    cb6.setChecked(false);
                    cb7.setChecked(false);
                    cb8.setChecked(false);
                    cb9.setChecked(false);
                    cb10.setChecked(false);
                    cb11.setChecked(false);
                    cb12.setChecked(false);
                    selected.clear();
                System.out.println(selected);
            }

        });
    }


}