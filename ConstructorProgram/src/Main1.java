class Main1 {

  String languages;

  // constructor accepting single value
  Main1(String lang) {
    languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {

    // call constructor by passing a single value
    Main1 obj1 = new Main1("Java");
    Main1 obj2 = new Main1("Python");
    Main1 obj3 = new Main1("C");
  }
}
