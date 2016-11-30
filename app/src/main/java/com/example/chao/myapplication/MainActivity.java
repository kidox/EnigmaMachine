package com.example.chao.myapplication;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private static EnigmaMachine enigma;
    private TextView tv;
    private TextView typedText;
    private TextView encodedText;
    private String typtedStr = "";
    private String encodedStr = "";

    private TextView display_left;
    private TextView display_middle;
    private TextView display_right;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enigma = new EnigmaMachine();
        typedText = (TextView) findViewById(R.id.typed);
        encodedText = (TextView) findViewById(R.id.encoded);
        display_left = (TextView) findViewById(R.id.display_left);
        display_middle = (TextView) findViewById(R.id.display_middle);
        display_right = (TextView) findViewById(R.id.display_right);
    }

    protected void findBulb(char result) {

        if(result == 'A')
        {
            tv = (TextView) findViewById(R.id.tv_a);

        }
        if(result == 'B')
        {
            tv = (TextView) findViewById(R.id.tv_b);
        }
        if(result == 'C')
        {
            tv = (TextView) findViewById(R.id.tv_c);
        }
        if(result == 'D')
        {
            tv = (TextView) findViewById(R.id.tv_d);

        }
        if(result == 'E')
        {
            tv = (TextView) findViewById(R.id.tv_e);
        }
        if(result == 'F')
        {
            tv = (TextView) findViewById(R.id.tv_f);
        }
        if(result == 'G')
        {
            tv = (TextView) findViewById(R.id.tv_g);

        }
        if(result == 'H')
        {
            tv = (TextView) findViewById(R.id.tv_h);
        }
        if(result == 'I')
        {
            tv = (TextView) findViewById(R.id.tv_i);
        }
        if(result == 'J')
        {
            tv = (TextView) findViewById(R.id.tv_j);

        }
        if(result == 'K')
        {
            tv = (TextView) findViewById(R.id.tv_k);
        }
        if(result == 'L')
        {
            tv = (TextView) findViewById(R.id.tv_l);
        }
        if(result == 'M')
        {
            tv = (TextView) findViewById(R.id.tv_m);

        }
        if(result == 'N')
        {
            tv = (TextView) findViewById(R.id.tv_n);
        }
        if(result == 'O')
        {
            tv = (TextView) findViewById(R.id.tv_o);
        }
        if(result == 'P')
        {
            tv = (TextView) findViewById(R.id.tv_p);

        }
        if(result == 'Q')
        {
            tv = (TextView) findViewById(R.id.tv_q);
        }
        if(result == 'R')
        {
            tv = (TextView) findViewById(R.id.tv_r);
        }
        if(result == 'S')
        {
            tv = (TextView) findViewById(R.id.tv_s);
        }
        if(result == 'T')
        {
            tv = (TextView) findViewById(R.id.tv_t);
        }
        if(result == 'U')
        {
            tv = (TextView) findViewById(R.id.tv_u);

        }
        if(result == 'V')
        {
            tv = (TextView) findViewById(R.id.tv_v);
        }
        if(result == 'W')
        {
            tv = (TextView) findViewById(R.id.tv_w);
        }
        if(result == 'X')
        {
            tv = (TextView) findViewById(R.id.tv_x);

        }
        if(result == 'Y')
        {
            tv = (TextView) findViewById(R.id.tv_y);
        }
        if(result == 'Z')
        {
            tv = (TextView) findViewById(R.id.tv_z);
        }


        tv.setBackgroundResource(R.drawable.red_circle);

        CountDownTimer timer = new CountDownTimer(300,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                tv.setBackgroundResource(R.drawable.circle);
            }
        }.start();
    }

    public void ButtonOnClick(View v)
    {
        char result = ' ';
        switch (v.getId())
        {
            case R.id.btn_a:
                result = enigma.encode('A');
                typtedStr += "A";
                encodedStr += result;
                break;
            case R.id.btn_b:
                result = enigma.encode('B');
                typtedStr += "B";
                encodedStr += result;
                break;
            case R.id.btn_c:
                result = enigma.encode('C');
                typtedStr += "C";
                encodedStr += result;
                break;
            case R.id.btn_d:
                result = enigma.encode('D');
                typtedStr += "D";
                encodedStr += result;
                break;
            case R.id.btn_e:
                result = enigma.encode('E');
                typtedStr += "E";
                encodedStr += result;
                break;
            case R.id.btn_f:
                result = enigma.encode('F');
                typtedStr += "F";
                encodedStr += result;
                break;
            case R.id.btn_g:
                result = enigma.encode('G');
                typtedStr += "G";
                encodedStr += result;
                break;
            case R.id.btn_h:
                result = enigma.encode('H');
                typtedStr += "H";
                encodedStr += result;
                break;
            case R.id.btn_i:
                result = enigma.encode('I');
                typtedStr += "I";
                encodedStr += result;
                break;
            case R.id.btn_j:
                result = enigma.encode('J');
                typtedStr += "J";
                encodedStr += result;
                break;
            case R.id.btn_k:
                result = enigma.encode('K');
                typtedStr += "K";
                encodedStr += result;
                break;
            case R.id.btn_l:
                result = enigma.encode('L');
                typtedStr += "L";
                encodedStr += result;
                break;
            case R.id.btn_m:
                result = enigma.encode('M');
                typtedStr += "M";
                encodedStr += result;
                break;
            case R.id.btn_n:
                result = enigma.encode('N');
                typtedStr += "N";
                encodedStr += result;
                break;
            case R.id.btn_o:
                result = enigma.encode('O');
                typtedStr += "O";
                encodedStr += result;
                break;
            case R.id.btn_p:
                result = enigma.encode('P');
                typtedStr += "P";
                encodedStr += result;
                break;
            case R.id.btn_q:
                result = enigma.encode('Q');
                typtedStr += "Q";
                encodedStr += result;
                break;
            case R.id.btn_r:
                result = enigma.encode('R');
                typtedStr += "R";
                encodedStr += result;
                break;
            case R.id.btn_s:
                result = enigma.encode('S');
                typtedStr += "S";
                encodedStr += result;
                break;
            case R.id.btn_t:
                result = enigma.encode('T');
                typtedStr += "T";
                encodedStr += result;
                break;
            case R.id.btn_u:
                result = enigma.encode('U');
                typtedStr += "U";
                encodedStr += result;
                break;
            case R.id.btn_v:
                result = enigma.encode('V');
                typtedStr += "V";
                encodedStr += result;
                break;
            case R.id.btn_w:
                result = enigma.encode('W');
                typtedStr += "W";
                encodedStr += result;
                break;
            case R.id.btn_x:
                result = enigma.encode('X');
                typtedStr += "X";
                encodedStr += result;
                break;
            case R.id.btn_y:
                result = enigma.encode('Y');
                typtedStr += "Y";
                encodedStr += result;
                break;
            case R.id.btn_z:
                result = enigma.encode('Z');
                typtedStr += "Z";
                encodedStr += result;
                break;
            case R.id.btn_del:
                if(typtedStr.length() != 0 && encodedStr.length() != 0)
                {
                    typtedStr = typtedStr.substring(0,typtedStr.length() - 1);
                    encodedStr = encodedStr.substring(0, encodedStr.length() - 1);
                    enigma.downRightRotor();
                }
                break;
            case R.id.btn_clear:
                for(int i = 0 ; i < typtedStr.length();i++)
                {
                    enigma.downRightRotor();
                }
                typtedStr = "";
                encodedStr = "";
                break;
            case R.id.up_right:
                enigma.upRightRotor();
                break;
            case R.id.down_right:
                enigma.downRightRotor();
                break;
            case R.id.up_middle:
                enigma.upMiddleRotor();
                break;
            case R.id.down_middle:
                enigma.downMiddleRotor();
                break;
            case R.id.up_left:
                enigma.upLeftRotor();
                break;
            case R.id.down_left:
                enigma.downLeftRotor();
                break;
        }

        display_left.setText(enigma.getLeftDisplay());
        display_middle.setText(enigma.getMiddleDisplay());
        display_right.setText(enigma.getRightDisplay());

        if(typtedStr.length() > 28)
        {
            typedText.setText("T:"+typtedStr.substring(typtedStr.length() - 28));
            encodedText.setText("E:"+encodedStr.substring(encodedStr.length() - 28));
        }
        else
        {
            typedText.setText("T:"+typtedStr);
            encodedText.setText("E:"+encodedStr);
        }

        if(v.getId() != R.id.btn_del && v.getId() != R.id.up_left && v.getId() != R.id.up_middle && v.getId() != R.id.up_right
                && v.getId() != R.id.down_left && v.getId() != R.id.down_middle && v.getId() != R.id.down_right && v.getId() != R.id.btn_clear)
        {
            findBulb(result);
        }

    }

    public void OpenPlugBoard(View v)
    {
        Intent intent = new Intent(this,ShowPlugBoard.class);
        startActivity(intent);
    }

    public void OpenRotors(View v)
    {
        Intent intent2 = new Intent(this,ShowRotors.class);
        startActivity(intent2);
    }

    public static void setPlugBoard(String s)
    {
        enigma.setPlugBoard(s);
    }

    public static String getCurrentPlugBoardPairs()
    {
        return enigma.plugBoard.getPair();
    }

    public static String getCurrentRotorSetting()
    {
        System.out.println("In MainActivity - getCurrentRotorSetting: " + enigma.getRotorSetting());
        return enigma.getRotorSetting();
    }

    public static void setRotors(String s)
    {
        int l = Integer.valueOf(s.charAt(0) + "");
        int m = Integer.valueOf(s.charAt(1) + "");
        int r = Integer.valueOf(s.charAt(2) + "");

        enigma.setRotors(l,m,r);
    }

}
