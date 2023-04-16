public class Main {

  public static void main(String[] args) {
    // findnemo
    /*
     * String[] array=new String[]{"Nemo"};
     * findnemo fn=new findnemo();
     * fn.findNemo(array);
     */

    // logAllPairs - O(n^2)
    // char[] array = new char[] { 'a', 'b', 'c', 'd', 'e' };
    // logAllPairs lp = new logAllPairs();
    // lp.logAllPairsOfArray(array);

    // Contains common element
    CommonElement ce = new CommonElement();
    char[] array1 = new char[] { 'a', 'b', 'c', 'h', 'x' };
    char[] array2 = new char[] { 'b', 'y', 'x' };
    System.out.println(ce.hasCommonElement(array1, array2));
  }
}
