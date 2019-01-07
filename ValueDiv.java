import java.io.*;
import java.util.*;
public class ValueDiv{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Two Integers:");
    int L=sc.nextInt();
    int R=sc.nextInt();
      for(int i=L;i<=100000;i++)
        {
          if(i%L==0&&i%R==0)
            {
            System.out.println("Result:"+i);
			      break;
            }
        }
     }
  }   
