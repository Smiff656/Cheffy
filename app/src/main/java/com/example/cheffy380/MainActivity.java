package com.example.cheffy380;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void About(View v){
        Intent A = new Intent(this, AboutActivity.class);
        startActivity(A);

    }
    public void LaunchRecipes(View v){
        Intent B = new Intent(this, LaunchRecipesActivity.class);
        startActivity(B);

    }
    public void Diet(View v) {
        Intent C = new Intent(this, DietActivity.class);
        startActivity(C);
    }
}