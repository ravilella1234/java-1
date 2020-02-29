package Coaching;


//copy constructor

class CopyConstructor { 
	  
     double re, im; 
      
    // A normal parametrized constructor  
     CopyConstructor(float re, double im) { 
        this.re = re; 
        this.im = im; 
    } 
      
    // copy constructor 
    CopyConstructor(CopyConstructor c) { 
        System.out.println("Copy constructor called"); 
        re = c.re; 
        im = c.im;
        System.out.println(re +" "+im);
    } 
       
    // Overriding the toString of Object class 
   // @Override
//    public String toString() { 
//        return "(" + re + " + " + im + "i)"; 
//    } 
    
    
    public static void main(String[] args) {
	
    	CopyConstructor c1 = new CopyConstructor(10, 15); 
        
        
        
        // Following involves a copy constructor call 
        CopyConstructor c2 = new CopyConstructor(c1);    

        // Note that following doesn't involve a copy constructor call as  
        // non-primitive variables are just references. 
       // Complex c3 = c2;    

       System.out.println(c2); // toString() of c2 is called here 

    	
    	
	}
    
    
    
    
    
} 




//  
//public class Main { 
//  
//    public static void main(String[] args) { 
//            } 
//} 