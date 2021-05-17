package Structural.Decorator;


public class Client {
    public static void main(String[] args) {
        Message m = new TextMessage("The <FORCE> is string with this one.");
        System.out.println(m.getContent());

        Message decorator = new Base64EncodedMessage(m);
        System.out.println(decorator.getContent());
    }
    
}
