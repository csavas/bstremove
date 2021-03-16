//BST RUNNER -- RUNS THE STUFF
public class BST_NodeRunner{
  public static void main(String[] arg){
    BST_Node jeffie = new BST_Node(10);
    BST_Node taylor = new BST_Node(3);
    System.out.println(jeffie);
    jeffie.setL(taylor);
    System.out.println(jeffie.getL());
    System.out.println(jeffie.getR());
  }
}