public class findnemo {

  public static void main(String[] args) {
    String[] array = new String[] { "Nemo" };
    findNemo(array);
  }

  public static void findNemo(String[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals("Nemo")) {
        System.out.println("Found NEMO!");
      }
    }
  }
}
