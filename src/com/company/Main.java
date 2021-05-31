package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws EmptyException {
        ComplexNumber myPersonalComplexNumber = new ComplexNumber(-2, -5);
        ArrayList<ComplexNumber> myNumbers = new ArrayList<>();
        ComplexNumberParser parserEl = new ComplexNumberParser();
        myNumbers = parserEl.createArrayDataFromFile("complexNumbers.txt");

        System.out.println("Data from file");
        System.out.println(myNumbers);

        ComplexNumberComparator cmp = new ComplexNumberComparator();
        System.out.println("maximum modulo number");
        System.out.println(myNumbers.stream().max(cmp));

        System.out.println("Frequency of the element");
        System.out.println(Collections.frequency(myNumbers, myPersonalComplexNumber));

        System.out.println("Mixed array");
        Random r = new Random();
        ArrayList<ComplexNumber> copy = (ArrayList<ComplexNumber>) myNumbers.clone();
        Collections.shuffle(copy, r);
        System.out.println(copy);
    }

}
