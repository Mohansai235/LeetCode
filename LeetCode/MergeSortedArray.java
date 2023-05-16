import java.util.*;
public class MergeSortedArray{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter how many values do you want to store in Array1:");
    int n=s.nextInt();
    System.out.println("Enter how many values do you want to store in Array2:");
    int m=s.nextInt();
    System.out.println("Enter Array1 Elements");
    for(int i=0;i<n;i++){
      arr1[i]=s.nextInt();
    }
    System.out.println("Enter Array2 Elements");
    for(int j=0;j<m;j++){
      arr2[j]=s.nextInt();
    }
  }
}