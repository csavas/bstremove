//BST FULL TREE
public class BST{
  private BST_Node root;
  BST(){
    root = null;
  }
  public void setRoot(BST_Node n){
    root = n;
  }
  public void add(BST_Node n){
    BST_Node temp = root;
    BST_Node prev = root;
    BST_Node newN = n;
    String finish = "";
    while(temp != null){
      if(temp.getVal() > newN.getVal()){
        prev = temp;
        temp = temp.getL();
        finish = "l";
      }
      else if(temp.getVal() < newN.getVal()){
        prev = temp;
        temp = temp.getR();
        finish = "r";
      }
    }
    if(finish == "r"){
      prev.setR(newN);
    }
    else if(finish == "l"){
      prev.setL(newN);
    }
  }
  
  public void add(int n){
    if(root == null){
      root = new BST_Node(n);
    }
    else{
      BST_Node temp = root;
      BST_Node loc = null;
      while(temp != null){
        loc = temp;
        if(n < temp.getVal()){
          temp = temp.getL();
        }
        else
          temp = temp.getR();
      }
      if(n < loc.getVal()){
        loc.setL(new BST_Node(n));
      }
      else{
        loc.setR(new BST_Node(n));
      }
    }
  }
  
  public void print(){
    preOrder(root);
    System.out.println("\n");
    inOrder(root);
    System.out.println("\n");
    postOrder(root);
  }
  public void union(BST_Node node){ //adds two BST together
    if(node==null)
      return;
    else{
      add(node);
      union(node.getL());
      union(node.getR());
    }
  }
  public BST_Node findSmallest(){
    BST_Node temp = root;
    while(temp.getL() != null){
      temp = temp.getL();
    }
    return temp;
  }
  public BST_Node findBiggest(){
    BST_Node temp = root;
    while(temp.getR() != null){
      temp = temp.getR();
    }
    return temp;
  }
  public int countNodes(BST_Node node, int count){
    if(node!=null){
      count++;
      count += countNodes(node.getL(), count);
      count += countNodes(node.getR(), count);
    }
    return count;
  }
  private void preOrder(BST_Node node){
    if(node==null)
      return;
    else{
      System.out.print(node.getVal() + " ");
      preOrder(node.getL());
      preOrder(node.getR());
    }
  }
  private void inOrder(BST_Node node){
    if(node==null)
      return;
    else{
      inOrder(node.getL());
      System.out.print(node.getVal() + " ");
      inOrder(node.getR());
    }
  }
  private void postOrder(BST_Node node){
    if(node==null)
      return;
    else{
      postOrder(node.getL());
      postOrder(node.getR());
      System.out.print(node.getVal() + " ");
    }
  }
}