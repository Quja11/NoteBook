package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickFindBeer(View view) {
        Spinner color = findViewById(R.id.color);
        TextView brands = findViewById(R.id.brands);

        String type = String.valueOf(color.getSelectedItem());

        BeerExpert expert = new BeerExpert();
        List<String> recom = expert.getBrands(type);

        StringBuilder result = new StringBuilder();
        for(String beer : recom ){
            result.append(beer);
            result.append("\n");
        }

        brands.setText(result);
    }












}

