package com.telkom.telkomabsen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateView = (TextView)findViewById(R.id.txt_date);
        setDate(dateView);
        final TextView timeView = (TextView)findViewById(R.id.txt_time);


        final Handler someHandler = new Handler(getMainLooper());
        someHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                timeView.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
                someHandler.postDelayed(this, 1000);
            }
        }, 10);

    }
    public void setDate (TextView view){

        Date today = Calendar.getInstance().getTime();//getting date
        SimpleDateFormat formatter = new SimpleDateFormat("EEE dd MMM yyyy");//formating according to my need
        String date = formatter.format(today);
        view.setText(date);
    }

}