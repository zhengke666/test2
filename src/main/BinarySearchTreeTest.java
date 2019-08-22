/**
 * @author zhengKe
 * @date 2019-08-19 10:41
 * @desc 11
 */
public class BinarySearchTreeTest {
    int data;
    BinarySearchTreeTest right;
    BinarySearchTreeTest left;

    public BinarySearchTreeTest(int i) {
        this.data = i;
        right = null;
        left = null;
    }

    public void insert(BinarySearchTreeTest root,int data){
        if (root.data < data) {
            if (root.right == null){
                root.right = new BinarySearchTreeTest(data);
            }else {
                insert(root.right,data);
            }
        }else {
            if (root.left == null){
                root.left = new BinarySearchTreeTest(data);
            }else {
                insert(root.left,data);
            }
        }

    }

    public void in(BinarySearchTreeTest root){
        if (root != null) {
            in(root.left);
            System.out.print(root.data + " ");
            in(root.right);
        }
    }

    public static void main(String[] args) {
        int[] a = {3,1,5,0,2,7,6,9,10};
        BinarySearchTreeTest root = new BinarySearchTreeTest(a[0]);
        for (int i = 1; i < a.length; i++) {
            root.insert(root,a[i]);
        }
        System.out.println("中序遍历:");
        root.in(root);
    }
}
