import java.util.*;
import java.lang.*;

//REMAIN

class BSTOPS
{
	public static void main (String[] args)
	{
	    try{
	        // Scanner scan = new Scanner(System.in);        
	        // int N = scan.nextInt();
	        // char Queries[] = new char[N];
	        // int  X_values[] = new int [N];
	        // for(int i=0;i<N;i++){
	        //     Queries[i] = scan.next().charAt(0);
	        //     X_values[i] = scan.nextInt();
	            
	        // }
	           
            // scan.close();
            BST bt = new BST(7);
            bt.insert(10);
            bt.insert(5);
            bt.insert(15);
            bt.insert(1);
            bt.insert(3);
            bt.insert(9);
            bt.insert(18);

	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
	
}

class Node{
    int data;
    Node left;
    Node right;
   
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class BST{
    Node root = null;
    BST(){

    }

    int insert(int data){
        int index = 1;
        if(root == null){
            root = new Node(data);
            index = 1;
        }
        else{
            Node itr = root;
            Node prev = null;
            while(itr != null){
                prev = itr;
                if(data < itr.data){
                    itr = itr.left;
                    index = index *2;
                }
                else if(data > itr.data){
                    itr = itr.right;
                    index = index *2 +1;
                }
            }
            if(data < prev.data)
                prev.left = new Node(data);
            else 
                prev.right = new Node(data);
            
        }
        return index;

    }

    int delete(int data){
        int index = 1;
        if(root == null ){
            index = 0;
        }else{
            Node d[] = find(data);
            if(d != null){
                if(d[1].left == null && d[1].right == null){  // case leaf node
                    if(d[0].data > d[1].data)
                        d[0].left = null;
                    else    
                        d[0].right = null;
                }
                else if(d[1].left != null && d[1].right == null){
                    if(d[0].data > d[1].data){
                        d[0].left = d[1].left;
                    }else
                        d[0].right = d[1].left;
                }
                else if(d[1].right != null && d[1].left == null){
                    if(d[0].data > d[1].data){
                        d[0].left = d[1].right;
                    }else
                        d[0].right = d[1].right;
                }else{
                        
                }
            }
            return index;
        }

    }

    Node[] find(int data){
        if(root == null)
            return null;
        else{
            Node itr = root;
            Node prev = null;
            while(itr != null && itr != data ){
                prev = itr;
                if(data < itr.data)
                    itr = itr.left;
                if(data > itr.data)
                    itr = itr.right;
            }
            Node arr[] = new Node[2];
            arr[0] = prev;
            arr[1] = itr;
            return arr;
        }
    }


}










