public class logAllPairs {

  public void logAllPairsOfArray(char[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.println(array[i] + " " + array[j]);
      }
    }
  }
}