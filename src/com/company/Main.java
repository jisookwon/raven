package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> answerArrayList = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        String answer;
        Raven raven = new Raven();
        //Invoice invoice = new Invoice();
//        Raven rr = new Raven()

        System.out.println("Good Morning, how are you feeling today?");

        while (true) {
            System.out.print("\nEnter your response here or Q to quit : ");
            answer = keyboard.nextLine().toLowerCase();
            if (answer.equals("q")) {
                break;
            } else {
                String[] answerArray = answer.split("\\s");

                for (String i : answerArray) {
                    System.out.print(i+ " ");

                }
                answerArrayList.add(answer);
                //convert user input to raven's answer
                for (int j = 0; j < answerArray.length; j++) {
                    String answerKey = answerArray[j];
                    if (raven.getTable(answerKey) != null) {
                        System.out.print(raven.getTable(answerKey)+" ");
                        answerArray[j] = raven.getTable(answerKey);
                    }
                }

                //print user input

                StringBuilder s = new StringBuilder("");
                for (String i : answerArray) {
                    System.out.print(i+" ");
                    s.append(i+" ");
                }
                System.out.println(s.toString());
                answerArrayList.add(s.toString());

                //check positive & negative words

                int cntPositive=0;
                int cntNegative=0;
                for (String i : answerArray){
                    //i.replace(",","");
                    System.out.print(i+" ");
                    int n;
                    if (raven.getPositive().contains(i)){
                        cntPositive++;
                    }else{
                        if (raven.getNegative().contains(i)){
                            cntNegative++;
                        }
                    }
                }

                //choose Raven's answer for user input
                System.out.println("positive"+cntPositive + "negative "+cntNegative);
                if (cntPositive>cntNegative){
                    Random r = new Random();
                    int k= (r.nextInt(3)-1);
                    System.out.println(raven.getPositiveArr(k) + " ");
                    for (String i : answerArray) {
                        System.out.print(i + " ");
                    }
                    System.out.println(".");
                    answerArrayList.add(raven.getPositiveArr(k));

                }else if(cntPositive<cntNegative){
                    Random rr = new Random();
                    int l= (rr.nextInt(3)-1);
                    System.out.println(raven.getNegativeArr(l) + " ");
                    for (String i:answerArray){
                        System.out.print(i+" ");
                    }
                    System.out.print(raven.getNegativeArr(l));
                    answerArrayList.add(raven.getNegativeArr(l));

                }else {
                    System.out.println("Meh...");
                    answerArrayList.add("Meh...");
                }
                /*Random r = new Random();
                int k= (r.nextInt(3)-1);
                System.out.print(qualifierArr.get(k) + " ");
                for (String i : answerArray) {
                    System.out.print(i + " ");
                }
                System.out.println(".");
                */
                //System.out.print();
                if (answer.equalsIgnoreCase("I am feeling great") ){
                    break;
                }
            }//if for quit
        }//while


        /*int question=0;
        String name="";
        System.out.println("Enter customer name : ");
        name=keyboard.nextLine();
        invoice.calculate(question);
       */ System.out.println("\n>>> BYE!!");

    }

}
