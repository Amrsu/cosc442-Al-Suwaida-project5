
/*
 * Author: Brandon Wuest.
 */

import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * 
 This class defines a state of any finite state machine. 
 A state has a name, description, and a set of zero or more outgoing edges.
 Several useful methods allow the extraction of this information given a state.
 
 Written by (and copyright): Aditya P. Mathur
 Date started: March 12, 2004
 V1.0 completed:  March 12, 2004
 Last revision: March 22,  2004.
 
 */

public class State {
  
  
  /** The id. */
  private int  ID; // Unique ID given to each state. (>=0)
  
  /** The description. */
  String description; // State description
  
  /** The out going edges. */
  private HashSet outGoingEdges; // Set of outgoing edges.
  
  /** The uio sequence. */
  private String uioSequence; // UIO sequence for this state.
  
  /** The state mark. */
  private boolean stateMark=false;  // State marker useful in some algorithms.
  
  /** The number of visits. */
  private int numberOfVisits=0;  // Number of times this state is visited.
  
  /** The max edges. */
  int maxEdges=20; // Max number of outgoing edges from any state.
  
  
  // Define a state.
  
  /**
   * Instantiates a new state.
   *
   * @param stateID the state ID
   */
  public State(int stateID){
    if(ID<0){
      System.out.println("ID must be an integer>0. State not initialized.");
      System.exit(0);
    }
    ID=stateID;
    description="No description yet.";
    outGoingEdges=new HashSet(); // Initialize the set of outgoing  edges to empty.
    uioSequence=""; // UIO sequence not found yet.
    stateMark=false;
  }
  
  // Set (true), unset(false), and get mark.
  
  /**
   * Mark.
   */
  public void mark(){
    stateMark=true;
  }
  
  /**
   * Un mark.
   */
  public void unMark(){
    stateMark=false;
  }
  
  
  /**
   * Gets the mark.
   *
   * @return the mark
   */
  public boolean getMark(){
    return(stateMark);
  }
  
  // Add to visits, initialize visits, return visits.
  
  /**
   * State visited.
   */
  public void stateVisited(){
    numberOfVisits++;
  }
  
  /**
   * Reset visits.
   */
  public void resetVisits(){
    numberOfVisits=0;
  }
  
  /**
   * Sets the visits.
   *
   * @param v the new visits
   */
  public void setVisits(int v){
    numberOfVisits=v;
  }
  
  
  /**
   * Gets the visits.
   *
   * @return the visits
   */
  public int getVisits(){
    return(numberOfVisits);
  }
  
  // Add an edge to this state.
  // Note that the start state of e must be the same as ID.
  
  /**
   * Adds the edge.
   *
   * @param e the e
   * @throws InvalidEdgeException the invalid edge exception
   */
  public void addEdge(Edge e) throws InvalidEdgeException{
    if (!(e.head()==ID))throw new InvalidEdgeException();
    outGoingEdges.add(e);
  }
  
  
  /**
   * Removes the edge.
   *
   * @param e the e
   */
  public void removeEdge(Edge e){
    outGoingEdges.remove(e);
  }
  
  
  
  /**
   * Gets the edge set.
   *
   * @return the edge set
   */
  public HashSet  getEdgeSet(){
    return(outGoingEdges);
  }
  
  /**
   *    Return ID.
   *
   * @return the id
   */
  
  public int getID(){
    return ID;
  }
  
  /**
   *    Return number of outgoing edges.
   *
   * @return the int
   */
  
  public int edgeCount(){
    return (outGoingEdges.size());
  }
  
  /**
   *    Return next state ID when an input symbol is received.
   *
   * @param inputSymbol the input symbol
   * @return the next state
   * @throws NoNextStateException the no next state exception
   */
  
  public  Edge getNextState(String inputSymbol) throws  NoNextStateException{
    Iterator E=outGoingEdges.iterator();
    while (E.hasNext())
    {
      Edge temp=(Edge)E.next();
      if (temp.input().equals(inputSymbol)) return(temp);
    }
    throw new NoNextStateException(inputSymbol);
  }
  
  
  /**
   *    Return the set of next states.
   *
   * @return the next states
   */
  
  public  HashSet getNextStates() {
    HashSet nextStateSet=new HashSet();
    HashSet e=new HashSet();
    e=outGoingEdges;
    Iterator E=e.iterator();
    while (E.hasNext())
    {
      Edge temp=(Edge)E.next();
      nextStateSet.add(new Integer(temp.tail()));
    }
    return(nextStateSet);
  }
  
  /**
   *    Return the set of outgoing edge labels.
   *
   * @return the labels
   */
  
  public  HashSet getLabels() {
    HashSet labels=new HashSet();
    HashSet e=new HashSet();
    e=outGoingEdges;
    Iterator E=e.iterator();
    while (E.hasNext())
    {
      Edge temp=(Edge)E.next();
      labels.add(temp.getLabel());
    }
    return(labels);
  }
  
}// End of class State
