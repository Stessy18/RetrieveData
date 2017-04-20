package com.example.steffy.newtry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ///
        TextView textname=(TextView)findViewById(R.id.name);
        TextView textregno=(TextView)findViewById(R.id.regno);
        TextView textdob=(TextView)findViewById(R.id.dob);
        TextView textdept=(TextView)findViewById(R.id.dept);

        Intent intent = getIntent();

        String q = intent.getStringExtra("sname");
        textname.setText(q);
        String s = intent.getStringExtra("sregno");
        textregno.setText(s);
        String e = intent.getStringExtra("sdob");
        textdob.setText(e);
        String g = intent.getStringExtra("sdept");
        textdept.setText(g);



    }
}
