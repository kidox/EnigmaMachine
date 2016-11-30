package com.example.chao.myapplication;

/**
 * Created by CHAO on 11/3/16.
 */

public class PlugBoard {

    private String pair = "ABCDEFGHIJKLMNOPQRSTUUVVWWXXYYZZ";
    public PlugBoard() {

    }

    public PlugBoard(String inputPairStr) {
        pair = inputPairStr;
    }

    public char check(char c) {
        char target;
        int index = pair.indexOf(c);
        if(index % 2 == 0) {
            target = pair.charAt(index+1);
        }
        else {
            target = pair.charAt(index-1);
        }

        return target;
    }

    public void setPairString(String s)
    {
        pair = s;
    }

    public String getPair()
    {
        return pair;
    }

}
