package Creational.FactoryMethod;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON\":[]}";
    }
}
