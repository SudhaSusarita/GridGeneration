package com.technicaltest;
/*
 * Operations to be performed are implemented
 * Displaying coordinates
 * Displays right neighbour if exists
 * Displays bottom neighbour if exists*/
public class OperationImpl implements Ioperations {

	@Override
	public void getCooridnates(int row, int col, Node[][] node) {
		// TODO Auto-generated method stub
		System.out.println("The coordinates are["+row+""+col+"]");
		if(col+1 <node.length && node[row][col+1]!=null)
			System.out.println("The right neighbour is"+node[row][col+1].toString());
		if( row+1 <node.length && node[row+1][col]!=null)
			System.out.println("The below neighbour is"+node[row+1][col].toString());
	
	}

	
}
