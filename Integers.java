import java.util.Scanner;
  public class Integers {
    public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
System.out.print("Enter the integer:  ");
      int firstInteger = input.nextInt();
System.out.print("Enter the integer:  ");
        int secondInteger = input.nextInt();
 System.out.print("Enter the integer:  ");
        int thirdinteger = input.nextInt();
        
        int largest = firstInteger;
        
      if (secondInteger < largest && secondInteger > largest)
    largest = secondInteger;
  if(thirdinteger < largest && thirdinteger > largest)
    largest = thirdinteger;
System.out.println("Largest: " + largest);      

}
    
    }
        
     
