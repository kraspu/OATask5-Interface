package ua.org.oa.kraspu;

import java.util.Arrays;

public class DynamicStringList implements SimpleList {

    private String arr[];
    private int index;

    public DynamicStringList(){
        arr = new String[0];
        index = 0;
    }

    public DynamicStringList(int size){
        arr = new String[size];
        index = 0;
    }

  @Override
  public String toString() {
    return "DynamicStringList{" +
            "arr=" + Arrays.toString(arr) +
            '}';
  }

  @Override
  public void add(String s) {
      if (index >= arr.length) {
        String temp[] = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
          temp[i] = arr[i];
        }
        temp[index++] = s;
        arr = temp;
      } else {
        String temp[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
          temp[i] = arr[i];
        }
        temp[index++] = s;
        arr = temp;
      }

  }

  @Override
  public String get() {
      return arr[arr.length - 1];
  }

  @Override
  public String get(int id) {
      return arr[id];
  }

  @Override
  public String remove() {
    String temp[] = new String[arr.length - 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = arr[i];
    }
    arr = temp;
    index--;
      return null;
  }

  @Override
  public String remove(int id) {
      if (id < arr.length) {
        String temp[] = new String[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
          if (i != id) {
            temp[j++] = arr[i];
          }
        }
        arr = temp;
        index--;
        return null;
      }else {
        System.out.println("Нет такого элемента в нашем массиве");
        return null;
      }
  }

  @Override
  public boolean delete() {
      arr = new String[0];
      index = 0;
    return true;
  }
}
