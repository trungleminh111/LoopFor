package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.1
		int tong = 0;
		for( int i = 0 ; i<= 100; i++) {
			tong +=i;		
		}
		System.out.println(tong);
		//12.2
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so nguyen n");	 
	     int n = sc.nextInt();
	      for(int i =0; i<=n; i++) {
	    int	  tong1 = 0;
	    if(i % 3 == 0)
	    tong1 +=i;
	    System.out.println("tong cac so chia het cho 3:" + tong1);  
	      }	   
    	//12.3
    	long x = 0;
    	long y = 1;
    	for (int i = 1; i < 100; i++) {
    		System.out.println(x + ":");
    		long z = x + y;
    		x = y;
    		y = z;		
		}   
    	//12.4
    	for (int i = 100; i < 999; i++) {
			int temp = (i/100) + ((i-(i/100)*100)/10) + i%10;
			if(i%3==0) System.out.println( i+ ":");	
		}  
    	int tong1 = 0;
    	for (int i = 0; i < 200; i++) {
    		tong1 +=i; 			
		}
    	System.out.println(tong1);   	
    }
}
   
	
