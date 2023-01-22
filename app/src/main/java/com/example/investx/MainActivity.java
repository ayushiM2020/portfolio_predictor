package com.example.investx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    int[] images = {R.drawable.stock_icon, R.drawable.real_estate_icon, R.drawable.bonds_icon};
    int currentPageCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.main_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(1500);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new SlideAdapter(images, MainActivity.this));
        viewPager.setClickable(true);

        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            @Override
            public void run() {
                Log.d("TAG", "CURR_PAGE_COUNT: " + currentPageCounter);
                if (currentPageCounter == images.length) {
                    currentPageCounter = 0;
                }

                viewPager.setCurrentItem(currentPageCounter, true);
            }
        };

        Button analyzeButton = findViewById(R.id.id_analyze_button);
        analyzeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Please visit our website as this feature is currently under construction", Toast.LENGTH_LONG).show();
            }
        });

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
                currentPageCounter++;
            }
        }, 2500, 2500);
    }

    public void buttonPopupwindow(View view) {
        openDialog();
    }

    public void openDialog() {
        InfoDialog infoDialog = new InfoDialog(currentPageCounter);
        infoDialog.show(getSupportFragmentManager(), "info dialog");
    }
}