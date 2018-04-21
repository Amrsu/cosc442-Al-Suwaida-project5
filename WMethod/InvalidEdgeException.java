

// TODO: Auto-generated Javadoc
/**
 * 
 Coded by: Aditya Mathur
 March 17, 2004.
 
 For use in class State when no next state is found for an input symbol.
 
 */
public class InvalidEdgeException extends Exception {
  

  /** The m. */
  private String m;
  
  
  /**
   * Instantiates a new invalid edge exception.
   */
  public InvalidEdgeException()
  {
    super("Edge head state does not match with state ID");
    
  }
  
  /**
   * Instantiates a new invalid edge exception.
   *
   * @param message the message
   */
  public InvalidEdgeException(String message)
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
