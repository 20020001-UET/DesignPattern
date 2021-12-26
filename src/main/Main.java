package main;

import structuralPattern.decorator.EmailNotifier;
import structuralPattern.decorator.FacebookNotifier;
import structuralPattern.decorator.Notifier;
import structuralPattern.decorator.SMSNotifier;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier(); // Email
        notifier = new SMSNotifier(notifier); // SMS -> Email
        notifier = new FacebookNotifier(notifier); // Fb -> SMS -> Email
        notifier.send();
    }
}
