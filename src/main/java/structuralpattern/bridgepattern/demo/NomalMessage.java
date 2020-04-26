package structuralpattern.bridgepattern.demo;

public class NomalMessage extends AbstractMessage{

    //构造方法，传入实现部分的对象
    public NomalMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        //对于普通消息，直接调用父类方法，发送消息即可
        super.sendMessage(message, toUser);
    }
}
