import java.util.Scanner;
public class convert{

      public static void main(String[]args){

      int i,mts;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of inches");
      i=sc.nextInt();
      System.out.println("inches = " +i);
      mts = i * 0.0254;
      System.out.println("inches in metres is "+mts);
}
}
      
      
