class A {
  void show() {
    System.out.println("Hello from A");
  }

}

class B extends A {
  void show() {
    System.out.println("Hello from B");
  }

  void greet() {
    System.out.println("Hello World");
  }
}

public class Revision {
  public static void main(String[] args) {
    A obj = new B();
    obj.show();
    B obj1 = (B) obj;
    obj1.greet();
  }
}
