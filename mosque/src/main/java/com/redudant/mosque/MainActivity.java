package com.redudant.mosque;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    ImageView ivBG;
    TextView tvDay, tvDMYMasehiq, tvDMYHijriah, tvNameMasjid,
            tvAddMasjid, tvNoHp, tvTimeq, timeSchedule, tvImsyak, tvTimeImsyak,
            tvShubuh, tvTimeShubuh, tvDzuhur, tvTimeDzuhur, tvAshar, tvTimeAshar,
            tvMagrib, tvTimeMagrib, tvIsya, tvTimeIsya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialWork();

        timeDate();

    }

    public void timeDate() {

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                //Date
                                long tvDMYMasehi = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                                String dateString = sdf.format(tvDMYMasehi);
                                tvDMYMasehiq.setText(dateString);

                                //Time
                                Time();
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();
    }

    public void initialWork() {

        tvDay = findViewById(R.id.tvDay);
        tvDMYMasehiq = findViewById(R.id.tvDMYMasehi);
        tvDMYHijriah = findViewById(R.id.tvDMYHijriah);
        tvNameMasjid = findViewById(R.id.tvNameMasjid);
        tvAddMasjid = findViewById(R.id.tvAddMasjid);
        tvNoHp = findViewById(R.id.tvNoHp);
        tvTimeq = findViewById(R.id.tvTime);
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
    }

    public void Time() {
        long tvDMYMasehi = System.currentTimeMillis();
        SimpleDateFormat sdftvTimeq = new SimpleDateFormat("HH:mm:ss a");
        String dateStringtvTimeq = sdftvTimeq.format(tvDMYMasehi);
        tvTimeq.setText(dateStringtvTimeq);
    }

}