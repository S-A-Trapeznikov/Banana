package by.trapeznikov;

public class Banana {
	
	private int size;
	private String taste;
	
	public Banana (int size, String taste){
		
		this.size = size;
		this.taste = taste;
		
	}

	public int compareToSize(Object obj) {
					
			if (this.size==((Banana) obj).size){
				return 0;}
			else if (this.size>((Banana) obj).size){
				return 1;
			}else return -1;	
	}
			
	public int compareToTaste(Object obj) {
		
		if (this.getIntTaste()==((Banana) obj).getIntTaste()){
			return 0;}
		else if (this.getIntTaste()>((Banana) obj).getIntTaste()){
			return 1;
		}else return -1;	
	}
	
	public int getIntTaste(){
		
		switch (this.taste.toLowerCase()){
		case "best":    return 5;
		case "good": 	return 4;
		case "normal":	return 3;
		case "bed": 	return 2;
		case "awful": 	return 1;
		default: return 0;
					  				  	
		}
	}
	
	public int compareTo(Object obj) {
		
		if ((this.compareToSize(obj)==0)&&(this.compareToTaste(obj)==0)){
			return 0;}
		else if ((this.compareToSize(obj)==0)&&(this.compareToTaste(obj)==1)){
			return 1;
		}else if ((this.compareToSize(obj)==0)&&(this.compareToTaste(obj)==-1)){
			return -1;
		}if ((this.compareToSize(obj)==1)&&(this.compareToTaste(obj)==0)){
			return 1;}
		else if ((this.compareToSize(obj)==1)&&(this.compareToTaste(obj)==1)){
			return 1;
		}else if ((this.compareToSize(obj)==1)&&(this.compareToTaste(obj)==-1)){
			return 1;
		}if ((this.compareToSize(obj)==-1)&&(this.compareToTaste(obj)==0)){
			return -1;}
		else if ((this.compareToSize(obj)==-1)&&(this.compareToTaste(obj)==1)){
			return -1;
		}else return -1;
			
	}
	
	public String toString(){
		String s;
		return  s = this.size+" "+this.taste;
		
	}
		
}

		
		
		
	

	

