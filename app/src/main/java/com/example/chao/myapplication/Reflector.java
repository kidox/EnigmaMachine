package com.example.chao.myapplication;

/**
 * Created by CHAO on 11/3/16.
 */


public class Reflector {
    String pair = "AYBRCUDHEQFSGLIPJXKNMOTZVW";
    public Reflector() {

    }

    public Reflector(String reflectorPairStr) {
        pair = reflectorPairStr;
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

}
