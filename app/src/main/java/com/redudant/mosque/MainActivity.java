package com.redudant.mosque;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.LocalTime;
import java.time.temporal.TemporalField;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    ImageView ivBG;
    TextView tvDay,tvDMYMasehi,tvDMYHijriah, tvNameMasjid,
            tvAddMasjid, tvNoHp, tvTime,timeSchedule, tvImsyak, tvTimeImsyak,
            tvShubuh, tvTimeShubuh, tvDzuhur, tvTimeDzuhur, tvAshar, tvTimeAshar,
            tvMagrib, tvTimeMagrib, tvIsya, tvTimeIsya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDay = findViewById(R.id.tvDay);
        tvDMYMasehi = findViewById(R.id.tvDMYMasehi);
        tvDMYHijriah = findViewById(R.id.tvDMYHijriah);
        tvNameMasjid = findViewById(R.id.tvNameMasjid);
        tvAddMasjid = findViewById(R.id.tvAddMasjid);
        tvNoHp = findViewById(R.id.tvNoHp);
        tvTime = findViewById(R.id.tvTime);
        timeSchedule = findViewById(R.id.timeSchedule);
        tvImsyak = findViewById(R.id.tvImsyak);
        tvTimeImsyak = findViewById(R.id.tvTimeImsyak);
        tvShubuh = findViewById(R.id.tvShubuh);
        tvTimeShubuh = findViewById(R.id.tvTimeShubuh);
        tvDzuhur = findViewById(R.id.tvDzuhur);
        tvTimeDzuhur = findViewById(R.id.tvTimeDzuhur);
        tvAshar = findViewById(R.id.tvAshar);
        tvMagrib = findViewById(R.id.tvMagrib);
        tvTimeMagrib = findViewById(R.id.tvTimeMagrib);
        tvIsya = findViewById(R.id.tvIsya);
        tvTimeIsya = findViewById(R.id.tvTimeIsya);

       LocalTime objTime = LocalTime.now();

        // textView is the TextView view that should display it
        tvTime.setText(objTime);

    }

}
