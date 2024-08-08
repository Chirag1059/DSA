package Mytree;

import java.util.*;

public class Tree {

	TreeNode root;
	Scanner S=new Scanner(System.in);
	Tree(){
	//	root=Build();
		root=Build_usingBFS();
	}
	
	private TreeNode Build_usingBFS() {
		LinkedList <TreeNode> q =new LinkedList();
		Scanner S=new Scanner(System.in);
		
		int data=S.nextInt();
		TreeNode root=new TreeNode(data);
		
		q.add(root);
			while(q.size()>0) {
			
			//remove the front node
			TreeNode rn=q.removeFirst();
			System.out.println("Enter the left child data"+rn.data);
			int data_for_left=S.nextInt();
			if(data_for_left!=-1) {
				TreeNode leftchild=new TreeNode(data_for_left);
				rn.left=leftchild;
				q.addLast(leftchild);
			}
			System.out.println("Enter the right child data"+rn.data);
			int data_for_right=S.nextInt();
			if(data_for_right!=-1) {
				TreeNode rightchild=new TreeNode(data_for_right);
				rn.right=rightchild;
				q.addLast(rightchild);
			}
			
			}
			return root;
	}
	private TreeNode Build() {
		System.out.println("Enter the data");
		int data=S.nextInt();
		if(data==-1) {
			return null;
		}
		
		TreeNode root=new TreeNode(data);
		System.out.println("Enter the left child data of"+data);
		root.left=Build();
		System.out.println("Enter the right child data of"+data);
		root.right=Build();
		return root;
	}
}
