package com.example.cocktail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CocktailsListView extends AppCompatActivity {

    String[] cocktails = new String[]{"Long Island","Mojito","Matini","Manhattan","Bloody Mary","Margarita","Old Fashioned","Daiquiri","Gin and Tonic","Screw Driver","Gimlet"};
    String[] ingredients = new String[]{"Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients...","Ingredients..."};

    @BindView(R.id.cocktail_list) ListView cocktailsListView;
    private TextView mResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktails_list_view);
        ButterKnife.bind(this);

        mResultsTextView = findViewById(R.id.search_results);
        CocktailsArrayAdapter cocktailsArrayAdapter = new CocktailsArrayAdapter(this, android.R.layout.simple_list_item_1, cocktails, ingredients);
        cocktailsListView.setAdapter(cocktailsArrayAdapter);

        Intent intent = getIntent();
        String results = intent.getStringExtra("search");
        mResultsTextView.setText("Cocktails Found for: "+results);

    }
}
