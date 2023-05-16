import java.util.*;
public class PlusOne{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter how many values do you want");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int rem=0;
    for(int i=0;i<n;i++){
      rem=rem*10+arr[i];
    }
    int rem1=rem+1;
    String str=Integer.toString(rem1);
    char arr1[]=str.toCharArray();
    for(int j=0;j<arr1.length;j++){
      System.out.print(arr1[j]+" , ");
    }
    
  }
}