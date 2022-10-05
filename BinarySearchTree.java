

public class BinaryTree {
	
	static TreeNode root;
	
	 static class TreeNode {
		 double item;
		TreeNode left;
		TreeNode right;
		
		//constructor
		TreeNode (double x){
			item = x;
		}//end of constructor
	 }//end of TreeNode	
		
		
		

	 static void treeInsert(double x) 
	 {
	       if ( root == null ) 
	 {
	               // The tree is empty.  Set root to point to a new node 
	               // containing the new item.
	           root = new TreeNode( x );
	           return;
	        }
	        TreeNode runner; // Runs down the tree to find a place for newItem.
	        runner = root;   // Start at the root.
	        while (true) {
	           if ( x < runner.item ) 
	 {
	                    // Since the new item is less than the item in runner,
	                    // it belongs in the left subtree of runner.  If there
	                    // is an open space at runner.left, add a node there.
	                    // Otherwise, advance runner down one level to the left.
	              if ( runner.left == null ) {
	                 runner.left = new TreeNode( x );
	                 return;  // New item has been added to the tree.
	              }
	              else
	                 runner = runner.left;
	           }
	           else 
	 {
	                    // Since the new item is greater than or equal to the 
	                    // item in runner, it belongs in the right subtree of
	                    // runner.  If there is an open space at runner.right, 
	                    // add a new node there.  Otherwise, advance runner
	                    // down one level to the right.
	              if ( runner.right == null ) 
	 {
	                 runner.right = new TreeNode( x );
	                 return;  // New item has been added to the tree.
	              }
	              else
	                 runner = runner.right;
	            }
	        } 
	 // end while
	    } 
	  // end treeInsert()
	
	static int countNodes(TreeNode node) {
		if (node == null) {
			return 0; //in case of an empty tree
		}
		else if  (node.left == null){
			return 1;
		}
		else if (node.right == null) {
			return 1;
		}
		else {
			return countNodes(node.left) + countNodes(node.right);
		}
	}// end of countNodes()
	
	static int sumOfLeaves (TreeNode node, int sum) {
		if (node == null) {
			return 0;
		}
		else if (node.left == null) {
			return sum;
		}
		else if (node.right == null) {
			return sum;
		}
		else {
			return sumOfLeaves(node.left, sum + 1) + sumOfLeaves(node.right, sum + 1);
		}
	}//end of SumofLeaves()
	
	static int maximumDepth(TreeNode node, int numb) {
		if (node == null) {
			return 0; //base case = the node is empty
		}
		else if (node.left == null) {
			return numb;
		}
		else if (node.right == null) {
			return numb;
		}
		else {
			int leftDepth = maximumDepth(node.left, numb + 1);
			int rightDepth = maximumDepth(node.right, numb + 1);
			
			if (leftDepth > rightDepth) {
				return leftDepth;
			}
			else {
				return rightDepth;
			}
		}
	}// end of maximumDepth

	
	 
	 public static void main (String[] args) {
		 
		  TreeNode root = null;
		 
		 //insert 1023 random element in the tree
		 for (int i = 0; i < 1023; i++) {
			 treeInsert(Math.random());
		 }
		 
		 //get the results
		 int numberOfLeaves = countNodes(root);
		 int sumLeaves = sumOfLeaves(root, 0);
		 int maxDepth = maximumDepth(root, 0);
		 double average = (double)sumLeaves / numberOfLeaves;
		 //compute the average of depth of leaves
		 
		 
		 System.out.println("Number of leaves in the Node = " + countNodes(root));
		 System.out.println("Average Depth = " + average);
		 System.out.println("Maximum Depth reached = " + maximumDepth (root, 1));
		 
   }//end of main
	 
}// end of program


	 

	 






