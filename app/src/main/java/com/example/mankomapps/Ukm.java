package com.example.mankomapps;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ukm extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    ActionBar actionBar;

    private Button grafis, kappa, kmf, cosmic, cinema, fokus, baskom, bki, imkk, kj21, radioland, majalah, senisunda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukm);
        toolbar = findViewById(R.id.toolbar2);
        grafis = (Button) findViewById(R.id.grafis);
        kappa = (Button) findViewById(R.id.kappa);
        kmf = (Button) findViewById(R.id.kmf);
        cosmic = (Button) findViewById(R.id.cosmic);
        cinema = (Button) findViewById(R.id.cinema);
        fokus = (Button) findViewById(R.id.fokus);
        baskom = (Button) findViewById(R.id.baskom);
        bki = (Button) findViewById(R.id.bki);
        imkk = (Button) findViewById(R.id.imkk);
        kj21 = (Button) findViewById(R.id.kj21);
        radioland = (Button) findViewById(R.id.radioland);
        majalah = (Button) findViewById(R.id.majalah);
        senisunda = (Button) findViewById(R.id.senisunda);

        grafis.setOnClickListener(this);
        kappa.setOnClickListener(this);
        kmf.setOnClickListener(this);
        cosmic.setOnClickListener(this);
        cinema.setOnClickListener(this);
        fokus.setOnClickListener(this);
        baskom.setOnClickListener(this);
        bki.setOnClickListener(this);
        imkk.setOnClickListener(this);
        kj21.setOnClickListener(this);
        radioland.setOnClickListener(this);
        majalah.setOnClickListener(this);
        senisunda.setOnClickListener(this);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar2_text);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.grafis:
                String url = "https://www.instagram.com/kgf_unpad";
                i = new Intent(Intent.ACTION_VIEW); i.setData(Uri.parse(url));startActivity(i);break;
            case R.id.kappa:
                String url2 = "https://www.instagram.com/kappafikom";
                i = new Intent(Intent.ACTION_VIEW); i.setData(Uri.parse(url2));startActivity(i);break;
            case R.id.kmf:
                String url3 = "https://www.instagram.com/kmf_unpad";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url3));startActivity(i);break;
            case R.id.cosmic:
                String url4 = "https://www.instagram.com/cosmicunpad";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url4));startActivity(i);break;
            case R.id.cinema:
                String url5 = "https://www.instagram.com/ccfikomunpad";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url5));startActivity(i);break;
            case R.id.fokus:
                String url6 = "https://www.instagram.com/fokus.unpad";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url6));startActivity(i);break;
            case R.id.baskom:
                String url7 = "https://www.instagram.com/baskom_unpad";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url7));startActivity(i);break;
            case R.id.bki:
                String url8 = "https://www.instagram.com/kangzaidbki";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url8));startActivity(i);break;
            case R.id.imkk:
                String url9 = "https://www.instagram.com/imkk_fikomunpad";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url9));startActivity(i);break;
            case R.id.kj21:
                String url10 = "https://www.instagram.com/kj21fikom";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url10));startActivity(i);break;
            case R.id.radioland:
                String url11 = "https://www.instagram.com/funradio1078";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url11));startActivity(i);break;
            case R.id.majalah:
                String url12 = "https://www.instagram.com/djatinangornews";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url12));startActivity(i);break;
            case R.id.senisunda:
                String url13 = "https://twitter.com/senisundafikom";
                i = new Intent (Intent.ACTION_VIEW); i.setData(Uri.parse(url13));startActivity(i);break;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}