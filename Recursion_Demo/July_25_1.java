import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class July_25_1 {
 
    boolean isSafeToMove(int newX,int newY,int[][] maze,boolean[][] visited){
        int n=maze.length;
        if(newX <0 || newX>=n || newY<0 || newY>=n){
            return false;
        }
        else if(maze[newX][newY]==0)
        return false;
        else if(visited[newX][newY]==true)
        return false;
        return true;
    }
    void solve(int[][] maze,int srcX,int srcY,int destX,int destY,boolean[][] visited,List<String> ans,String path){
        if(srcX==destX && srcY==destY){
            ans.add(path);
            return;
        }
        visited[srcX][srcY]=true;
        int newX=srcX-1;
        int newY=srcY;
        if(isSafeToMove(newX,newY,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"U");
        }
        newX=srcX+1;
        newY=srcY;
        if(isSafeToMove(newX,newY,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"D");
        }
        newX=srcX;
        newY=srcY-1;
         if(isSafeToMove(newX,newY,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"L");
        }
        newX=srcX;
        newY=srcY+1;
         if(isSafeToMove(newX,newY,maze,visited)){
            solve(maze,newX,newY,destX,destY,visited,ans,path+"R");
        }
    visited[srcX][srcY]=false;
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int srcX=0;
        int srcY=0;
        int n=maze.length;
        int destX=n-1;
        int destY=n-1;
        boolean[][] visited=new boolean[n][n];
        ArrayList<String> ans=new ArrayList<>();
        String path="";
        if(maze[0][0] ==0 || maze[n-1][n-1] ==0){
            return ans;
        }
        solve(maze,srcX,srcY,destX,destY,visited,ans,path);
        Collections.sort(ans);
        return ans;
        
    }
    
}

//rat in a maze