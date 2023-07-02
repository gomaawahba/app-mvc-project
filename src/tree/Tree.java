
package tree;


public class Tree {

    
    public static void main(String[] args) {
        treel t =new treel();
        t.insert(45);
        t.insert(15);
        t.insert(79);t.insert(90);t.insert(10);t.insert(55);t.insert(12);
        t.insert(20);
        t.insert(50);

        System.out.println("Display the binery saerch trea");
        t.preorder(t.root);
        System.out.println("@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@");
        t.postorder(t.root);
        System.out.println("@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@");
        t.inorder(t.root);
    }
    
}
