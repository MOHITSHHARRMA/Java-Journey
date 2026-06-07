public class loop{

// Q1. Print 5 stars in a single row
// Output:
// *****
     public static void pattern1(){
        int i = 1;
        while (i<=5){
            System.out.print('*');
            i++;

        }
    }
       // Q2. Print numbers from 1 to 5 vertically
// Output:
// 1
// 2
// 3
// 4
// 5
    public static void pattern2(){
        int i = 1;
        while (i<=5){
            System.out.print(i);
            System.out.println();
            i++;
        }
            
        }
// Q3. Print a 5x5 square star pattern
// Output:
// *****
// *****
// *****
// *****
// *****
    public static void pattern3(){
        int i =1;
        while (i<=5){
            int j = 1;
            while(j<=5){
                System.out.print('*');
                j++;

            }
            System.out.println();
            i++;


        }
    }

    // Q4. Print a right-angled star triangle
// Output:
// *
// **
// ***
// ****
// *****
   public static void pattern4(){
        int i = 1;
        while (i<=5){


            int j = 1;
            while (j<=i){
                System.out.print('*');
                j++;

            }


            System.out.println();
            i++;

        }
   }
    
// Q5. Print an increasing number triangle
// Output:
// 1
// 12
// 123
// 1234
// 12345

   public static void pattern5(){
        int i = 1;
        while(i<=5){
            int j = 1;
            while (j<=i){
                System.out.print(j);
                j++;

            }


            System.out.println();
            i++;

        }


   }
     
// Q6. Print a repeated number triangle
// Output:
// 1
// 22
// 333
// 4444
// 55555

   public static void pattern6(){
        int i = 1;
        while (i<=5){
            int j =1;
            while (j<=i){
                System.out.print(i);
                j++;
            }
        System.out.println();
        i++;    
        }
   }

   // Q7. Print an inverted star triangle
// Output:
// *****
// ****
// ***
// **
// *
  
   public static void pattern7(){
        int i =1;
        while(i<=5){
             int j = 5;
             while(j>=i){
                System.out.print('*');
                j--;

             }
            System.out.println();
            i++;

            
        }
   } 


// Q8. Print an inverted increasing number triangle
// Output:
// 12345
// 1234
// 123
// 12
// 1
   public static void pattern8(){   
     int i =5;
     while (i>=1 ){
        int j = 1;
        while (j<=i){
            System.out.print(j);
            j++;

        }
        System.out.println();
        i--;

     }

   } 

  // Q9. Print an inverted repeated number triangle
// Output:
// 55555
// 4444
// 333
// 22
// 1
   public static void pattern9(){
        int i = 5;
        while(i>=1){
            int j = 1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i--;
        }

   }
    
       
    

public static void main(String[] args){
     pattern1();
     System.out.println();
     pattern2();
     System.out.println();
     pattern3();
    System.out.println();
     pattern4();
    System.out.println();
     pattern5();
     System.out.println();
     pattern6();
     System.out.println();
     pattern7();
     System.out.println();
     pattern8();

     System.out.println();
     pattern9();
    
     

    }
}
   

