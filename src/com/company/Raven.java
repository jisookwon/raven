package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Raven {

    private HashMap<String, String> table = new HashMap<String, String>();
    private ArrayList <String> positiveArr= new ArrayList<String>();
    private ArrayList <String> negativeArr = new ArrayList<String>();
    private ArrayList <String> positive = new ArrayList<>();
    private ArrayList <String> negative = new ArrayList<>();
    private ArrayList <Array> answerArrayList = new ArrayList<>();

    public Raven() {
    }

    public Raven(HashMap<String, String> table, ArrayList<String> positiveArr, ArrayList<String> negativeArr, ArrayList<String> positive, ArrayList<String> negative) {
        this.table = table;
        this.positiveArr = positiveArr;
        this.negativeArr = negativeArr;
        this.positive = positive;
        this.negative = negative;
    }

    public HashMap<String, String> getTable() {
        return table;
    }

    public void setTable(HashMap<String, String> table) {
        this.table = table;
        table.put("i", "you");
        table.put("me", "you");
        table.put("my", "your");
        table.put("am", "are");
    }

    /*public ArrayList<String> getPositiveArr() {
        return positiveArr;
    }*/

    public String getPositiveArr(int i) {
        return positiveArr.get(i);
    }

    public void setPositiveArr(ArrayList<String> positiveArr) {
        this.positiveArr = positiveArr;
        positiveArr.add("Good! Please tell me more ");
        positiveArr.add("Great! ");
        positiveArr.add("I am so happy for you...Yay...");
    }


    public String getNegativeArr(int i) {
        return negativeArr.get(i);
    }

    public void setNegativeArr(ArrayList<String> negativeArr) {
        this.negativeArr = negativeArr;
        negativeArr.add("Why do you say that...");
        negativeArr.add("Really! Why, tell me more!");
        negativeArr.add("So, you are concerned that ");
        negativeArr.add("Many of my patients tell me the same thing");
    }


    public ArrayList<String> getPositive() {
        return positive;
    }

    public void setPositive(ArrayList<String> positive) {
        this.positive = positive;
        positive.add("good");
        positive.add("glad");
        positive.add("happy");
        positive.add("relaxed");
        positive.add("accomplished");
        positive.add("alert");
        positive.add("creative");
    }

    public ArrayList<String> getNegative() {
        return negative;
    }

    public void setNegative(ArrayList<String> negative) {
        this.negative = negative;
        negative.add("bad");
        negative.add("sad");
        negative.add("tired");
        negative.add("angry");
        negative.add("anxious");
        negative.add("hungry");
        negative.add("moody");
        negative.add("afraid");

    }
}
