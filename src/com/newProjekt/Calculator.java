package com.newProjekt;

public class Calculator {
    private Calculator(){}

    public static int calc(int number1, int number2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = number1+number2;
                break;
            case '-':
                result = number1-number2;
                break;
            case '*':
                result = number1*number2;
                break;
            case '/':
                result = number1/number2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");

        }
        return result;
    }


}