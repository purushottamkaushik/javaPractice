package design.observer;

public class Main {
    public static void main(String[] args) {
        IPhoneObservable observable = new IPhoneObserverImp();
        EmailNotificationObserver emailNotificationObserver =
                new EmailNotificationObserver("Hello@email.com",observable);
        EmailNotificationObserver emailNotificationObserver1 = new EmailNotificationObserver(
                "Demo@gmail.com",observable
        );

        MobileNotificationObserver mobileNotificationObserver  =
                new MobileNotificationObserver("898989",observable);

        observable.createObserver(emailNotificationObserver);
        observable.createObserver(emailNotificationObserver1);
        observable.createObserver(mobileNotificationObserver);

        observable.setData(10);
    }
}
