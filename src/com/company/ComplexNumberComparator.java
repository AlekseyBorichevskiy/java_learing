package com.company;

import java.util.Comparator;

public class ComplexNumberComparator implements Comparator<ComplexNumber> {
    @Override
    public int compare(ComplexNumber o1, ComplexNumber o2) {
        if(o1.module() > o2.module()){
            return 1;
        }
        else if(o1.module() < o2.module()){
            return -1;
        }
        return 0;
    }
}
