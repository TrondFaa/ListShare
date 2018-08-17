package com.back4app.quickstartexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseQuery;

public class MainActivity extends AppCompatActivity {

    TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Display layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connecting tvTest with view tvTest in layout
        tvTest = (TextView)findViewById(R.id.tvTest);

        ParseQuery<ParseObject> query = ParseQuery.getQuery("List");
    }
}
