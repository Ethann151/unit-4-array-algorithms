public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;
   public int[] intArray2;
   public int storedValue = -2147483647;
   public int storedValue2;
   public int storedValue3;
   public int storedValue4;
   public int storedValue5;
   public int storedValue6;
   public int storedValue7;
   public int b;
   public int c;
   public String list = "";

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
      intArray2 = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i = 0; i < intArray.length; i++) {
         intArray[i] = (int)(Math.random() * 100);
         }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for(int i = 0; i < intArray.length; i++) {
         intArray[i] = startNum + i;
         }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      for(int i = 0; i < intArray.length; i++) {
         if(intArray[i] > storedValue) {
            storedValue = intArray[i];
         }
      }
   return storedValue;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i = 0; i < intArray.length; i++) {
         for(int x = 0; x < intArray.length; x++) {
            if(intArray[b] == intArray[x] && x != b) {
            return true;
            }
         }
      if(b < intArray.length) {
      b++;
      }
      }
      return false;
      }
   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for(int i = 0; i < intArray.length; i++) {
         if(intArray[i] == intToFind) {
         return true;
         }
      }
      return false;
   }

   // ===== UWHS ALGORITHMS =====
   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
      for(int i = 0; i < intArray.length; i++) {
         if(intArray[i] > storedValue3) {
            storedValue4++;
            storedValue3 = intArray[i];
         }
         else {
            storedValue3 = 0;
            if(storedValue4 > storedValue5) {
               storedValue5 = storedValue4;
            }
            storedValue4 = 1;
            storedValue3 = 0;
         }
     }
     return storedValue5;
   }

   public int[] moveZeroesToEnd() {
      // UWHS ONLY:
      // Move all zeros to the end of while preserving order of non-zero elements. 
      // HINT: use a new array instead of changing intArray
      // Return the changed array
      int a = 0;
      for(int i = 0; i < intArray.length; i++) {
         if(intArray[i] == 0) {
         storedValue6++;
         }
         else {
         intArray2[a] = intArray[i];
         a++;
         }
      }
      for(int i = 0; i < storedValue6; i++) {
      intArray2[a] = 0;
      a++;
      }
      return intArray2;
   }
   
   public String toString() {
      if(c < 1) {
         for(int i = 0; i < intArray.length; i++) {
         list += intArray[i]+", ";
         }
         c++;
      }
      else { 
      list = "";
         for(int i = 0; i < intArray.length; i++) {
         list += intArray2[i]+", ";
         }
      }
      return "{ "+list+" }";
      }
   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayAlgorithms arrayAlgorithm = new ArrayAlgorithms(67);
      arrayAlgorithm.populateArrayWithRandom();
      System.out.println(arrayAlgorithm.findMax());
      System.out.println(arrayAlgorithm.hasDuplicates());
      System.out.println(arrayAlgorithm.isInArray(67));
      System.out.println(arrayAlgorithm.longestContiguousSubarray());
      arrayAlgorithm.moveZeroesToEnd();
      System.out.println(arrayAlgorithm);
      System.out.println(arrayAlgorithm);
   }
}
