package Codes;

public class upAction{
	
	public upAction(){
	}
	
	public int[][] Up(int[][] grid){
		for(int x=1;x<=3;x++){
			for(int y=0;y<=3;y++){
				
				while(true){
					
					//When two number match
					if(grid[x][y]==grid[x-1][y]){
						grid[x-1][y]=grid[x][y]+grid[x-1][y];
						grid[x][y]=0;
						break;
					}
				
					if(grid[x-1][y]==0){
						grid[x-1][y]=grid[x][y];
						grid[x][y]=0;
						}
					
					break;
					}
					
					
				}
			}
		
		return grid;
	}

}
