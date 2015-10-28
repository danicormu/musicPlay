package com.example.so.musicpower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class playActivity extends AppCompatActivity {

    private ImageView btnPlay;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        btnPlay = (ImageView) findViewById(R.id.play_Music);
        buttonTest();
    }

    public void buttonTest() {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    btnPlay.setImageResource(R.mipmap.ic_pause);
                    flag = false;
                } else {
                    btnPlay.setImageResource(R.mipmap.ic_play);
                    flag = true;
                }
            }
        });
    }
}
