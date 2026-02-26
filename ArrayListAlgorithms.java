import java.util.*;
public class ArrayListAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private ArrayList<Integer> intArray;
   public int randNum = (int)(Math.random() * 100);
   public int largestInt = -2147483647;
   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */
   public ArrayListAlgorithms() {
      intArray = new ArrayList<Integer>();
   }
   
   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i = 0; i < randNum; i++) {
         intArray.add((int)(Math.random() * 100));
         }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for(int i = 0; i < intArray.size(); i++) {
         intArray.add(startNum + i);
         }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      for(int i = 0; i < intArray.size(); i++) {
         if(intArray.get(i) > largestInt) {
            largestInt = intArray.get(i);
         }
      }
   return largestInt;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i = 0; i < intArray.size(); i++) {
         for(int a = 0; a < intArray.size(); a++) {
            if(intArray.get(i).equals(intArray.get(a)) && a != i) {
               return true;
            }
         }
      }
      return false;
   }
   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for(int i = 0; i < intArray.size(); i++) {
         if(intToFind == (intArray.get(i))) {
         return true;
         }
      }
      return false;
   }


   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayListAlgorithms intArray1 = new ArrayListAlgorithms();
      intArray1.populateArrayWithRandom();
      System.out.println(intArray1.findMax());
      System.out.println(intArray1.hasDuplicates());
      System.out.println(intArray1.isInArray(67));
   }
}
