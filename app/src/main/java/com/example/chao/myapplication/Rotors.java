package com.example.chao.myapplication;

/**
 * Created by CHAO on 11/3/16.
 */



public class Rotors {

    private int rightHead = 0;
    private int middleHead = 0;
    private int leftHead = 0;

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String R1_left_right = "EKMFLGDQVZNTOWYHXUSPAIBRCJ"; // ROTOR I KNOCK-ON OCCURS AT R
    private String R1_right_left = "UWYGADFPVZBECKMTHXSLRINQOJ";
    private String R2_left_right = "AJDKSIRUXBLHWTMCQGZNPYFVOE"; // ROTOR II KNOCK-ON OCCURS AT F
    private String R2_right_left = "AJPCZWRLFBDKOTYUQGENHXMIVS";
    private String R3_left_right = "BDFHJLCPRTXVZNYEIWGAKMUSQO"; // ROTOR III KNOCK-ON OCCURS AT W
    private String R3_right_left = "TAGBPCSDQEUFVNZHYIXJWLRKOM";
    private String R4_left_right = "ESOVPZJAYQUIRHXLNFTGKDCMWB"; // ROTOR IV KNOCK-ON OCCURS AT K
    private String R4_right_left = "HZWVARTNLGUPXQCEJMBSKDYOIF";
    private String R5_left_right = "VZBRGITYUPSDNHLXAWMJQOFECK"; // ROTOR V KNOCK-ON OCCURS AT A
    private String R5_right_left = "QCYLXWENFTZOSMVJUDKGIARPHB";

    private String[] left = new String[4];
    private String[] middle = new String[4];
    private String[] right = new String[4];

    public Rotors()
    {
        left[0] = R1_left_right;
        left[1] = R1_right_left;
        left[2] = "R";
        left[3] = "1";

        middle[0] = R2_left_right;
        middle[1] = R2_right_left;
        middle[2] = "F";
        middle[3] = "2";

        right[0] = R3_left_right;
        right[1] = R3_right_left;
        right[2] = "W";
        right[3] = "3";
    }

    public Rotors(int l, int m, int r) {

        switch(l)
        {
            case 1:
                left[0] = R1_left_right;
                left[1] = R1_right_left;
                left[2] = "R";
                break;
            case 2:
                left[0] = R2_left_right;
                left[1] = R2_right_left;
                left[2] = "F";
                break;
            case 3:
                left[0] = R3_left_right;
                left[1] = R3_right_left;
                left[2] = "W";
                break;
            case 4:
                left[0] = R4_left_right;
                left[1] = R4_right_left;
                left[2] = "K";
                break;
            case 5:
                left[0] = R5_left_right;
                left[1] = R5_right_left;
                left[2] = "A";
                break;
        }

        switch(m)
        {
            case 1:
                middle[0] = R1_left_right;
                middle[1] = R1_right_left;
                middle[2] = "R";
                break;
            case 2:
                middle[0] = R2_left_right;
                middle[1] = R2_right_left;
                middle[2] = "F";
                break;
            case 3:
                middle[0] = R3_left_right;
                middle[1] = R3_right_left;
                middle[2] = "W";
                break;
            case 4:
                middle[0] = R4_left_right;
                middle[1] = R4_right_left;
                middle[2] = "K";
                break;
            case 5:
                middle[0] = R5_left_right;
                middle[1] = R5_right_left;
                middle[2] = "A";
                break;
        }

        switch(r)
        {
            case 1:
                right[0] = R1_left_right;
                right[1] = R1_right_left;
                right[2] = "R";
                break;
            case 2:
                right[0] = R2_left_right;
                right[1] = R2_right_left;
                right[2] = "F";
                break;
            case 3:
                right[0] = R3_left_right;
                right[1] = R3_right_left;
                right[2] = "W";
                break;
            case 4:
                right[0] = R4_left_right;
                right[1] = R4_right_left;
                right[2] = "K";
                break;
            case 5:
                right[0] = R5_left_right;
                right[1] = R5_right_left;
                right[2] = "A";
                break;
        }

        left[3] = l + "";
        middle[3] = m + "";
        right[3] = r + "";
    }

    public char check(char c, boolean isForwarding) {
        int startingOrder = alphabet.indexOf(c);
        char target = ' ';
        if(isForwarding) {

            rightHead = (rightHead + 1) % 26; // 0 -> A, 25 -> Z

            int c1 = checkRight(startingOrder, isForwarding);
            int c2 = checkMiddle(c1,isForwarding);
            int c3 = checkLeft(c2, isForwarding);
            target = alphabet.charAt(c3);
        }
        else
        {
            int c1 = checkLeft(startingOrder, isForwarding);
            int c2 = checkMiddle(c1, isForwarding);
            int c3 = checkRight(c2, isForwarding);
            target = alphabet.charAt(c3);
        }

        return target;
    }

    private int checkLeft(int order, boolean forwarding) {
        char target = ' ';
        char order_letter = (char)((leftHead + order) % 26 + 65);
        int letter_alphOrder = alphabet.indexOf(order_letter);
        if(forwarding) {
            target = left[1].charAt(letter_alphOrder);
        }
        else
        {
            target = left[0].charAt(letter_alphOrder);
        }
        int passingOrder = getPositionFromHead(leftHead, target);
        return passingOrder;

    }

    private int checkMiddle(int order, boolean forwarding) {
        char target = ' ';
        char order_letter = (char)((middleHead + order) % 26 + 65);
        if(forwarding && middleHead + 65 == middle[2].charAt(0)){
            leftHead = (leftHead + 1) % 26;
        }
        int letter_alphOrder = alphabet.indexOf(order_letter);
        if(forwarding) {
            target = middle[1].charAt(letter_alphOrder);
        }
        else
        {
            target = middle[0].charAt(letter_alphOrder);
        }
        int passingOrder = getPositionFromHead(middleHead, target);
        return passingOrder;

    }

    private int checkRight(int order, boolean forwarding) {
        char target = ' ';
        char order_letter = (char)((rightHead + order) % 26 + 65);
        if(forwarding && rightHead + 65 == right[2].charAt(0))
        {
            middleHead = (middleHead + 1) % 26;
        }
        int letter_alphOrder = alphabet.indexOf(order_letter);
        if(forwarding) {
            target = right[1].charAt(letter_alphOrder);

        }
        else
        {
            target = right[0].charAt(letter_alphOrder);
        }

        int passingOrder = getPositionFromHead(rightHead, target);
        return passingOrder;

    }


    public void upLeftHead()
    {
        leftHead = leftHead + 1;
        if(leftHead == 26)
        {
            leftHead = 0;
        }
    }

    public void downLeftHead()
    {
        leftHead = leftHead - 1;
        if(leftHead == -1)
        {
            leftHead = 25;
        }
    }

    public void upMiddleHead()
    {
        middleHead = middleHead + 1;
        if(middleHead == 26)
        {
            middleHead = 0;
        }

        if(middleHead + 65 == middle[2].charAt(0)){
            upLeftHead();
        }
    }

    public void downMiddleHead()
    {
        middleHead = middleHead - 1;
        if(middleHead == -1)
        {
            middleHead = 25;
        }

        if(middleHead + 65 == middle[2].charAt(0)){
            downLeftHead();
        }

    }

    public void upRightHead()
    {
        rightHead = rightHead + 1;
        if(rightHead == 26)
        {
            rightHead = 0;
        }

        if(rightHead + 65 == right[2].charAt(0))
        {
            upMiddleHead();
        }
    }

    public void downRightHead()
    {
        rightHead = rightHead - 1;
        if(rightHead == -1)
        {
            rightHead = 25;
        }

        if(rightHead + 65 == right[2].charAt(0))
        {
            downMiddleHead();
        }
    }

    public char getRightHead()
    {
        return (char) (rightHead + 65);
    }

    public char getMiddleHead()
    {
        return (char) (middleHead + 65);
    }

    public char getLeftHead()
    {
        return (char) (leftHead + 65);
    }

    public void setRotors(int l, int m, int r)
    {
        switch(l)
        {
            case 1:
                left[0] = R1_left_right;
                left[1] = R1_right_left;
                left[2] = "R";
                break;
            case 2:
                left[0] = R2_left_right;
                left[1] = R2_right_left;
                left[2] = "F";
                break;
            case 3:
                left[0] = R3_left_right;
                left[1] = R3_right_left;
                left[2] = "W";
                break;
            case 4:
                left[0] = R4_left_right;
                left[1] = R4_right_left;
                left[2] = "K";
                break;
            case 5:
                left[0] = R5_left_right;
                left[1] = R5_right_left;
                left[2] = "A";
                break;
        }

        switch(m)
        {
            case 1:
                middle[0] = R1_left_right;
                middle[1] = R1_right_left;
                middle[2] = "R";
                break;
            case 2:
                middle[0] = R2_left_right;
                middle[1] = R2_right_left;
                middle[2] = "F";
                break;
            case 3:
                middle[0] = R3_left_right;
                middle[1] = R3_right_left;
                middle[2] = "W";
                break;
            case 4:
                middle[0] = R4_left_right;
                middle[1] = R4_right_left;
                middle[2] = "K";
                break;
            case 5:
                middle[0] = R5_left_right;
                middle[1] = R5_right_left;
                middle[2] = "A";
                break;
        }

        switch(r)
        {
            case 1:
                right[0] = R1_left_right;
                right[1] = R1_right_left;
                right[2] = "R";
                break;
            case 2:
                right[0] = R2_left_right;
                right[1] = R2_right_left;
                right[2] = "F";
                break;
            case 3:
                right[0] = R3_left_right;
                right[1] = R3_right_left;
                right[2] = "W";
                break;
            case 4:
                right[0] = R4_left_right;
                right[1] = R4_right_left;
                right[2] = "K";
                break;
            case 5:
                right[0] = R5_left_right;
                right[1] = R5_right_left;
                right[2] = "A";
                break;
        }

        left[3] = l + "";
        middle[3] = m + "";
        right[3] = r + "";
    }

    public String getRotorSetting()
    {
        return left[3]+middle[3]+right[3];
    }

    /*HELPER*/
    private int getPositionFromHead(int head, char in) {
        int c = in % 65;
        for(int i = 1; i <= 25; i++) {
            if((char)((head + i) % 26) == c) {
                return i;
            }
        }
        return 0;
    }


}
