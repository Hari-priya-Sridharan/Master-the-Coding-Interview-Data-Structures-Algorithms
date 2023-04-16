import java.util.HashSet;

public class CommonElement {
  public boolean hasCommonElement(char[] array1, char[] array2) {
    HashSet<Character> hs = new HashSet<Character>();
    for (char i : array1) {
      hs.add(i);
    }
    for (char j : array2) {
      if (hs.contains(j)) {
        return true;
      }
    }
    return false;
  }
}