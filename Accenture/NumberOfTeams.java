package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class NumberOfTeams {
    static int numberOfTeams(int fresher, int experienced) {
        int count=0;
        while((fresher>=3 && experienced>=1) || (experienced>=3 && fresher>=1)){
            if(fresher>experienced){
                fresher=fresher-3;
                experienced--;
                count++;
            }
            else{
                experienced=experienced-3;
                fresher--;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numExperienced = scanner.nextInt();
        int numFreshers = scanner.nextInt();
        System.out.println(numberOfTeams(numFreshers,numExperienced));

        scanner.close();
    }
}
