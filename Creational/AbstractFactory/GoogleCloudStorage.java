package Creational.AbstractFactory;

public class GoogleCloudStorage implements Storage {
    
    public GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated "+capacityInMib+" on Google Cloud Storage");
    }

    @Override
    public String toString() {
        return "gcpcs1";
    }

    @Override
    public String getId() {
        return "Google cloud Storage";
    }

    
}
