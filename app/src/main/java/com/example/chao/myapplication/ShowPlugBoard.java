package com.example.chao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowPlugBoard extends AppCompatActivity {

    private String inputStr="";
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_plug_board);
        tv = (TextView) findViewById(R.id.input_box);
        TextView oldPairs = (TextView) findViewById(R.id.current_plugboard_str);
        oldPairs.setText(MainActivity.getCurrentPlugBoardPairs());
    }

    public void InputButtonOnClick(View v)
    {
        if(v.getId() != R.id.input_delete && v.getId() != R.id.input_reset && v.getId() != R.id.input_ok && v.getId() != R.id.connect_to_self)
        {
            ((Button) findViewById(v.getId())).setEnabled(false);
        }


        switch (v.getId())
        {
            case R.id.input_a:
                inputStr += "A";
                break;
            case R.id.input_b:
                inputStr += "B";
                break;
            case R.id.input_c:
                inputStr += "C";
                break;
            case R.id.input_d:
                inputStr += "D";
                break;
            case R.id.input_e:
                inputStr += "E";
                break;
            case R.id.input_f:
                inputStr += "F";
                break;
            case R.id.input_g:
                inputStr += "G";
                break;
            case R.id.input_h:
                inputStr += "H";
                break;
            case R.id.input_i:
                inputStr += "I";
                break;
            case R.id.input_j:
                inputStr += "J";
                break;
            case R.id.input_k:
                inputStr += "K";
                break;
            case R.id.input_l:
                inputStr += "L";
                break;
            case R.id.input_m:
                inputStr += "M";
                break;
            case R.id.input_n:
                inputStr += "N";
                break;
            case R.id.input_o:
                inputStr += "O";
                break;
            case R.id.input_p:
                inputStr += "P";
                break;
            case R.id.input_q:
                inputStr += "Q";
                break;
            case R.id.input_r:
                inputStr += "R";
                break;
            case R.id.input_s:
                inputStr += "S";
                break;
            case R.id.input_t:
                inputStr += "T";
                break;
            case R.id.input_u:
                inputStr += "U";
                break;
            case R.id.input_v:
                inputStr += "V";
                break;
            case R.id.input_w:
                inputStr += "W";
                break;
            case R.id.input_x:
                inputStr += "X";
                break;
            case R.id.input_y:
                inputStr += "Y";
                break;
            case R.id.input_z:
                inputStr += "Z";
                break;
            case R.id.input_reset:
                inputStr = "";
                enableAllButtons();
                break;
            case R.id.input_delete:
                if(inputStr.length()!=0)
                {
                    enableOneButton(inputStr.charAt(inputStr.length() - 1));
                    inputStr = inputStr.substring(0, inputStr.length() - 1);
                }
                break;
            case R.id.input_ok:
                MainActivity.setPlugBoard(inputStr);
                finish();
                break;
            case R.id.connect_to_self:
                if(inputStr.length() % 2 != 0)
                {
                    inputStr += inputStr.charAt(inputStr.length() - 1);
                }

                break;

        }

        tv.setText(inputStr);
    }

    private void enableAllButtons()
    {
        ((Button) findViewById(R.id.input_a)).setEnabled(true);
        ((Button) findViewById(R.id.input_b)).setEnabled(true);
        ((Button) findViewById(R.id.input_c)).setEnabled(true);
        ((Button) findViewById(R.id.input_d)).setEnabled(true);
        ((Button) findViewById(R.id.input_e)).setEnabled(true);
        ((Button) findViewById(R.id.input_f)).setEnabled(true);
        ((Button) findViewById(R.id.input_g)).setEnabled(true);
        ((Button) findViewById(R.id.input_h)).setEnabled(true);
        ((Button) findViewById(R.id.input_i)).setEnabled(true);
        ((Button) findViewById(R.id.input_j)).setEnabled(true);
        ((Button) findViewById(R.id.input_k)).setEnabled(true);
        ((Button) findViewById(R.id.input_l)).setEnabled(true);
        ((Button) findViewById(R.id.input_m)).setEnabled(true);
        ((Button) findViewById(R.id.input_n)).setEnabled(true);
        ((Button) findViewById(R.id.input_o)).setEnabled(true);
        ((Button) findViewById(R.id.input_p)).setEnabled(true);
        ((Button) findViewById(R.id.input_q)).setEnabled(true);
        ((Button) findViewById(R.id.input_r)).setEnabled(true);
        ((Button) findViewById(R.id.input_s)).setEnabled(true);
        ((Button) findViewById(R.id.input_t)).setEnabled(true);
        ((Button) findViewById(R.id.input_u)).setEnabled(true);
        ((Button) findViewById(R.id.input_v)).setEnabled(true);
        ((Button) findViewById(R.id.input_w)).setEnabled(true);
        ((Button) findViewById(R.id.input_x)).setEnabled(true);
        ((Button) findViewById(R.id.input_y)).setEnabled(true);
        ((Button) findViewById(R.id.input_z)).setEnabled(true);

    }

    private void enableOneButton(char c)
    {
        switch (c)
        {
            case 'A':
                ((Button) findViewById(R.id.input_a)).setEnabled(true);
                break;
            case 'B':
                ((Button) findViewById(R.id.input_b)).setEnabled(true);
                break;
            case 'C':
                ((Button) findViewById(R.id.input_c)).setEnabled(true);
                break;
            case 'D':
                ((Button) findViewById(R.id.input_d)).setEnabled(true);
                break;
            case 'E':
                ((Button) findViewById(R.id.input_e)).setEnabled(true);
                break;
            case 'F':
                ((Button) findViewById(R.id.input_f)).setEnabled(true);
                break;
            case 'G':
                ((Button) findViewById(R.id.input_g)).setEnabled(true);
                break;
            case 'H':
                ((Button) findViewById(R.id.input_h)).setEnabled(true);
                break;
            case 'I':
                ((Button) findViewById(R.id.input_i)).setEnabled(true);
                break;
            case 'J':
                ((Button) findViewById(R.id.input_j)).setEnabled(true);
                break;
            case 'K':
                ((Button) findViewById(R.id.input_k)).setEnabled(true);
                break;
            case 'L':
                ((Button) findViewById(R.id.input_l)).setEnabled(true);
                break;
            case 'M':
                ((Button) findViewById(R.id.input_m)).setEnabled(true);
                break;
            case 'N':
                ((Button) findViewById(R.id.input_n)).setEnabled(true);
                break;
            case 'O':
                ((Button) findViewById(R.id.input_o)).setEnabled(true);
                break;
            case 'P':
                ((Button) findViewById(R.id.input_p)).setEnabled(true);
                break;
            case 'Q':
                ((Button) findViewById(R.id.input_q)).setEnabled(true);
                break;
            case 'R':
                ((Button) findViewById(R.id.input_r)).setEnabled(true);
                break;
            case 'S':
                ((Button) findViewById(R.id.input_s)).setEnabled(true);
                break;
            case 'T':
                ((Button) findViewById(R.id.input_t)).setEnabled(true);
                break;
            case 'U':
                ((Button) findViewById(R.id.input_u)).setEnabled(true);
                break;
            case 'V':
                ((Button) findViewById(R.id.input_v)).setEnabled(true);
                break;
            case 'W':
                ((Button) findViewById(R.id.input_w)).setEnabled(true);
                break;
            case 'X':
                ((Button) findViewById(R.id.input_x)).setEnabled(true);
                break;
            case 'Y':
                ((Button) findViewById(R.id.input_y)).setEnabled(true);
                break;
            case 'Z':
                ((Button) findViewById(R.id.input_z)).setEnabled(true);
                break;

        }
    }
}

