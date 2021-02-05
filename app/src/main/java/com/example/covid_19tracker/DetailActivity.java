package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCOuntry;
    TextView country,deaths,todayDeaths,cases,todayCases,recovered,critial,active;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent=getIntent();
        positionCOuntry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of " + AffectedCountries.countryModels.get(positionCOuntry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        country=findViewById(R.id.tvCountry);
        deaths=findViewById(R.id.tvDeaths);
        todayDeaths=findViewById(R.id.tvtodayDeaths);
        cases=findViewById(R.id.tvCases);
        todayCases=findViewById(R.id.tvtodayCases);
        recovered=findViewById(R.id.tvRecovered);
        critial=findViewById(R.id.tvCritical);
        active=findViewById(R.id.tvActive);

        country.setText(AffectedCountries.countryModels.get(positionCOuntry).getCountry());
        deaths.setText(AffectedCountries.countryModels.get(positionCOuntry).getDeaths());
        todayDeaths.setText(AffectedCountries.countryModels.get(positionCOuntry).getTodayDeaths());
        cases.setText(AffectedCountries.countryModels.get(positionCOuntry).getCases());
        todayCases.setText(AffectedCountries.countryModels.get(positionCOuntry).getTodayCases());
        recovered.setText(AffectedCountries.countryModels.get(positionCOuntry).getRecovered());
        critial.setText(AffectedCountries.countryModels.get(positionCOuntry).getCritial());
        active.setText(AffectedCountries.countryModels.get(positionCOuntry).getActive());

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}