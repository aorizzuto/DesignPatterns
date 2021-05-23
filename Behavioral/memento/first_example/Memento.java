package Behavioral.memento.first_example;

class Memento 
{
    private String state;
 
    public Memento(String stateToSave)
    {
        state = stateToSave; 
    }

    public String getSavedState()
    {
        return state; 
    }
}