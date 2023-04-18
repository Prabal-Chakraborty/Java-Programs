package com.Prabal.Recursions.Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseqAscii("","abc");
        System.out.print(subseqRetAscii("", "abc"));
    }
    static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed + " ");
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed + ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }


    // now the same thing using ArrayList
    static ArrayList<String> subseqRet(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
       ArrayList <String> left = subseqRet(processed + ch, unprocessed.substring(1));
        ArrayList <String> rigth = subseqRet(processed, unprocessed.substring(1));
        left.addAll(rigth);
        return left;
    }

    // subsequence with ASCII value
    static void subseqAscii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed + " ");
            return;
        }
        char ch = unprocessed.charAt(0);
        subseqAscii(processed + ch, unprocessed.substring(1));
        subseqAscii(processed, unprocessed.substring(1));
        subseqAscii(processed + (ch +0), unprocessed.substring(1));
    }

    // the same thing using array list
    static ArrayList<String> subseqRetAscii(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList <String> first = subseqRetAscii(processed + ch, unprocessed.substring(1));
        ArrayList <String> second = subseqRetAscii(processed, unprocessed.substring(1));
        ArrayList <String> third = subseqRetAscii(processed + (ch+0), unprocessed.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
