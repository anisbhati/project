package pattern;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	
	 
    public static void main(String[] args) {
    
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<2-i;j++) {
    			System.out.print(j);
    		}
    		for(int k=0;k<=i;k++) {
    			System.out.print("*");
    		//   01*
    		//   0***
    		//   *****
    		}
    		
    		for(int l=1;l<=i;l++) {
    			System.out.print("*");
    		}
    		
    		System.out.println();
    	}
     // this is first change
    	// this is second changes
    	
    	// this is child changes
        // this is child third changes
    	
    	Object o=new Object();
    	Runtime r=Runtime.getRuntime();
    	
    	
    	
    	
	}
}
