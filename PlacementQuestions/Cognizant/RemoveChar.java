package com.Prabal.PlacementQuestions.Cognizant;

public class RemoveChar {
    public static void main(String[] args) {
        String str = "ASANSOL ENGINEERING COLLEGE";
        char ch = 'E';
        removeChar(str,ch);

    }
    public static void removeChar(String s, char ch){
        String AnsStr = "";
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) != ch){
                AnsStr = AnsStr + s.charAt(i);
            }
        }
        System.out.println(AnsStr);
    }
}
