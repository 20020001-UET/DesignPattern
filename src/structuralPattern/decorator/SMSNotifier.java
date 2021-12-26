package structuralPattern.decorator;

public class SMSNotifier extends NotifierDecorator {

    public SMSNotifier(Notifier nextNotifier) {
        super(nextNotifier);
    }

    @Override
    public void send() {
        super.send();
        notifySMS();
    }

    void notifySMS() {
        System.out.println("SMS");
    }
}
