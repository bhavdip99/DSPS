package com.bhavdip.sample.testjava;

public abstract class AbstactClass {
    abstract public void methoda(); // public visibility

    //Out side of the package it wont override
    //    protected abstract void methodb(); // default visibility

    abstract protected void methodc(); // extended visibility

}
