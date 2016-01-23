package Codes;

public class rightAction {
	
	public rightAction(){
	}
	
	public int[][] Right(int[][] grid){
		for(int y=2;y>=2;y--){
			for(int x=3;x>=0;x--){
				
				while(true){
					
					//When two number match
					if(grid[x][y]==grid[x][y+1]){
						grid[x][y+1]=grid[x][y]+grid[x][y+1];
						grid[x][y]=0;
						break;
					}
					//isLineFull full=new isLineFull();
					
					if(grid[x][y+1]==0){
						grid[x][y+1]=grid[x][y];
						grid[x][y]=0;
						}
					
					break;
					}	
				}
			}
		
		return grid;
	}
}
