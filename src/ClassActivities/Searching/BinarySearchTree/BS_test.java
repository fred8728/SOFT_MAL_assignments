package ClassActivities.Searching.BinarySearchTree;

public class BS_test {

    public static void main(String[] args) {
        BS_tree bst = new BS_tree();
        bst.insert(7);
        bst.insert(23);
        bst.insert(13);
        bst.insert(44);

        for (int i = 0; i < 25; i++) {
            System.out.println(i + " " + bst.find(i));
        }


    }
}
