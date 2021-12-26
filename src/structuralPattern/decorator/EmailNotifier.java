package structuralPattern.decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Email");
    }
}
