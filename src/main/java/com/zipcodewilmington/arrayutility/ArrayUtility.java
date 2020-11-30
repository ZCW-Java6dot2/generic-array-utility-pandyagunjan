package com.zipcodewilmington.arrayutility;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] array;

    public ArrayUtility(T[] inputArray) {
        this.array=inputArray;
    }

  public  Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate)
  {
      Integer count = 0;
      for (T object : array) {
          if (object.equals(valueToEvaluate)){
              count++;
          }
      }
      for (T object : arrayToMerge) {
          if (object.equals(valueToEvaluate)) {
              count++;
          }
      }
      return count;
  }

}
