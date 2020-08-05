package com.example.cicra.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class Splash extends AwesomeSplash {
    @Override
    public void initSplash(ConfigSplash configSplash) {

        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.colorPrimaryDark); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_BOTTOM);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM);


        //Customize Logo
        configSplash.setLogoSplash(R.drawable.game); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        //Customize Title
        configSplash.setTitleSplash("Tic Tac Toe");
        // configSplash.setTitleTextColor(R.color.Wheat);
        configSplash.setTitleTextSize(20f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);

    }

    @Override
    public void animationsFinished() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}