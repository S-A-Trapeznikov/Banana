package by.trapeznikov;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BananaRunner {
	
	public static void main(String [] args){
		
		List<Banana> banana= new LinkedList<>();
			
		 	banana.add(new Banana(2,"normal"));
		 	banana.add(new Banana(3, "best"));
		 	banana.add(new Banana(4, "bed"));
		 	banana.add(new Banana(1, "good"));
		 	banana.add(new Banana(2, "awful"));
		 	banana.add(new Banana(1, "best"));
			banana.add(new Banana(6, "best"));
			banana.add(new Banana(2, "awful"));
			banana.add(new Banana(1, "bed"));
			banana.add(new Banana(4, "awful"));
			banana.add(new Banana(3, "normal"));
			banana.add(new Banana(2, "normal"));
				
		Banana maxBanana;
		
		ListIterator<Banana> it = banana.listIterator();
		
		for (int i=0; i<banana.size(); i++){
			for (int j=0; j<banana.size(); j++){
				if (banana.get(i).compareTo(banana.get(j))==1){maxBanana = banana.get(j);
																banana.set(j,banana.get(i));
																banana.set(i, maxBanana);}
			}
			
		}
		
		for (int i=0; i<banana.size(); i++){
			System.out.println(banana.get(i).toString());
		}
		
		
		
	}

}
