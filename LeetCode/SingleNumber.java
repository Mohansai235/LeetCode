import java.util.*;
class SingleNumber {
  public static int findSingle(int arr[], int n){
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count == 1) {
        return arr[i];
      }
    }
    return -1;
  }
  public static void main (String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter how many values do you want to enter:");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Array values:");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Element occurring once is " + findSingle(arr, n));
  }
}
