import java.util.Scanner;

public class Bug4{
  public static void main(String[] args) {
    
  
Scanner in=new Scanner(System.in);
System.out.println("enter a number");
int temp=1;
int a=in.nextInt();
for(int i=1;i<=a;i++) {
temp=temp*i;	
}
System.out.println("factorial:"+temp);
}
}