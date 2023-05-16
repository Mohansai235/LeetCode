import java.util.*;
public class SearchInsertPosition{
  public static void main(String args[]){
    int count=0,icount=0;
    Scanner s=new Scanner(System.in);
    System.out.println();
    System.out.println("Enter How many elements you want to store in array:");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array elements");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Enter the value to search:");
    int m=s.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==m){
        System.out.println("The position of the search element is : "+i);
        count++;
      }
    }
    if(count==0){
    for(int i=0;i<n;i++){
      if(arr[i]>m){
        System.out.println("The element you serched should be in "+i+" index position.");    
        icount++;
        break;
      }
    }
    }
    if(icount==0){
      System.out.println("The element you serched should be in "+n+" index position.");
    }
  }
}