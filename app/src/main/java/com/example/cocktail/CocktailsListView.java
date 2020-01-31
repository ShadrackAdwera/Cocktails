package com.example.cocktail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CocktailsListView extends AppCompatActivity {


    private TextView mResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktails_list_view);

        mResultsTextView = findViewById(R.id.search_results);

        Intent intent = getIntent();
        String results = intent.getStringExtra("search");
        mResultsTextView.setText("Cocktails Found for: "+results);

    }
}
