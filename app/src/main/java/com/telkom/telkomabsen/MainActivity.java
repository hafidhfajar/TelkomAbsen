package com.telkom.telkomabsen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dateView = (TextView)findViewById(R.id.txt_date);
        setDate(dateView);
        TextView timeView = (TextView)findViewById(R.id.txt_time);
        setTime(timeView);

    }
    public void setDate (TextView view){

        Date today = Calendar.getInstance().getTime();//getting date
        SimpleDateFormat formatter = new SimpleDateFormat("EEE dd MMM yyyy");//formating according to my need
        String date = formatter.format(today);
        view.setText(date);
    }
    public void setTime (TextView view){

        Date today = Calendar.getInstance().getTime();//getting date
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");//formating according to my need
        String time = formatter.format(today);
        view.setText(time);
    }
}