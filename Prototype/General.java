package Prototype;

import java.nio.channels.UnsupportedAddressTypeException;

public class General extends GameUnit {
    
    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General [state=" + state + 
                    ", position=" + getPosition()
                    +"]";
    }



    @Override
    public GameUnit close() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedAddressTypeException("Reset not supported");
    }

    
}
