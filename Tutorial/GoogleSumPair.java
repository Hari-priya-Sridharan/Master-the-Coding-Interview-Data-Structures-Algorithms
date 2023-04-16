import java.util.HashSet;
public class GoogleSumPair{
  public boolean hasSumPairNaive(int[] arr, int sum){
    for(int i=0;i<arr.length;i++){
      for(int j=1;j<arr.length;j++){
        if(arr[i]+arr[j]==sum){
          return true;
        }
      }
    }
    return false;
  }
  public boolean hasSumPairSorted(int[] arr,int sum){
    //naive
    //better
    /* check if the given sum is equal to the sum of first and last values. if its less move forward from first if its more move backward from the last until you reach the correct sum*/
   int i=0;
    int j=arr.length-1;
    while(i<arr.length-1 && j>0){
      int val=arr[i]+arr[j];
      if(val==sum){
       return true;
      }
      else if(val>sum){
        j=j-1;
      }
      else if(val<sum){
        i= i+1;
      }
    } 
    return false;
  }
  public boolean hasSumPair(int[] arr,int sum){
    HashSet<Integer> hs=new HashSet<Integer>();
    for(int i:arr){
      if(hs.contains(i)){
        return true;
      }
      hs.add(sum-i);
    }
    return false;
  }
  
}