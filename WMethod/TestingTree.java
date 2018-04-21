
/*
 * Author: Brandon Wuest.
 */

import java.io.*;
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class TestingTree.
 */
public class TestingTree{

  
  /** The all states. */
  State [] allStates;  //all possible states in the tree
  
  /** The number of states. */
  int numberOfStates;  //total number of states
  
  /** The root. */
  TestingTreeNode root;  //root node
  
  /** The vertex nums. */
  int vertexNums;   //largest vertex number (for BFS)
  
  /** The BFS tree queue. */
  Vector BFSTreeQueue;  //queue for BFS tree
  
  /** The p values. */
  Vector pValues;   //vector of all values found for P-set
  
  /** The states in tree. */
  Vector<Integer> statesInTree;  //listing of all states currently in the tree
  
  /** The count. */
  int count;
  
  /* Constructor method for tree */
  
  /**
   * Instantiates a new testing tree.
   *
   * @param stateArray the state array
   * @param numOfStates the num of states
   */
  public TestingTree(State [] stateArray, int numOfStates){
    
    //initialize all variables
    vertexNums = 1;
    allStates = stateArray;
    numberOfStates = numOfStates;
    root = new TestingTreeNode(stateArray[1], vertexNums);
    vertexNums++;
    pValues = new Vector();
    statesInTree = new Vector();
    BFSTreeQueue = new Vector();
    
    statesInTree.add(new Integer(root.currentState.getID()));
    
    //Now that the root has been initialized, build the tree
    BFSBuild(root);
    
    // Traverse the tree and collect the el;ements of the transition cover set (P).
    testTraverse(root, "");
    // Print the transition cover set (P).
    if(Utilities.transitionCoverSetDebugSw)
      printPValues();
    
  }// End of testingTree()
  
  
  /* Returns true if a node is already in the statesInTree array, or more specifically,
   whether that state has been 'looked at' during the BFS. */
  
  /**
   * Found already.
   *
   * @param stateNumber the state number
   * @return true, if successful
   */
  public boolean foundAlready(int stateNumber){
    int count = 0;
    
    while(count < statesInTree.size()){
      Integer b = (Integer) statesInTree.get(count);
      if(b.intValue() == stateNumber){
        return true;
      }
      count++;
    }
    return false;
  }// End of foundAlready()
  
  
  /* Prints all values in the P vector. */
  
  /**
   * Prints the P values.
   */
  public void printPValues(){
    int i = 0;
    System.out.println("\nTransition cover set (P). "+ (pValues.size()+1)+" entries.");
    System.out.print("Empty " );
    Collections.sort(pValues);
    while(i < pValues.size()){
      System.out.print(pValues.get(i).toString()+" ");
      i++; 
    }   
    System.out.println();
  }// End of printPValues()
  
  /**
   * Gets the p values.
   *
   * @return the p values
   */
  public Vector getPValues(){
    
    return pValues;
    
  }//End of getPValues()
  
  /* Build the testing tree. */
  
  /**
   * BFS build.
   *
   * @param startState the start state
   */
  public void BFSBuild(TestingTreeNode startState){
    TestingTreeNode startingNode = startState;
    startState.level = 1;
    BFSTreeQueue.add((Object) startingNode);
    int lastLevel = 1;
    
    while(!BFSTreeQueue.isEmpty()){
      TestingTreeNode currentNode = (TestingTreeNode) BFSTreeQueue.firstElement();
      BFSTreeQueue.removeElementAt(0);
      Utilities.debugTestingTree("Currently examining:" + currentNode.currentState.getID());
      
      if(!foundAlready(currentNode.currentState.getID())) { 
        statesInTree.add(new Integer(currentNode.currentState.getID()));
      }
      
      lastLevel = currentNode.level;
      HashSet currentNodeEdges = new HashSet(currentNode.currentState.getEdgeSet());
      Iterator edgeIterator = currentNodeEdges.iterator();
      while(edgeIterator.hasNext()) {
        Edge nextEdge = (Edge) edgeIterator.next();
        State nextState = allStates[nextEdge.tail()];
        TestingTreeNode nextNode = new TestingTreeNode(nextState, vertexNums, currentNode.level + 1);
        vertexNums++;
        
        
        if(!foundAlready(nextNode.currentState.getID())){ //this is another "internal node", expand it
          currentNode.branchVector.add(new TestingTreeBranch(nextEdge.input(), nextNode));
          statesInTree.add(new Integer(nextNode.currentState.getID()));
          Utilities.debugTestingTree("Adding to queue:" + nextNode.currentState.getID() + " at level: " + nextNode.level);
          Utilities.debugTestingTree("Making a branch from " + currentNode.currentState.getID() + " to "  + 
                                     nextNode.currentState.getID());
          Utilities.debugTestingTree("Branch Vector Size: " + currentNode.branchVector.size());
          BFSTreeQueue.add((Object) nextNode);
          
        }else{ //it's going to be a leaf...
          
          currentNode.branchVector.add(new TestingTreeBranch(nextEdge.input(), nextNode));
          Utilities.debugTestingTree("Making a leaf from " + currentNode.currentState.getID() + " to "  + 
                                     nextNode.currentState.getID());
          Utilities.debugTestingTree("Branch Vector Size: " + currentNode.branchVector.size());
          
        }//else
      } //while
    }
  }// End of BFSBuild()
  
  
  /* Traverse the tree and gather the P set. */
  
  /**
   * Test traverse.
   *
   * @param root the root
   * @param currentString the current string
   */
  public void testTraverse(TestingTreeNode root, String currentString){
    int count = 0;
    while(count < root.branchVector.size()){
      //Visit each branch, print its value
      TestingTreeBranch currentBranch = (TestingTreeBranch) root.branchVector.get(count);
      currentString = currentString.concat(currentBranch.inputValue);
      pValues.add(currentString);
      testTraverse(currentBranch.nextState, currentString);
      currentString = currentString.substring(0, currentString.length() - 1);
      count++;
    } 
  }// End of testTraverse()
  
}// End of class testingTree