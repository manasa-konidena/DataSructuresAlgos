import java.util.ArrayList;

public class MergeStrings {

	public static void main(String[] args){
		String[] first = {"f", "u"};
		String[] second = {"p", "e"};
		System.out.println(merge(first, second));
		System.out.println(mergeStringArray(first));
		System.out.println(mergeStringBuffer(first));
	
	}
	
	public static ArrayList<String> merge(String[] first, String[] second){
		ArrayList<String> combined = new ArrayList<String>();
		for (String f: first) combined.add(f);
		for (String s: second) combined.add(s);
		return combined;
	}
	
	public static String mergeStringArray(String[] first){
		String s = "";
		for(int i=0; i<first.length; i++){
			s = s + first[i];
		}
		return s;
	}
	
	public static StringBuffer mergeStringBuffer(String[] first){
		StringBuffer s = new StringBuffer();
		for(int i=0; i<first.length; i++){
			s.append(first[i]);
		}
		return s;
	}
	

	
}
