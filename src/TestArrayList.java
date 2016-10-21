import java.util.ArrayList;


public class TestArrayList {
	public static void main(String[] args){
	ArrayList<Integer> lst1 = new ArrayList<>();
	ArrayList<Integer> lst2 = new ArrayList<>();
	for(int p=0; p<10;p++){
		lst1.add(p);
		lst2.add(p);
	}
	lst1.remove(0);
	lst2.remove(1);
	System.out.println(lst1);
	System.out.println(lst2);
	}
}
