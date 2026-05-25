package Abstarct;
//Create interface Notification
//
//method send()
//
//        👉 Implement:
//
//EmailNotification
//        SMSNotification
//PushNotification
//
//👉 Use runtime polymorphism.
public interface Notification {

    void send();
}
class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Email notes");
    }
}

class Sms implements Notification{

    @Override
    public void send() {
        System.out.println("Send sms");
    }
}

class Push implements Notification{


    @Override
    public void send() {
        System.out.println("push ");
    }

    public static void main(String[] args) {
        Notification n1 = new Push();
        n1.send();

        Notification n2 = new Sms();
        n2.send();

        Notification n3 = new EmailNotification();
        n3.send();
    }
}


