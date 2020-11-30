package com.zipcodewilmington.arrayutility;

//import javax.swing.*;
import java.util.*;

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


//    public  T[] removeValue(T valueToRemove)
//    {
//
//        ArrayList<T> storeAltered= (ArrayList<T>) Arrays.asList(array);
//
//        for (T object : array)
//        {
//            if(object.equals(valueToRemove))
//            {
//                storeAltered.remove(object);
//            }
//
//        }
//        T[] finalArray = storeAltered.toArray();
//        return finalArray;
//    }

    public  Integer getNumberOfOccurrences(T valueToEvaluate)
    {
        Integer count = 0;
        for (T object : array) {
            if (object.equals(valueToEvaluate)){
                count++;
            }
        }

        return count;
    }




}
