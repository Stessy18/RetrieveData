package com.example.steffy.newtry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String sregno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button viewbt = (Button) findViewById(R.id.viewbtn);
      //  final EditText editname=(EditText)findViewById(R.id.name1);
        final EditText editregno=(EditText)findViewById(R.id.regno1);
      //  final EditText editdob=(EditText)findViewById(R.id.dob1);
       // final EditText editdept=(EditText)findViewById(R.id.dept1);

        viewbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(MainActivity.this, Display.class);
                //gotoIntent.putExtra("sname", editname.getText().toString());
                gotoIntent.putExtra("sregno", editregno.getText().toString());
                //gotoIntent.putExtra("sdob", editdob.getText().toString());
                //gotoIntent.putExtra("sdept", editdept.getText().toString());


                startActivity(gotoIntent);
            }
        });
//


    }
}
