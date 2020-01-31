package com.example.cocktail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

@BindView(R.id.explore_cocktails) Button exploreCocktails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        exploreCocktails.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        Toast.makeText(HomeActivity.this, "Pick Your Poison!!!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(HomeActivity.this, WelcomeActivity.class);
        startActivity(intent);
    }
}
