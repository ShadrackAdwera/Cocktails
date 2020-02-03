package com.example.cocktail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.search_cocktail) EditText searchCocktailText;
    @BindView(R.id.btn_search_by_name) Button btnSearchByName;
    @BindView(R.id.btn_search_by_ingredient) Button btnSearchByIngredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        btnSearchByName.setOnClickListener(this);
        btnSearchByIngredient.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if(searchCocktailText.getText().toString().length() < 1 && v==btnSearchByName){
            Toast.makeText(getApplicationContext(), "Please enter a text", Toast.LENGTH_LONG).show();
        } else if(searchCocktailText.getText().toString().length() < 1 && v==btnSearchByIngredient){
            Toast.makeText(getApplicationContext(), "Please enter a text", Toast.LENGTH_LONG).show();
        }
        if(v==btnSearchByName){
            String search = searchCocktailText.getText().toString();
            Intent intent = new Intent(WelcomeActivity.this, CocktailsListView.class);
            intent.putExtra("search", search);
            startActivity(intent);
        } else if(v==btnSearchByIngredient){
            String search = searchCocktailText.getText().toString();
            Intent intent = new Intent(WelcomeActivity.this, CocktailsListView.class);
            intent.putExtra("search", search);
            startActivity(intent);
        }
    }
}
