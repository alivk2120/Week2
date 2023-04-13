import java.util.Scanner;
class Roman{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num;
    System.out.println("Enter the number");
    num=s.nextInt();
    while(num>=1000){
      System.out.println("M");
      num=num-1000;
    }
    while(num>=500){
      System.out.print("D");
      num=num-500;
    }
    while(num>=100){
      System.out.println("C");
      num=num-100;
    }
  }
}