
import java.io.*;
import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class TestingTreeBranch.
 */
public class TestingTreeBranch{
  
  /** The input value. */
  String inputValue;
  
  /** The next state. */
  TestingTreeNode nextState;
  
  /**
   * Instantiates a new testing tree branch.
   *
   * @param input the input
   * @param next the next
   */
  public TestingTreeBranch(String input, TestingTreeNode next){
    
    inputValue = input;
    nextState = next;
    
  }
  
  /**
   * Prints the branch.
   */
  public void printBranch(){
    
    System.out.println("PRINTING BRANCH");
    System.out.println("Input Value: " + inputValue);
    System.out.println("Next State (Node):");
    nextState.printNode(); 
  }
}