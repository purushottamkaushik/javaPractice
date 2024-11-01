package design.observer;

public class EmailNotificationObserver implements PatternObserver{

    private IPhoneObservable observable;
    private String email;
    public EmailNotificationObserver(String email , IPhoneObservable observable) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("sending data to email " + email );
    }
}
