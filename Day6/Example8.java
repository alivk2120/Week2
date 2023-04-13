import java.util.Scanner;
class Example8{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=0;
    System.out.println("Enter the number");
    num=s.nextInt();
    if(num==0){
      System.out.println(num+ " is zero");
    }
    else if(num%2==0){
      System.out.println(num+ " is an even number");
    }
    else{
       System.out.println(num+ " is odd  number");
    }
  }
}