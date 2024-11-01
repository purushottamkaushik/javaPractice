package design.observer;

public class MobileNotificationObserver  implements PatternObserver{

    private IPhoneObservable observable;
    private String mobile;
    public MobileNotificationObserver(String mobile , IPhoneObservable observable) {
        this.observable = observable;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        System.out.println("sending data to mobile " + mobile );
    }
}
