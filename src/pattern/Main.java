package pattern;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.xml.ws.http.HTTPException;

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
    	// thsi is change
 
    	// HI this is demo
    	
    	
	}
}
