public class Main {

  public static void main(String[] args) {
    // findnemo
    /*
     * String[] array=new String[]{"Nemo"};
     * findnemo fn=new findnemo();
     * fn.findNemo(array);
     */

    // logAllPairs - O(n^2)
    char[] array = new char[] { 'a', 'b', 'c', 'd', 'e' };
    logAllPairs lp = new logAllPairs();
    lp.logAllPairsOfArray(array);

  }
}
