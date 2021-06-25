import java.util.Arrays;

import javax.print.event.PrintEvent;

public class ArraysClass {
  private int[] items;
  private int index;

  public ArraysClass(int size) {
    items = new int[size];
  }

  // insert method

  public void Insert(int item) {

  }

  // print method

  public void print() {
    for (int i = 0; i < index; i++)
      System.out.println(i);
  }
}
