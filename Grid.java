package Forest;

import java.util.Arrays;
import java.util.Random;

public class Grid {

	
	private int [][] matrix;
	private int x;
	private int y;
	
	public Grid(int x, int y) {
		this.x = x;
		this.y = y;
        this.matrix = new int [x] [y];
        for (int i=0; i<this.matrix.length; i++) {
            for (int j=0; j<this.matrix[i].length; j++) {
            	this.matrix[i][j] = 0;
                System.out.printf("%-5d", this.matrix [i][j]);
            }
            System.out.println();
        } 
        this.randomiseMatrix();
	}
	
	public void randomiseMatrix() {	
		for(int e = 0; e<this.x; e++) {
			for(int f = 0; f<this.y; f++) {
            	this.matrix[e][f] = (int)  Math.round( Math.random() );
                System.out.printf("%-5d", this.matrix[e][f]);
			}
			System.out.println();
		}
	}
	
}
