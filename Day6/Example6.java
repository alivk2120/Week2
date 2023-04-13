import java.util.Scanner;
class Example6 {
  public static void main(String args[]) {
 
    Scanner s=new Scanner(System.in);
    
    int basic=0, gross=0;
    int hra, da;
 
    System.out.println("Enter basic salary ");
    basic=s.nextInt();
    
    hra = (basic*89)/100;
    da= (basic*90)/100;
    gross= basic+hra+da;
 
    System.out.println("gross salary   is : " + gross);
    
 
  }
}