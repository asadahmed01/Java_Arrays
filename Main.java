public class Main {
  public static void main(String[] args) {
    var array = new ArraysClass(3);
    array.Insert(10);
    array.Insert(20);
    array.Insert(30);
    array.Insert(40);
    array.Insert(50);
    System.out.println(array.indexOf(100));
    array.print();

  }
}