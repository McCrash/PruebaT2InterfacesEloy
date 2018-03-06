package com.example.eloy.pruebat2eloy;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity implements Animation.AnimationListener {

    TextView tv_titulo_splash;
    ImageView iv_fox_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);
        getSupportActionBar().hide();

        tv_titulo_splash = (TextView) findViewById(R.id.tv_titulo_splash);
        iv_fox_splash = (ImageView) findViewById(R.id.iv_fox_splash);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        tv_titulo_splash.setTypeface(myFont);

        Animation escalar = AnimationUtils.loadAnimation(this, R.anim.escalar);
        Animation caida = AnimationUtils.loadAnimation(this, R.anim.caida);
        tv_titulo_splash.startAnimation(escalar);
        iv_fox_splash.startAnimation(caida);

        escalar.setAnimationListener(this);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(getApplicationContext(), MyLogin.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}


