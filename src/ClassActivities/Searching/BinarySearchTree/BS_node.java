package ClassActivities.Searching.BinarySearchTree;

public class BS_node implements SymbolTable {

    private int value;
    private BS_node left = null;
    private BS_node right = null;

    public BS_node(int value) {
        this.value = value;
    }

    @Override
    public void insert(int value) {
        if(this.value == value){
            return;
        }
        if(value < this.value){
            if(left == null){
                left = new BS_node(value);
            } else {
                left.insert(value);
            }
        }else {
            if(right == null){
                right = new BS_node(value);
            } else {
                right.insert(value);
            }
        }
    }

    @Override
    public boolean find(int value) {
        if(this.value == value){
            return true;
        }
        if(value < this.value){
            if(left == null){
                return false;
            }
            return left.find(value);
        } else {
            if(right == null){
                return false;
            }
            return right.find(value);
        }
    }
}
