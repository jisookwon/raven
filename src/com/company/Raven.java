package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Raven {

    private HashMap<String, String> table = new HashMap<String, String>();
    private ArrayList<String> positiveArr = new ArrayList<String>();
    private ArrayList<String> negativeArr = new ArrayList<String>();
    private ArrayList<String> positive = new ArrayList<String>();
    private ArrayList<String> negative = new ArrayList<String>();


    public Raven() {
    }

    public HashMap<String, String> getTable() {
        return table;
    }

    public String setTable(String testKey) {
        table.put("i", "you");
        table.put("me", "you");
        table.put("my", "your");
        table.put("am", "are");

        if (table.containsKey(testKey)) {
            return table.get(testKey);
        }
        return testKey;
    }

    public ArrayList<String> getPositive (){
        return positive;
    }
    public void setPositive() {
        positive.add("good");
        positive.add("glad");
        positive.add("happy");
        positive.add("relaxed");
        positive.add("accomplished");
        positive.add("alert");
        positive.add("creative");
    }

    public String getNegative (int i){
        return negative.get(i);
    }

    public void setNegative() {
        negative.add("bad");
        negative.add("sad");
        negative.add("tired");
        negative.add("angry");
        negative.add("anxious");
        negative.add("hungry");
        negative.add("moody");
        negative.add("afraid");
    }
    public String getPositiveArr(int i) {

        return positiveArr.get(i);
    }

    public void setPositiveArr() {
        positiveArr.add("Good! Please tell me more ");
        positiveArr.add("Great! ");
        positiveArr.add("I am so happy for you...Yay...");
    }

    public String getNegativeArr (int i){
        return negativeArr.get(i);
    }

    public void setNegativeArr() {
        negativeArr.add("Why do you say that...");
        negativeArr.add("Really! Why, tell me more!");
        negativeArr.add("So, you are concerned that ");
        negativeArr.add("Many of my patients tell me the same thing");
    }
}
