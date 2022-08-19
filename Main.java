import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);
           //function to checkPalindrome
       public void checkPalindrome() {
    	   
    	   int r,sum=0,temp;    

    	   System.out.println("Enter number");

    	   int n = sc.nextInt();
    	   if(n<0) {
    		   System.out.println("Enter positive number");
    	   }
    		  
    		   else {
    	   
    	   
    	   temp=n;    
    	   while(n>0){    
    	   r=n%10;  //getting remainder  
    	   sum=(sum*10)+r;    
    	   n=n/10;    
    	   }    
    	   if(temp==sum)    
    	   System.out.println("palindrome number ");    
    	   else    
    	   System.out.println("not a palindrome number"); 
    		   }
       }
            
       //function to printPattern
       public void printPattern() {
    	   System.out.println("enter the number: ");
    	   int n=sc.nextInt();
    	   if(n<=0){
    	       System.out.println("invalid number");
    	   }
    	   
    	   for (int i= n-1; i>=0 ; i--)  
    	   {  
    	    
    	   for (int j=0; j<=i; j++)  
    	   {  
    	   //prints star
    	   System.out.print("*" + " ");  
    	   }  
    	   
    	   System.out.println();  
    	   }  
  	   
    	   
      }
          //function to check no is prime or not

        public void checkPrimeNumber() {
        	System.out.println("Enter number");

        	int n = sc.nextInt();

        	int i,k=0,z=0;    
        	  k=n/2;
        	if(n<=0){
        	System.out.println("Enter the positive number: ");
        	
        	   
        	  if(n==1){
        	   System.out.println(n+" is not prime number");    
        	  }
        	}
        	  
        	  else{
        	   for(i=2;i<=k;i++){    
        	    if(n%i==0){    
        	     System.out.println(n+" is not prime number");    
        	     z=1;    
        	     break;    
        	    }    
        	   }    
        	   if(z==0)  { System.out.println(n+" is prime number"); }
        	  }//end of else
        	}
      	      
          
          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
           
           System.out.println("Please enter the number: "); 
         int n=sc.nextInt(); //Read an integer


         if (n <= 0){
         System.out.print("Improper Input ");
         }
         if (n > 0){
         System.out.print(first + " ");
         for (int i = 1; i < n; i++)
         {
         System.out.print(second + " ");
         int next = first + second;
         first = second;
         second = next;
         }
         }


          }

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);
do {

System.out.println("\n"+"Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

choice = sc.nextInt();

switch (choice) {

case 0:

choice = 0;

break;

case 1: {

obj.checkPalindrome();

   
}  

break;

case 2: {

obj.printPattern();


}

break;

case 3: {

obj.checkPrimeNumber();

}

break;

case 4: {

obj.printFibonacciSeries();


}

break;

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

}
