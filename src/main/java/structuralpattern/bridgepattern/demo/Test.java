package structuralpattern.bridgepattern.demo;

public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NomalMessage(message);
        abstractMessage.sendMessage("加班申请速批", "x总");

        message = new EmailMeaage();
        abstractMessage = new UrgencyMessge(message);
        abstractMessage.sendMessage("加班申请速批", "x总");
    }
}
