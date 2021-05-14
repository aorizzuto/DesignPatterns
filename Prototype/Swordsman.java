package Prototype;

public class Swordsman extends GameUnit {
    
    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman [state=" + state + 
                        ", position=" + getPosition() +
                        "]";
    }

    @Override
    protected void reset() {
        state = "idle";
    }
    
}
