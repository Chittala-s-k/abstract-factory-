package Abstract;  
  
public class DoorCommand implements  ICommand {  
    private Door door;  
    Action lastAction;  
  
    public DoorCommand()  
    {  
        door = new Door();  
    }  
  
    public void execute(Action doorAction)  
    {  
        switch (doorAction)  
        {  
            case DOOR_OPEN:  
                door.open();  
                break;  
            case DOOR_CLSOE:  
                door.close();  
                break;  
            default:  
                return;  
        }  
        lastAction = doorAction;  
    }  
  
    public void undoExecute()  
    {  
        switch (lastAction)  
        {  
            case DOOR_OPEN:  
                door.close();  
                break;  
            case DOOR_CLSOE:  
                door.open();  
                break;  
            default:  
                return;  
        }  
    }  
}  