public class nodes {
    node root;
    static int i=0;
    int Time=0;
    nodes(int value){
        root=new node(value);
    }
    nodes(){
        root=null;
    }
    public void print(node root){
        if(root==null){
            return;
        }
            System.out.println(root.data);
            print(root.left);
            print(root.middle);
            print(root.right);
    }
    public void search(node root,int value){
    
        if(root==null){
            Time++;
            return;
        }
        if(root.data==value){
            Time++;
            System.out.println("Data Found");
            i=1;
            return;
        }else{
            Time+=3;
            search(root.left, value);
            search(root.middle, value);
            search(root.right, value);
            
        }
        
    }
    public static void main(String[] args) {
        nodes n=new nodes();
        n.root=new node(0);
        n.root.left=new node(1551);
        n.root.middle=new node(102);
        n.root.right=new node(10);
        n.root.left.left=new node(1000);
        n.root.middle.left=new node(101);
        n.root.right.left=new node(12);
        n.search(n.root,10);
        if(i!=1){
            System.out.println("Data Not Found");
        }
        System.out.println("Time required = "+n.Time);
        n.print(n.root);
    }
}
class node{
    int data;
    node left;
    node middle;
    node right;
    node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.middle=null;
    }
}