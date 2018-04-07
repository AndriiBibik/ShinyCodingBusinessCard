package com.example.android.shinycodingbusinesscard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayDate();
    }

    //Getting current date and return as a String
    private String getFormatedDate(){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("E d MMM y");
        return df.format(c.getTime());
    }

    //Displaying current date
    private void displayDate(){
        TextView currentDate = (TextView) findViewById(R.id.current_date);
        currentDate.setText(getFormatedDate());
    }
}
