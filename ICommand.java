package Abstract;  
  
public interface ICommand {  
    void execute(Action action);  
    void undoExecute();  
}  