package structuralpattern.bridgepattern.demo;

public class UrgencyMessge extends AbstractMessage {
    public UrgencyMessge(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    //扩展他自己的功能，监控某个消息的处理状态
    public Object watch(String messageId){
        //根据给出的消息编码（meaageId）查询消息的处理状态
        //组织成监控的处理状态，然后返回
        return null;
    }
}
