/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.*/
import java.util.*;
public class TwoSum{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter How many elements you want to store in array:");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array elements");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Enter your target value:");
    int m=s.nextInt();
      
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==m){
          System.out.println("The Indices of Array elements to get the target value : "+"["+i+","+j+"]");
        }
      }
    }
    System.out.println("Target value cannot be find usig these array elements");
    System.out.println();
  }
}