package com.company;
public class EmptyException extends Exception{
    public EmptyException()
    {
        super("Container is empty!");
    }
}