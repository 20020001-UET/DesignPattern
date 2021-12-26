package structuralPattern.decorator;

public class NotifierDecorator implements Notifier {
    Notifier component;
    //Node* next;

    public NotifierDecorator(Notifier nextNotifier) {
        this.component = nextNotifier;
    }

    @Override
    public void send() {
        component.send();
    }
}
