package main;

import java.util.List;

//Class to be Partially Mocked
public class DataProcessor {
 public int processData(List<Integer> data) {
     int sum = 0;
     for (int num : data) {
         sum += num;
     }
     return sum;
 }

 public void saveData(List<Integer> data) {
     // Save data to a database or file
 }
}
