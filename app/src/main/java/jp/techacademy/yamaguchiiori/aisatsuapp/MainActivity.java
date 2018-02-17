package jp.techacademy.yamaguchiiori.aisatsuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.TimePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
    }
    @Override
    public void onClick(View v) {
        showTimePickerDialog();
    }
    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(
                this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourday, int minute) {
             if (18 <= hourday ){
                 TextView textView = (TextView) findViewById(R.id.textView);
                 textView.setText("こんばんは");
             }else if (10 <= hourday){
                 TextView textView = (TextView) findViewById(R.id.textView);
                 textView.setText("こんにちは");
             }else if (2 <= hourday){
                 TextView textView = (TextView) findViewById(R.id.textView);
                 textView.setText("おはよう");
             }else {
                 TextView textView = (TextView) findViewById(R.id.textView);
                 textView.setText("こんばんは");
             }
            }
        },
                12,
                0,
                true);
        timePickerDialog.show();
    }
    }
