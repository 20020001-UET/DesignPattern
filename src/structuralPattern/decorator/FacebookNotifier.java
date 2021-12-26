package structuralPattern.decorator;

public class FacebookNotifier extends NotifierDecorator {

    public FacebookNotifier(Notifier nextNotifier) {
        super(nextNotifier);
    }

    @Override
    public void send() {
        super.send();
        notifyFb();
    }

    void notifyFb() {
        System.out.println("Fb");
    }
}
