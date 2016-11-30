package com.example.chao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowRotors extends AppCompatActivity {

    private TextView left_indicator;
    private TextView middle_indicator;
    private TextView right_indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_rotors);
        left_indicator = (TextView) findViewById(R.id.left_rotor_indicator);
        middle_indicator = (TextView) findViewById(R.id.middle_rotor_indicator);
        right_indicator = (TextView) findViewById(R.id.right_rotor_indicator);
        String s = MainActivity.getCurrentRotorSetting();
        left_indicator.setText(s.charAt(0) + "");
        middle_indicator.setText(s.charAt(1) + "");
        right_indicator.setText(s.charAt(2) + "");
    }

    public void setRotorBtnsOnClick(View v)
    {
        switch (v.getId())
        {
            case R.id.set_left_rotor_up:
                int value1 = Integer.valueOf(left_indicator.getText() + "") + 1;
                value1 = value1 >= 6 ? 1 : value1;
                left_indicator.setText(value1+"");
                break;
            case R.id.set_left_rotor_down:
                int value2 = Integer.valueOf(left_indicator.getText() + "") - 1;
                value2 = value2 <= 0 ? 5 : value2;
                left_indicator.setText(value2+"");
                break;
            case R.id.set_middle_rotor_up:
                int value3 = Integer.valueOf(middle_indicator.getText() + "") + 1;
                value3 = value3 >= 6 ? 1 : value3;
                middle_indicator.setText(value3+"");
                break;
            case R.id.set_middle_rotor_down:
                int value4 = Integer.valueOf(middle_indicator.getText() + "") - 1;
                value4 = value4 <= 0 ? 5 : value4;
                middle_indicator.setText(value4+"");
                break;
            case R.id.set_right_rotor_up:
                int value5 = Integer.valueOf(right_indicator.getText() + "") + 1;
                value5 = value5 >= 6 ? 1 : value5;
                right_indicator.setText(value5+"");
                break;
            case R.id.set_right_rotor_down:
                int value6 = Integer.valueOf(right_indicator.getText() + "") - 1;
                value6 = value6 <= 0 ? 5 : value6;
                right_indicator.setText(value6+"");
                break;
            case R.id.submit_rotor_setting:
                submit();
                finish();
                break;
        }

    }

    private void submit()
    {
        String s = "";
        s = s + left_indicator.getText() + middle_indicator.getText() + right_indicator.getText();
        MainActivity.setRotors(s);
    }
}
