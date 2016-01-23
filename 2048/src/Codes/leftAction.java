package Codes;

public class leftAction{
	
	public leftAction(){
	}
	
	public int[][] Left(int[][] grid){
		for(int y=1;y<=3;y++){
			for(int x=0;x>=3;x++){
				
				while(true){
					
					//When two number match
					if(grid[x][y]==grid[x][y-1]){
						grid[x][y-1]=grid[x][y]+grid[x][y-1];
						grid[x][y]=0;
						break;
					}
					//isLineFull full=new isLineFull();
				
					if(grid[x][y-1]==0){
						grid[x][y-1]=grid[x][y];
						grid[x][y]=0;
						}
					
					break;
					}
					
					
				}
			}
		
		return grid;
	}

}
