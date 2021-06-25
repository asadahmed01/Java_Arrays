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
    // if the size is greater than index, add more space
    if (items.length == index) {
      int[] newArray = new int[index * 2];
      for (int i = 0; i < index; i++)
        newArray[i] = items[i];
      items = newArray;
    }
    // add items to the array
    items[index] = item;
    index++;
  }

  // print method

  public void print() {
    for (int i = 0; i < index; i++)
      System.out.println(items[i]);
  }
}
