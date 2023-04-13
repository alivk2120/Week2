import java.util.Scanner;
class Difference{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num,sum=0,mul=1,dig=0,dif=0;
    System.out.println("Enter the number");
    num=s.nextInt();
    while(num!=0){
      dig=num%10;
      num=num/10;
      sum=sum+dig;
      mul=mul*dig;
    }
    dif=mul - sum;
    System.out.println("the difference is " +dif);
  }
}