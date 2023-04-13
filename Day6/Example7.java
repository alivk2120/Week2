import java.util.Scanner;
class Example7{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=0;
    System.out.println("enter the number");
    num=s.nextInt();
    if(num>0){
      System.out.println(num+" is positive");
    }
    else{
      System.out.println(num+" is negative");
    }
  }
}
  