package Creational.AbstractFactory;

import Creational.AbstractFactory.Instance.Capacity;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
    
}
