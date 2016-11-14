package com.example.yhlau.glutenfreenavigator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by guanxuan95 on 11/2/2016.
 */

public class SymptomsDairy extends AppCompatActivity {

    private int seekRed;
    RelativeLayout color;
    SeekBar seekBarRed;
    TextView outputtext1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_symptoms_diary);

        color = (RelativeLayout) findViewById(R.id.changeColor);
        seekBarRed = (SeekBar) findViewById(R.id.seekBar);
        outputtext1 =(TextView) findViewById(R.id.textView5);
        updateNow();

        seekBarRed.setOnSeekBarChangeListener(seekBarChangeListener);

    }

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            updateNow();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            Toast.makeText(getApplicationContext(), "SEEKBAR IN USE", Toast.LENGTH_SHORT).show();
            updateNow2();
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            Toast.makeText(getApplicationContext(), "SEEKBAR NOT IN USE", Toast.LENGTH_SHORT).show();
        }
    };

    private void updateNow(){
        seekRed = seekBarRed.getProgress();
        color.setBackgroundColor(0xff000000 * seekRed * 0x10000);

    }
    private void updateNow2(){
        outputtext1.setText("4");
    }
}
