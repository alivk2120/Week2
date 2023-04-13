import java.util.Scanner;
class Example13{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int year=0;
    System.out.println("enter the year");
    year=s.nextInt();
    if(year%4==0){
      System.out.println(year+ " is a leap year");
    }
    else{
      System.out.println(year+ " is not a leap year");
    }
  }
}