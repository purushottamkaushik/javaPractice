package design.observer;

public interface IPhoneObservable {

    public void createObserver( PatternObserver patternObserver);
    public void removeObserver(PatternObserver patternObserver);
    public void notifyObserver();

    public void setData(int newCount);
    public int getData();
}
