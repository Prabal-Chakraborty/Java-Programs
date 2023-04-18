package com.Prabal.PlacementQuestions.HackerRank;
/* https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true */
public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();

        Bird bird = new Bird();
        bird.fly();
        bird.sing();
    }
}
