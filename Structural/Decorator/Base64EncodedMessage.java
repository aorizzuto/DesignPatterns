package Structural.Decorator;

import java.util.Base64;

// Decorator
public class Base64EncodedMessage implements Message {

    private Message msg;

    public Base64EncodedMessage(Message msg){
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
    
}
