package ifforwhile;

public class Main {
           
	//
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x = 1;
		
		//if
		
		if (x>10) 
			{System.out.println("X> or x=10" );}
		else System.out.print("X<10");
		
		//switch
		
		
		for (int i=0; i<6; i++);
		
		
		switch(1) {
		
		case 0:
			System.out.print("i = 0");
		    break;
		case 1:
			System.out.print("i = 1");
		    break;
			
		case 2:
			System.out.print("i = 2");
			break;
		case 3:
			System.out.print("i = 3");
		    break;
		default:
			System.out.print("i > 3");
			
		}
		
//			//switch Month
		
		int month = 111;
		
		String season;
		
		switch (month) {
		
		case 12:
		case 1:
		case 2:
			season = "winter";
		    break;
		    
		case 3:
		case 4:
		case 5:
			season = "spring";
		    break;
		case 6:
		case 7:
	 	case 8:
		    season = "summer";
		    break;
		case 9:
		case 10:
		case 11:
			season = "fall";
		    break;
		    
		  default:
			  season = "imagine month";
		}
		
		System.out.println ("" + season);
		
		//while 
		
		int n =10;
				
		while (n>0) {
       System.out.println("" + n);  
		n--;	
			
		}
		
		
		
		
		// do while
		int m= 10;
		
		do {
			System.out.println ("такт " + m ) ;
			} while(--m > 0);
		
		
		
		
		
		
		
		
		
		

	}

}
