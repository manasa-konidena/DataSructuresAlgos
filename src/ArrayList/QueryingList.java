package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class QueryingList {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=1;i<=lines;i++){
            int integers = in.nextInt();
            lst.add(integers);
            for(int j=1;j<=integers;j++){
                lst.add(in.nextInt());
            }
        }
        
        int queries = in.nextInt();
        ArrayList<Integer> quer = new ArrayList<>();
        for(int i=1;i<=queries*2;i++){
            quer.add(in.nextInt());
        }
        
        
        resolveQueries(lst, quer);
    }
    
    public static void resolveQueries(ArrayList<Integer> lst, ArrayList<Integer> que ){
        for(int i=0;i<que.size();i=i+2){
            
            int line = que.get(i);
            int pos = que.get(i+1);
            int k = 1;
            for(int j=0;j<lst.size();j=j+lst.get(j)+1){
                
                int curline = k;
                if(pos > lst.get(j) && line == curline){
                    System.out.println("ERROR!");
                    break;
                }
                else if(line == curline){
                    System.out.println(lst.get(j+pos));
                    break;
                }
                k++;
            }
            //i++;
        }
    }
    
    
}
