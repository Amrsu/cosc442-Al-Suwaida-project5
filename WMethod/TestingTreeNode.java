/*
 * Author: Brandon Wuest.
 */
import java.io.*;
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class TestingTreeNode.
 */
public class TestingTreeNode{
  
  /** The current state. */
  State currentState;
  
  /** The marked state. */
  boolean markedState;
  
  /** The vertex num. */
  int vertexNum;
  
  /** The level. */
  int level;
  
  /** The branch vector. */
  Vector branchVector;
  
  /**
   * Instantiates a new testing tree node.
   *
   * @param s1 the s 1
   */
  public TestingTreeNode(State s1){
    
    currentState = s1;
    branchVector = new Vector();
    markedState = false;
    vertexNum = 0;
    level = 0;
    
  }
  
  /**
   * Instantiates a new testing tree node.
   *
   * @param s1 the s 1
   * @param vertexNumber the vertex number
   * @param lev the lev
   */
  public TestingTreeNode(State s1, int vertexNumber, int lev){
    currentState = s1;
    branchVector = new Vector();
    markedState = false;
    vertexNum = 0;
    level = lev;
    
  }
  
  /**
   * Instantiates a new testing tree node.
   *
   * @param s1 the s 1
   * @param bv the bv
   * @param ms the ms
   * @param vn the vn
   */
  public TestingTreeNode(State s1, Vector bv, boolean ms, int vn){
    currentState = s1;
    branchVector = bv;
    markedState = ms;
    vertexNum = vn;
    
  }
  
  /**
   * Instantiates a new testing tree node.
   *
   * @param s1 the s 1
   * @param vertexNumber the vertex number
   */
  public TestingTreeNode(State s1, int vertexNumber)
  {
    
    currentState = s1;
    branchVector = new Vector();
    markedState = false;
    vertexNum = vertexNumber;
  }
  
  
  
  /**
   * Prints the node.
   */
  public void printNode(){
    System.out.println("PRINTING NODE");
    System.out.println("CurrentState: " + currentState.getID());
    
    if(branchVector.isEmpty()){
      System.out.println("BranchVector: " + "EMPTY");
    }else{
      Iterator branchIterator = branchVector.iterator();
      while(branchIterator.hasNext()){
        TestingTreeBranch current = (TestingTreeBranch) branchIterator.next();
        current.printBranch();
        
      }
    }
  }
  
  /**
   * Return copy.
   *
   * @return the testing tree node
   */
  public TestingTreeNode returnCopy(){
    return new TestingTreeNode(currentState, branchVector, markedState, vertexNum);
    
  }
}