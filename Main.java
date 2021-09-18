package Abstract; 
  
public class Main {  
  
    public static void main(String[] args) {  
        ICommand command = new DoorCommand();  
        command.execute(DOOR_OPEN);  
        command.execute(DOOR_CLSOE);  
        command.undoExecute();  
    }  
}  