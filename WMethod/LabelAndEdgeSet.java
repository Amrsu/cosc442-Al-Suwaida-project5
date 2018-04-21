
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * 
 LabelAndEdgeSet consists of a string a/b indicating the label of an edge.
 a is the input symbol and b the corresponding output symbol.
 
 A label is also associated with a set of edges for which this is the label.
 
 Coded by: Aditya Mathur
 March 17, 2004.
 
 */
public class LabelAndEdgeSet {
  
  
  /** The label. */
  private String label;  // The actual label of kind a/b.
  
  /** The edges with label. */
  private Set edgesWithLabel; // Set of edges for which "label" is the label.
  
  
  /**
   * Instantiates a new label and edge set.
   */
  public LabelAndEdgeSet(){
    label=""; // No label assigned yet.
    edgesWithLabel=new HashSet(); // No correspnding edges.
  }
  
  /**
   * Instantiates a new label and edge set.
   *
   * @param l the l
   */
  public LabelAndEdgeSet(String l){
    label="l"; // No label assigned yet.
    edgesWithLabel=new HashSet(); // No correspnding edges.
  }
  
  /**
   * Gets the label.
   *
   * @return the label
   */
  public String getLabel(){
    return(label);
  }
  
  /**
   * Gets the label edges.
   *
   * @return the label edges
   */
  public Set getLabelEdges(){
    return(edgesWithLabel);
  }
  
  /**
   * Adds the edge.
   *
   * @param e the e
   */
  public void addEdge(Edge e){
    edgesWithLabel.add(e);
  }
  
  /**
   * Adds the label.
   *
   * @param l the l
   */
  public void addLabel(String l){
    label=l;
  }
}// End of class LabelAndEdgeSet
