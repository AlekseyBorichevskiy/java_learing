package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ComplexNumber{
    private int real;
    private int imaginary;
    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double module(){
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }
    public void setReal(int real){
        this.real = real;
    }
    public int getReal(){
        return real;
    }
    public void setImaginary(int imaginary){
        this.imaginary = imaginary;
    }
    public int getImaginary(){
        return imaginary;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ComplexNumber)) return false;
        ComplexNumber num = (ComplexNumber) obj;
        return Objects.equals(real, num.real) &&
                Objects.equals(imaginary, num.imaginary);
    }
    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    @Override
    public String toString() {
        return real + " " + " " + imaginary + "*i" + " module = " + module();
    }
}
