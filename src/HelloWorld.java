public class HelloWorld {
    public static void main (String [] args) {
        int m = 7;
        m = count(m);
        System.out.println(m);

    }

    private static int count(int x){
      x = x + 1;
      return x;
    }
}
