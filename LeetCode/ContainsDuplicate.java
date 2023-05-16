import java.util.*;
public class ContainsDuplicate{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     System.out.println("Enter how many values do you want to enter:");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Array values:");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          
        }
        else{
          System.out.println("Flase");
        }
      }
    }
  }
}