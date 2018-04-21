import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * 
 An EdgeSet is a collection of edges. An edge is an Edge.
 
 Aditya Mathur
 Last update: March 17, 2004.
 
 */

public class EdgeSet {
  
  
  /** The edges. */
  private  HashSet edges; // Contains a set of outgoing edges from a state (node).
  
  /** The number of edges. */
  private int numberOfEdges; // Actual number of elements in the set.
  
  /**
   * Instantiates a new edge set.
   */
  public EdgeSet(){
    edges=new HashSet();  // Create a new empty set of edges.
    numberOfEdges=0;  // Empty set.
  }
  
  /**
   * Instantiates a new edge set.
   *
   * @param e the e
   */
  public EdgeSet(Edge e){
    super();
    addEdge(e);
  }
  
  // Add an edge.
  
  /**
   * Adds the edge.
   *
   * @param e the e
   */
  public void addEdge(Edge e){
    edges.add(e);
    numberOfEdges++; // One element added.
  }
  
  /**
   * Removes the edge.
   *
   * @param e the e
   */
  public void removeEdge(Edge e){
    edges.remove(e);
    numberOfEdges--; // One element deleted.
  }
  
  /**
   * Gets the edge set.
   *
   * @return the edge set
   */
  public HashSet getEdgeSet(){
    return(edges);
  }
  
  /**
   * Gets the edge count.
   *
   * @return the edge count
   */
  public int getEdgeCount(){
    return (edges.size());
  }
  
  
  /**
   * Prints the edge set.
   *
   * @param es the es
   */
  public static void printEdgeSet(EdgeSet es){
    HashSet e=new HashSet();
    e=es.getEdgeSet();
    Iterator E=e.iterator();
    while(E.hasNext())
    {
      Edge nextEdge=(Edge)E.next();
      System.out.println(nextEdge.head()+" "+ nextEdge.input()+" "+ nextEdge.output()+" "+ nextEdge.tail());
    }
  }
  
}// End of class EdgeSet.
