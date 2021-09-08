package com.java10.api.practice;

import java.util.HashSet;



class Tree {
	String name;
	
	public  Tree(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Tree) {
			Tree compareObj = (Tree)obj;
			if(name.equals(compareObj.name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Tree [name=" + name + "]";
	}
	
	
}
public class ObjectPractice {

	public static void main(String[] args) {
		Tree t1 = new Tree("은행나무");
		Tree t2 = new Tree("은행나무");
		HashSet<Tree> treeSet = new HashSet<>();
		treeSet.add(t1);
		treeSet.add(t2);
		//프린트 -- 했을 때 은행나무 하나만 나오게
		for(Tree tree : treeSet) {
			System.out.println(tree);
		}
		
	}

}
