import java.util.Scanner;
class Example9{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int age=0;
    System.out.println("enter his/her age");
    age=s.nextInt();
    if(age>=18){
      System.out.println("he/she is eligible for voting");
    }
    else{
      System.out.println("he/she is not eligible for voting");
    }
  }
}