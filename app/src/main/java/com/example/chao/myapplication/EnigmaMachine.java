package com.example.chao.myapplication;

/**
 * Created by CHAO on 11/3/16.
 */

public class EnigmaMachine {
    PlugBoard plugBoard;
    Rotors rotors;
    Reflector reflector;

    public EnigmaMachine() {
        plugBoard = new PlugBoard();
        rotors = new Rotors();
        reflector = new Reflector();
    }

    public EnigmaMachine(int l, int m, int r) {
        plugBoard = new PlugBoard();
        rotors = new Rotors(l,m,r);
        reflector = new Reflector();
    }

    public EnigmaMachine(String pairStr) {
        plugBoard = new PlugBoard(pairStr);
        rotors = new Rotors();
        reflector = new Reflector();
    }


    public char encode(char c) {

        char c1 = plugBoard.check(c);
        char c2 = rotors.check(c1, true);
        char c3 = reflector.check(c2);
        char c4 = rotors.check(c3, false);
        char c5 = plugBoard.check(c4);

        return c5;
    }

    public String encodeString(String s) {
        String encoded = "";
        for(int i = 0; i < s.length(); i++)
        {
            encoded += encode(s.charAt(i));
        }
        return encoded;
    }

    public void setPlugBoard(String s)
    {
        plugBoard.setPairString(s);
    }

    public void upRightRotor()
    {
        rotors.upRightHead();
    }

    public void downRightRotor()
    {
        rotors.downRightHead();
    }

    public void upMiddleRotor()
    {
        rotors.upMiddleHead();
    }

    public void downMiddleRotor()
    {
        rotors.downMiddleHead();
    }

    public void upLeftRotor()
    {
        rotors.upLeftHead();
    }

    public void downLeftRotor()
    {
        rotors.downLeftHead();
    }

    public String getRightDisplay()
    {
        return rotors.getRightHead() + "";
    }

    public String getMiddleDisplay()
    {
        return rotors.getMiddleHead() + "";
    }

    public String getLeftDisplay()
    {
        return rotors.getLeftHead() + "";
    }

    public void setRotors(int l, int m, int r)
    {
        rotors.setRotors(l,m,r);
    }

    public String getRotorSetting()
    {
        return rotors.getRotorSetting();
    }

}

