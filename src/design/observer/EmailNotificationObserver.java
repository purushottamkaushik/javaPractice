package design.observer;

public class MobileNotificationObserver  implements PatternObserver{

    private PatternObserver observer;
    private String mobile;
    public MobileNotificationObserver(String mobile , PatternObserver observer) {
        this.observer = observer;
    }

    @Override
    public void update() {
        System.out.println("sending data to mobile " + mobile );
    }
}
