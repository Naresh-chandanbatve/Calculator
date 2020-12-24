package com.example.calculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class option extends AppCompatActivity {
float x1, y1, x2,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);


        final TextView about = findViewById(R.id.about);
        final TextView contact = findViewById(R.id.contact);
        final TextView bug = findViewById(R.id.bug);
        final TextView back = findViewById(R.id.exit);


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abtdev = new Intent(Intent.ACTION_VIEW);
                abtdev.setData(Uri.parse("http://naresh.scienceontheweb.net/about.html"));
                startActivity( abtdev);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent devcon = new Intent(Intent.ACTION_VIEW);
                devcon.setData(Uri.parse("http://naresh.scienceontheweb.net/contact.html"));
                startActivity(devcon);
            }
        });

        bug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bugr = new Intent(Intent.ACTION_SENDTO);
                bugr.setData(Uri.parse("mailto:chandanbatven@gmail.com"+"?subject=Bug Report (Calculator)"));
                startActivity(bugr);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bck = new Intent(option.this,MainActivity.class);
                startActivity(bck);
            }
        });



    }

    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                x1=touchevent.getX();
                y1=touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=touchevent.getX();
                y2=touchevent.getY();
                if((x1<x2)&&(y2-y1<400d)&&(y2-y1>-400d))
                {
                    Intent strtmain =new Intent(option.this,MainActivity.class);
                    startActivity(strtmain);
                }
                break;

        }
        return false;
    }


}