package com.example.calculator;

public class Calculator {


    public void calcuateNumbers(){
        int firstNumber=5;
        int secondNumber=3;
        int resoult = firstNumber+secondNumber;
        System.out.println("Wynik: " + resoult);
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.calcuateNumbers();
    }
    }

