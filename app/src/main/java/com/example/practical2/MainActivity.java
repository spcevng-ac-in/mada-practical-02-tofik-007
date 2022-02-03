package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  int cnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void change(View view){
        TextView text =  (TextView)findViewById(R.id.textView);
        TextView text2 =  (TextView)findViewById(R.id.textView2);
        cnt++;
        text.setText("Count =" +cnt);

        EditText etext =  (EditText)findViewById(R.id.editText);
        String editTextStr = etext.getText().toString();
        text2.setText(editTextStr);

    }
}
