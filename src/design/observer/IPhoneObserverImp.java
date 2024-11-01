package design.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


public class IPhoneObserverImp implements IPhoneObservable{

    int count = 0;
    List<PatternObserver> observers = new ArrayList<>();
    @Override
    public void createObserver(PatternObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PatternObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (PatternObserver observer : observers) {
            observer.update();
        }
    }


    public void setData(int newCount){
        if (count == 0) {
            notifyObserver();
        }
        count = count + newCount;
    }

    public int getData(){
        return count;
    }
}
