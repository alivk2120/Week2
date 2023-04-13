// WAP to accept 3 subjects marks and print total and avg marks.
import java.util.Scanner;
class Example5 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int sal=0, bill1 =0, bill2 =0, bill3=0;
    int total = 0, percent= 0;
 
    System.out.println("Enter salary ");
    sal=s.nextInt();
    System.out.println("Enter  three bills");
    bill1=s.nextInt();
    bill2=s.nextInt();
    bill3=s.nextInt();
    
    total = bill1 + bill2 + bill3;
    percent = (total*100)/sal;
 
    System.out.println("total  is : " + total);
    System.out.println("percentage  is : " + percent);
 
  }
}