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

  // RemoveAt method
  public void removeAt(int position) {
    if (position < 0 || position >= index)
      throw new IllegalArgumentException();
    for (int i = position; i < index; i++)
      items[i] = items[i + 1];
    index--;
  }

  // IndexOf method

  public int indexOf(int item) {
    for (int i = 0; i < index; i++) {
      if (items[i] == item)
        return i;
    }
    return -1;
  }

  // print method
  public void print() {
    for (int i = 0; i < index; i++)
      System.out.println(items[i]);
  }
}
