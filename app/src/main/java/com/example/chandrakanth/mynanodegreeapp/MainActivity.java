package com.example.chandrakanth.mynanodegreeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.content.Context;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setContentView(View view) {
        int left = view.getLeft()+view.getWidth()/2;

        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This Button will launch the Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        View tview = toast.getView();
        System.out.println("Here in  - onClick3 [" + view.getLeft()+"," + view.getWidth()/2 + "," + tview.getWidth() +"]" );


        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL,  0,  view.getBottom()+view.getPaddingBottom()+view.getHeight());
        toast.show();
    }
}
