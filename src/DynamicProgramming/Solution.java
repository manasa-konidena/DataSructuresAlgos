package DynamicProgramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Circle{
        int xCo;
        int yCo;
        int rad;
        
        Circle(int x, int y, int r){
            xCo = x;
            yCo = y;
            rad = r;
        }
        
        public boolean canBeInside(Circle c1){
        		return (dist(xCo, yCo, c1.xCo, c1.yCo) <= c1.rad - rad);
        }
        
        public double dist(int x1, int y1, int x2, int y2){
        		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        }
        
    }

public class Solution{
    public static void main(String[] args) {
    	
    		Scanner in = new Scanner(System.in);
    		int size = in.nextInt();
    		
    		ArrayList<Circle> circleArray = new ArrayList<Circle>();
    		
    		
    		for(int k=0;k<size;k++){
    			
                int xCo = in.nextInt();
                int yCo = in.nextInt();
                int rad = in.nextInt();
               
                circleArray.add(new Circle(xCo,yCo,rad));

			}
        
              Collections.sort(circleArray, new Comparator<Circle>() {
    			  @Override public int compare(Circle c1, Circle c2){
    				  return Integer.compare(c2.rad, c1.rad);
    			  }
    		  });
 
    		  
            findKafKuh(circleArray);
        
    }
    
   
    public static void findKafKuh(ArrayList<Circle> c){
    		int maxIndex = 0;
    		int[] maxArray = new int[c.size()];
            maxArray[0] = 0;
    		for(int i=1;i<c.size();i++){
    			maxArray[i] = 0;
    			for(int j=i-1;j>=0;j--){
    				if(c.get(i).canBeInside(c.get(j))){
    					maxArray[i] = Math.max(maxArray[i], maxArray[j] + 1);	
    				}
    			}
    			if(maxArray[maxIndex] < maxArray[i]){
    				maxIndex = i;
    			}
    		}
        
            for(int p=0;p<maxArray.length;p++){
              //  System.out.println(maxArray[p] +":" + p);
            }

    		System.out.println(maxArray[maxIndex]);
    		
    }	
}