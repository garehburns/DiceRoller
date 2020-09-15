package diceroller;

import java.util.*;

public class die {
    private int roll;
    private int getFaceValue;
    private int getNumFaces;
    private String toString;
    
    private int faceValue;
    private int numFaces;
    private int randomNum;
    
    
    public die(int r) {
        roll = r;
    }
    
    public int roll() {
        randomNum = (int)(Math.random() * 100 * numFaces);
        for (int i = numFaces; numFaces > 0; i++) {
            if (randomNum > (i * 100)) {
                faceValue = i;
            }
        }
        return faceValue;
    }
    
    public int getFaceValue() {
        faceValue = (int)(Math.random() * roll) + 1;
        return faceValue;
    }
    
    public int getNumFaces() {
        numFaces = Math.max(roll, roll);
        return numFaces;
    }
    
    public String toString() {
        String makeString = "d" + numFaces + " = " + faceValue;
        return makeString;
    }
}