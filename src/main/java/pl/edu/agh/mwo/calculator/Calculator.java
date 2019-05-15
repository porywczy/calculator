package pl.edu.agh.mwo.calculator;

public class Calculator {

    public int sum(int a, int b) {

        return a + b;

    }

    public int subtract(int a, int b) {

        return a - b;

    }

    public int multiply(int a, int b) {

        return a * b;

    }

    public double divide(int a, int b) {

        return a / b;

    }

    public double avg(int... args) {

        int sum = 0, counter = 0;
        for ( int element : args ) {
            sum += element;
            counter++;
        }
        return (sum)/counter;

    }
    



}
