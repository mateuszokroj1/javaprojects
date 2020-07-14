public class Program {
  static void wypiszDługość(String s) {
    System.out.println(s.length());
  }
  
  public static void main(String[] args) throws Exception {
    try {
      wypiszDługość(null);
    } catch (NullPointerException w) {
       throw new Exception(w);
    }
  }
}