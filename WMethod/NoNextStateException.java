

// TODO: Auto-generated Javadoc
/**
 * 
 Coded by: Aditya Mathur
 March 17, 2004.
 
 For use in class State when no next state is found for an input symbol.
 
 */
public class NoNextStateException extends Exception{
  

  /** The m. */
  private String m;
  
  
  /**
   * Instantiates a new no next state exception.
   */
  public NoNextStateException()
  {
    super("No next state found");
    
  }
  
  /**
   * Instantiates a new no next state exception.
   *
   * @param message the message
   */
  public NoNextStateException(String message)
  {
    super(message);
    m=message;
  }
  
  /**
   * Message.
   *
   * @return the string
   */
  public String message()
  {
    return(m);
  }
  
}
