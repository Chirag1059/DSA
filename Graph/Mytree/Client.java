package Mytree;

import java.util.*;

public class Client {
public static void Postorder(TreeNode root) {
		
		if(root==null) {
			return ;
	}
		Preorder(root.left);
		Preorder(root.right);
		System.out.print(root.data+",");
	}
public static void Inorder(TreeNode root) {
		
		if(root==null) {
			return ;
	}
		Preorder(root.left);
		System.out.print(root.data+",");
		Preorder(root.right);
	}

	public static void Preorder(TreeNode root) {
		
		if(root==null) {
			return ;
	}
		System.out.print(root.data+",");
		Preorder(root.left);
		Preorder(root.right);
	}
	
	public static void  path(TreeNode root,String ans) {
		if(root==null) {
		
			return ;
		}
		if(root.left==null && root.right==null) {
			System.out.println(ans+root.data);
			return;
		}
			
		path(root.left,ans+root.data);
		path(root.right,ans+root.data);
		 
		
	}
	public static int  maxpath(TreeNode root) {
		int count=0;
		if(root==null) {
			return 0;
		}
		
		count=(Math.max (maxpath(root.left),maxpath(root.right))+root.data);
		return count;
	}
	
	//BFS
	
	public static void BFS(TreeNode root) {
		LinkedList<TreeNode>q=new LinkedList();
		q.add(root);
		while(q.size()>0) {
			
			//remove the front node
			TreeNode rn=q.removeFirst();
			
			//work on remove node
			
			System.out.println(rn.data);
			
			// add the children
			
			if(rn.left!=null) {
				q.addLast(rn.left);
				
		}
			if(rn.right!=null) {
				q.addLast(rn.right);
				
		}
	}
			
	}
	
	public static void leftview(TreeNode root,int level,HashMap<Integer,Integer>m) {
		
		if(root==null) {
			return;
		}
		if(m.containsKey(level)==false) {
			m.put(level,root.data);
		}
		System.out.println(root.data+"its level is"+level);
		
		leftview(root.left,level+1, m);
		leftview(root.right,level+1,m);
		
		
		
	}
public static void rightview(TreeNode root,int level,HashMap<Integer,Integer>m) {
		
		if(root==null) {
			return;
		}
		if(m.containsKey(level)==false) {
			m.put(level,root.data);
		}
		System.out.println(root.data+"its level is"+level);
		rightview(root.right,level+1,m);
		rightview(root.left,level+1, m);
		
		
		
		
	}
public static void topview(TreeNode root,int x,HashMap<Integer,Integer>m) {
	
	if(root==null) {
		return;
	}
	if(m.containsKey(x)==false) {
		m.put(x,root.data);
	}
	System.out.println(root.data+"its level is"+x);
	rightview(root.right,x+1,m);
	rightview(root.left,x-1, m);
		
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree t=new Tree();
//		Preorder(t.root);
//		System.out.println();
//		Inorder(t.root);
//		System.out.println();
//		Postorder(t.root);
		//1 2 -1 -1 3 4 -1 -1  5 -1 -1
		//path(t.root,"");
		//int a=maxpath(t.root);
		//System.out.println(a);
		BFS(t.root);
		HashMap<Integer,Integer>m=new HashMap();
		leftview(t.root,0,m);
		for(Integer key :m.keySet()) {
			System.out.println(m.get(key));
		}
	}

}
