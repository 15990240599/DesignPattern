package structuralpattern.bridgepattern.demo;

public class SmsMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("使用系统内部短消息的方法，发送消息%s给%s", message, toUser));
    }
}
