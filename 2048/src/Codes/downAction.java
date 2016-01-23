package Codes;

public class downAction {
	
	public downAction(){
	}
	
	public int[][] Down(int[][] grid){
		for(int x=2;x>=0;x--){
			for(int y=3;y>=0;y--){
				
				while(true){
					
					//When two number match
					if(grid[x][y]==grid[x+1][y]){
						grid[x+1][y]=grid[x][y]+grid[x+1][y];
						grid[x][y]=0;
						break;
					}
					
					if(grid[x+1][y]==0){
						grid[x+1][y]=grid[x][y];
						grid[x][y]=0;
						}
					break;
					}	
				}
			}
		
		return grid;
	}

}
