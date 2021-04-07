package ClassActivities.Searching.BinarySearchTree;

public class BS_tree implements SymbolTable {

    private BS_node root = null;

    @Override
    public void insert(int value) {
        if(root == null){
            root = new BS_node(value);
        } else {
            root.insert(value);
        }
    }

    @Override
    public boolean find(int value) {
        if(root == null){
            return false;
        } else{
            return root.find(value);
        }
    }


}
