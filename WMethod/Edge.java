
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * 
 Defines an edge in a finite state machine.
 
 An edge is a pair  (source, target) where is the source node and j is the destination node.
 An edge also has a label a/b where a is an input symbol, and b is an output symbol.
 
 Programmer: Aditya Mathur
 First version: March 16, 2004
 Last revision: March 22, 2004
 */

public class Edge {
  
  /** The source state. */
  private int sourceState;
  
  /** The target state. */
  private int targetState;
  
  /** The label. */
  private String label;
  
  /** The output symbol. */
  private String inputSymbol, outputSymbol;
  
  /** The cost. */
  private int cost; // Cost of traversing this edge.
  
  /**
   * Instantiates a new edge.
   *
   * @param sourceID the source ID
   * @param targetID the target ID
   * @param inputS the input S
   * @param outputS the output S
   */
  public Edge(int sourceID, int targetID, String inputS, String outputS)
  {
    sourceState=sourceID;
    targetState=targetID;
    inputSymbol=inputS;
    outputSymbol=outputS;
    label=inputSymbol+"/"+outputSymbol;
    cost=1;  // Default cost of traversal.
  }
  
  /**
   * Instantiates a new edge.
   *
   * @param sourceID the source ID
   * @param targetID the target ID
   */
  public Edge(int sourceID, int targetID)
  {
    sourceState=sourceID;
    targetState=targetID;
    inputSymbol="Input  Unknown";
    outputSymbol="Output Unknown";
    label=inputSymbol+"/"+outputSymbol;
    cost=1;  // Default cost of traversal.
  }
  
  /**
   * Instantiates a new edge.
   *
   * @param sourceID the source ID
   * @param targetID the target ID
   * @param costOfTraversal the cost of traversal
   */
  public Edge(int sourceID, int targetID, int costOfTraversal)
  {
    sourceState=sourceID;
    targetState=targetID;
    inputSymbol="Input  Unknown";
    outputSymbol="Output Unknown";
    label=inputSymbol+"/"+outputSymbol;
    cost=costOfTraversal;  // Given cost of traversal.
  }
  
  /**
   * Instantiates a new edge.
   */
  public Edge()
    
  {
    label="No label";
    cost=1; // Default cost.
  }
  
  /**
   * Display edge.
   *
   * @return the string
   */
  public String displayEdge()
  {
    
    return("("+Integer.toString(sourceState)+","+Integer.toString(targetState)+")"+" Label: " +label);
  }
  
  /**
   * Head.
   *
   * @return the int
   */
  public int head()
  {
    return(sourceState);
  }
  
  /**
   * Tail.
   *
   * @return the int
   */
  public int tail()
  {
    return(targetState);
  }
  
  /**
   * Gets the label.
   *
   * @return the label
   */
  public String getLabel()
  {
    return(label);
  }
  
  /**
   * Input.
   *
   * @return the string
   */
  // Return input symbol for this edge.
  public String input()
  {
    return(inputSymbol);
    
  }
  
  /**
   * Output.
   *
   * @return the string
   */
  // Return output symbol for this edge.
  public String output()
  {
    return(outputSymbol);
    
  }
  
  /**
   * Gets the cost.
   *
   * @return the cost
   */
  public int getCost()
  {
    return(cost);
  }
}
