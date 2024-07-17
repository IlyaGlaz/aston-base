package com.iglaz.astonbase.lesson9.observer.subject;

import com.iglaz.astonbase.lesson9.observer.observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
