package com.dr34mh4ck.lca.model;

public class Node {
	
	private Long value;
	
	public Node(Long value){
		this.value = value;
	}
	
	private Node left;
	private Node right;
	
	public Long getValue(){
		return value;
	}
	
	public void push(Node node){
		if(this.value == null){
			this.value = node.getValue();
		}else if(this.value.compareTo(node.getValue()) == 0){
			System.out.println("No duplicates are allowed!");
		}else if(this.value > node.getValue()){
			if(this.left == null){
				this.left = node;
			}else{
				this.left.push(node);
			}
		}else if(this.value < node.getValue()){
			if(this.right == null){
				this.right = node;
			}else{
				this.right.push(node);
			}
		}
	}
	
	public boolean exist(Node node){
		boolean exist = false;
		if(node == null || node.getValue() == null){
			return exist;
		}else if(node.getValue().compareTo(this.value) == 0){
			exist = true;
		}else{
			if(node.getValue().compareTo(this.value) > 0){
				if(this.right != null){
					exist = this.right.exist(node);
				}
			}else if(node.getValue().compareTo(this.value) < 0){
				if(this.left != null){
					exist = this.left.exist(node);
				}
			}
		}
		return exist;
	}

	
	public void printPreorder(){
		if(this.value == null){
			System.out.println("-");
		}else{
			
			System.out.println(this.value);
			
			if(this.left != null){
				this.left.printPreorder();
			}
			
			if(this.right != null){
				this.right.printPreorder();
			}
		}
	}
	
	public void printInorder(){
		if(this.value == null){
			System.out.println("-");
		}else{
			if(this.left != null){
				this.left.printPreorder();
			}
			
			System.out.println(this.value);
			
			if(this.right != null){
				this.right.printPreorder();
			}
		}
	}
	
	public void printPostorder(){
		if(this.value == null){
			System.out.println("-");
		}else{
			if(this.left != null){
				this.left.printPreorder();
			}
			
			if(this.right != null){
				this.right.printPreorder();
			}
			
			System.out.println(this.value);
		}
	}

}
