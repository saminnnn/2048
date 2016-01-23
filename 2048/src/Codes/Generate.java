package Codes;

public class Generate {
	public Generate(){	}
	
	public int[][] number(int[][] grid){
		int a=0;
		int b=0;
		while(true){
			a=(int)(Math.random()*10)%4;
			b=(int)(Math.random()*10)%4;
			if(grid[a][b]==0) break;
		}
		System.out.println("grid["+a+"]["+b+"]="+grid[a][b]);
		grid[a][b]=(int) ((Math.random()*10)%5);
		
		if(grid[a][b]==1 || grid[a][b]==0) grid[a][b]=2;
		if(grid[a][b]==3) grid[a][b]=4;
		 return grid;
	}

}
