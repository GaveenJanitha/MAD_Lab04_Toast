package com.example.student.mad_l04_toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast));

        TextView text1 = (TextView) layout.findViewById(R.id.text);
        text1.setText("This is a custom toast");

        Toast toast1 = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }


}
