package algo.graph;
import java.util.ArrayList;
import java.util.List;

import algo.graph.interfaces.INode;
import algo.graph.interfaces.IRelation;


public class Node implements INode{
	
	List<IRelation> relations;
	String name;
	
	public Node(String inname){
		name = inname;
		relations = new ArrayList<>();
	}
	public String getName(){
		return name;
	}
	@Override
	public List<IRelation> getRelations() {
		return relations;
	}
	@Override
	public void addRelation(IRelation inrelation) {
		relations.add(inrelation);
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}
