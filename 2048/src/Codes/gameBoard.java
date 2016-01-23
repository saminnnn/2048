package Codes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameBoard extends JPanel implements KeyListener{
	//private upAction down=new upAction();
	int[][] grid=gridControl();
	int r=0;
	
	public void paint(Graphics g){
		
		super.paint(g);
		
		for(int x=0;x<=3;x++){
			for(int y=0;y<=3;y++){				
				g.drawRect(boxX(x), boxY(y), 100, 100);
				if(grid[x][y]!=0){
					g.setFont(new Font("TimesRoman", Font.BOLD,50));
				
					g.drawString(""+grid[x][y], textX(x), textY(y));
				}
				}
			}
		this.requestFocus(true);
		addKeyListener(this);
			
	}
	
	public int boxX(int x){
		return 15*(x+1)+100*x;
	}
	
	public int boxY(int y){
		return 15*(y+1)+100*y;
	}
	
	public int textX(int x){
		return 55+115*x;
	}
	
	public int textY(int y){
		return 80+115*y;
	}
	
	public int[][] makeGrid(){
		int[][] grid=new int[4][4];
		
		int a=(int) (Math.random()*10)%4;
		int b=(int) (Math.random()*10)%4;

		grid[a][b]=(int) ((Math.random()*10)%5);
		
		if(grid[a][b]==1||grid[a][b]==0) grid[a][b]=2;
		if(grid[a][b]==3) grid[a][b]=4;
		
		a=0;
		b=0;
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

	
	@Override
	public void keyPressed(KeyEvent e) {
		upAction up=new upAction();
		downAction right=new downAction();
		rightAction down=new rightAction();
		leftAction left=new leftAction();
		
		
		if(e.getKeyCode()==KeyEvent.VK_UP){
			grid=left.Left(grid);
			this.r=0;
			repaint();
			
			
		}
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			grid=right.Down(grid);
			this.r=0;
			repaint();
			}
		
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			grid=up.Up(grid);
			this.r=0;
			repaint();
			}
		
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			grid=down.Right(grid);
			this.r=0;
			repaint();
			}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		Generate make=new Generate();
		if(e.getKeyCode()==KeyEvent.VK_UP){
			if(r==0){
			make.number(grid);
			repaint();
			r++;
			}
		}
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			if(r==0){
				make.number(grid);
				repaint();
				r++;
				}
			}
		
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			if(r==0){
				make.number(grid);
				repaint();
				r++;
				}	
		}
		
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			if(r==0){
				make.number(grid);
				repaint();
				r++;
				}
			}
	}

	@Override
	public void keyTyped(KeyEvent a) {}
	
	
	public boolean gameOver(int[][] grid){
		boolean over=true;
		
		for(int x=0;x<=3;x++){
			for(int y=0;y<=3;y++){
				if(grid[x][y]==0) over=false;
			}
		}
		
		for(int x=0;x<=2;x++){
			for(int y=0;y<=2;x++){
				if(grid[x][y]==grid[x+1][y]) over=false;
				if(grid[x][y]==grid[x][y+1]) over=false;
			}
		}
		return over;
	}
	
	
	public int[][]gridControl(){
		int[][] grid=new int[4][4];
		
		int a=(int) (Math.random()*10)%4;
		int b=(int) (Math.random()*10)%4;

		grid[a][b]=(int) ((Math.random()*10)%5);
		
		if(grid[a][b]==1||grid[a][b]==0) grid[a][b]=2;
		if(grid[a][b]==3) grid[a][b]=4;
		
		a=0;
		b=0;
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

