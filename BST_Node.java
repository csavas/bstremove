//BINARY SEARCH TREE NODE
public class BST_Node{
  private Integer val;
  private BST_Node left;
  private BST_Node right;
  
  BST_Node(int v){
    val = v;
    left=null;
    right=null;
  }
  public void setL(BST_Node node){
    left = node;
  }
  public void setR(BST_Node node){
    right = node;
  }
  public BST_Node getL(){
    return left;
  }
  public BST_Node getR(){
    return right;
  }
  public int getVal(){
    return val;
  }
  public String toString(){
    return ""+val;
  }
}