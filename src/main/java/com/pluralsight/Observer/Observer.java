package com.pluralsight.Observer;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
