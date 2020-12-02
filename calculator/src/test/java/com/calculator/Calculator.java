package com.calculator;

public class Calculator {
    int result=0;

    public void clear(){}

    public void add(int num){
        result+=num;
    }

    public int getResult(){
        return result;
    }
}
