package com.technicaltest;

import java.util.Scanner;

public class GridNode {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ReceiveData();

	}
/**
 * ReceiveData method
 * collects grid size
 * number of coordinates to set
 * enter coordinates and its value
 **/
	private static void ReceiveData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the grid size");
		int gridSize = scanner.nextInt();
		Node gridArray[][] = new Node[gridSize][gridSize];
		System.out.println("How many nodes are you going to set?");
		int nodeSize = scanner.nextInt();
		int row = 0;
		int col = 0;
		OperationImpl obj = new OperationImpl();

		if (nodeSize <= gridSize) {
			for (int i = 0; i < nodeSize; i++) {
				System.out.println("Enter coordinates(x and y)");
				row = scanner.nextInt();
				col = scanner.nextInt();
				gridArray[row][col] = new Node();
				System.out.println("Enter node values");
				gridArray[row][col].value = scanner.nextInt();
				obj.getCooridnates(row, col, gridArray);

			}
		} else {
			System.out.println("Node size exceeds grid size");
		}
	}

}
