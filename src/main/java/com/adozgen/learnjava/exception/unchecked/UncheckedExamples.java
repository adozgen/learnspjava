package com.adozgen.learnjava.exception.unchecked;

public class UncheckedExamples {
    public void nullPointerException(String text){
        try {
            Integer length = text.length();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public void arrayIndexOutOfBoundsException(){
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[3]; // ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public void arithmeticException(){
        try {
            int result = 10 / 0;
        }catch (ArithmeticException e){
           System.out.println(e.getMessage());
         }
    }
    public void classCastException() {
        try {
            Object obj = "Hello";
            Integer number = (Integer) obj; // ClassCastException fırlatır
        } catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
}
