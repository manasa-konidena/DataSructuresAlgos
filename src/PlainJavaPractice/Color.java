package PlainJavaPractice;

import java.util.ArrayList;
import java.util.List;

//We have a class named Color as follows:

    public class Color {
        private String name;
    
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
   

//Please implement a method to return a new list containing only those colors that are not "blue".

    public List<Color> removeBlues(List<Color> inputColors) {
        List<Color> otherThanBlue = new ArrayList<>();
        for(int i=0;i<inputColors.size();i++){
        		if(inputColors.get(i).getName() != "blue"){
        			otherThanBlue.add(inputColors.get(i));
        		}
        }
        
        return otherThanBlue;
    }
 }

