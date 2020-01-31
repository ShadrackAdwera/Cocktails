package com.example.cocktail;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CocktailsArrayAdapter extends ArrayAdapter {
    private Context context;
    private String[] mCocktails;
    private String[] mIngredients;

    public CocktailsArrayAdapter(Context context, int resource, String[] mCocktails, String[]mIngredients){
        super(context, resource);
    this.context = context;
    this.mCocktails = mCocktails;
    this.mIngredients = mIngredients;
    }

    @Override
    public int getCount(){
        return mIngredients.length;
    }
    @Override
    public Object getItem(int position){
    String cocktail = mCocktails[position];
    String ingredient = mIngredients[position];
    return String.format("Cocktail: "+cocktail+ "\n" + ingredient);
    }

}
