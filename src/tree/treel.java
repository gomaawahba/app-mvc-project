
package tree;

public class treel {
    node  root;
    public treel(){
        root=null;
    }
   node insert(node r,int item){
       if(r==null){
           node newnode=new node();
           r=newnode;
       }else if(r.data>item){
           r.left=insert(r, item);
       }else{
           r.right=insert(r, item);
       }
       return r;
   }
   
   public void insert(int item){
       root=insert(root, item);
   }
   //root left right
   public void  preorder(node r){
       if(r==null){
          // return;
           System.out.println(r.data);
           preorder(r.left);
           preorder(r.right);
           
       }
       
   }
      public void  inorder(node r){
       if(r==null){
          // return;
          preorder(r.left);
           System.out.println(r.data);
           
           preorder(r.right);
           
       }
       
   }
     public void  postorder(node r){
       if(r==null){
          // return;
          preorder(r.left);
           preorder(r.right);
          
           System.out.println(r.data);
           
          
           
       }
     }
}
