import java.util.*;
public class ThirdMaximumNumber{
  public static void main(String[] args){
    int max1=0,max2=0,max3=0;
    Scanner s=new Scanner(System.in);
     System.out.println("Enter how many values do you want to enter:");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Array values:");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      if(arr[i]>max1){
        max3=max2;
        max2=max1;
        max1=arr[i];
      }
      else if(max2<arr[i]){
        max3=max2;
        max2=arr[i];
      }
      else if(max3<arr[i]){
        max3=arr[i];
      }
    }
    System.out.println("Maximum value from the given array:: "+max1);
    System.out.println("Second maximum value from the given array :: "+max2);
    System.out.println("Second maximum value from the given array :: "+max3);
  }
}
