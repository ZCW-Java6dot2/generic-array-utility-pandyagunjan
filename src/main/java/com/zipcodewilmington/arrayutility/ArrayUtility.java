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
//      Integer count = 0;
//      for (T object : array) {
//          if (object.equals(valueToEvaluate)){
//              count++;
//          }
//      }
//      for (T object : arrayToMerge) {
//          if (object.equals(valueToEvaluate)) {
//              count++;
//          }
//      }
//      return count;
      List<T> valueList = new ArrayList<>();
      valueList.addAll(Arrays.asList(arrayToMerge));
      valueList.addAll(Arrays.asList(array));
      return Collections.frequency(valueList, valueToEvaluate);
  }


    public  T[] removeValue(T valueToRemove)
    {

       Integer occuranceCount= getNumberOfOccurrences(valueToRemove);
       T[] buffer=Arrays.copyOf(array,array.length-occuranceCount);
       int j=0;
        for (int i = 0; i < array.length; i++) {

            if(!array[i].equals(valueToRemove))
            {
                buffer[j]=array[i];
                j++;
            }

        }
        return buffer;

    }

    public  Integer getNumberOfOccurrences(T valueToEvaluate)
    {

//        ArrayList<T>  valueList = new ArrayList<>();
//        valueList.addAll(Arrays.asList(array));
//        return Collections.frequency(valueList, valueToEvaluate);
        Integer count = 0;
        for (T object : array) {
            if (object.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;



    }




}
