package algo.graph;

import java.util.EmptyStackException;
import java.util.Stack;

import algo.graph.interfaces.IGraph;
import algo.graph.interfaces.INode;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGraph test = new Graph();
		test.addRoute("Lille", "Paris", 100);
		test.addRoute("Paris", "Nantes", 50);
		test.addRoute("Nantes", "Bordeaux", 500);
		test.addRoute("Biarriz", "Bordeaux", 20);
		test.addRoute("Paris", "Lyon", 450);
		test.addRoute("Lyon", "Valence", 15);
		test.addRoute("Montpellier", "Valence", 30);
		test.addRoute("Lyon", "Grenoble", 100);
		test.addRoute("Gap", "Grenoble", 5);
		test.addRoute("Genève", "Grenoble", 10);
		test.addRoute("Gap", "Nice", 3);
		test.addRoute("Genève", "Mulhouse", 50);
		test.addRoute("Strasbourg", "Mulhouse", 15);
		test.addRoute("Paris", "Mulhouse", 200);
		test.addRoute("Lyon", "Mulhouse", 100);
		
		Stack<INode> find = test.findRoute("Lille", "Nice").export();
		while(true){
			try {
				System.out.println(find.pop());
			} catch (EmptyStackException e) {
				break;
			}
			
		}
	}

}