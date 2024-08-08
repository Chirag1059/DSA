package Graph;

import java.util.*;

public class Mygraph {
	ArrayList<Integer>[]arr;
	
	Mygraph(){
		arr=new ArrayList[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new ArrayList();
			//System.out.println(arr[i]);
		}
	}
	public void addEdge(int u,int v) {
	
		arr[u].add(v);
		arr[v].add(u);
	}
	public void display() {

		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"->");
			ArrayList<Integer>list=arr[i];
			
			for(Integer nb:list) {
				System.out.print(nb+",");	
			}
			System.out.println();
			
		}
		
	}
}
