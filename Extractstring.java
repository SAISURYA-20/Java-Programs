package day21;

public class Extractstring {
	public static void main(String[] args) {
		String str="UNiversity";
	    System.out.println(str);
	    String first=str.substring(0 , 3);
	    String last=str.substring(str.length() -3);
	    int middleIndex=str.length()/2;
	    String middle;
	    if(str.length()%2==0) {
	    	middle=str.substring(middleIndex-1,middleIndex+2);
	    }
	    else {
	    	middle=str.substring(middleIndex-1,middleIndex+2);
	    }
	    System.out.println("first three character:"+first);
	    System.out.println("last three character:"+last);
	    System.out.println("middle three character:"+middle);
	}

}
