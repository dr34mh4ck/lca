package com.dr34mh4ck.lca.main;

import com.dr34mh4ck.lca.model.Node;

public class Main {
	
	public static void main(String[] args) {
		Node tree = new Node(1L);
		
		for(int i = 0; i< 20; i++){
			tree.push(new Node(new Long(i)));
		}
		
		System.out.println("Finished creating tree!");
		
		System.out.println("exist 15: "+tree.exist(new Node(new Long(15))));
		System.out.println("exist 0: "+tree.exist(new Node(new Long(0))));
		System.out.println("exist 24: "+tree.exist(new Node(new Long(24))));
		
		tree.printPreorder();
	}

}
