package behavioralpattern.mediatorpattern;

/**
 * 聊天室用户类
 *
 */
public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String msg){
        this.chatRoom.showMsg(this, msg);
    }

    public String getName(){
        return name;
    }
}
