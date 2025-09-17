public class practic {

  public static void main(String[] args) {
    System.out.println("Hello Vishnu");

// ✅ Code Example (Largest + Smallest)

    // class Main {
    //   public static int getLargest(int arr[]) {
    //     int largest = arr[0]; // Assume pehla element largest hai
    //     for (int i = 1; i < arr.length; i++) {
    //       if (arr[i] > largest) {
    //         largest = arr[i]; // agar bada element mile to update karo
    //       }
    //     }
    //     return largest;
    //   }

    //   public static int getSmallest(int arr[]) {
    //     int smallest = arr[0]; // Assume pehla element smallest hai
    //     for (int i = 1; i < arr.length; i++) {
    //       if (arr[i] < smallest) {
    //         smallest = arr[i]; // agar chhota element mile to update karo
    //       }
    //     }
    //     return smallest;
    //   }

    //   public static void main(String[] args) {
    //     int numbers[] = { 10, 45, 67, 23, 99, 34, 5, 120 };

    //     int largest = getLargest(numbers);
    //     int smallest = getSmallest(numbers);

    //     System.out.println("Largest number is: " + largest);
    //     System.out.println("Smallest number is: " + smallest);
    //   }
    // }


    // class Main {
    //   public static void printPairs(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //       int current = arr[i];
    //       for (int j = i + 1; j < arr.length; j++) {
    //         System.out.print("(" + current + ", " + arr[j] + ") ");
    //       }
    //       System.out.println(); // new line for clarity
    //     }
    //   }

    //   public static void main(String[] args) {
    //     int numbers[] = { 2, 4, 6, 8, 10 };
    //     printPairs(numbers);
    //   }
    // }

   
//     ✅ Kadane’s Algorithm Code
// class Main {
//     public static int maxSubArraySum(int arr[]) {
//         int maxSoFar = arr[0];   // overall max
//         int currentSum = arr[0]; // current running sum

//         for (int i = 1; i < arr.length; i++) {
//             // ya to current element start se lo, ya purane sum me add karo
//             currentSum = Math.max(arr[i], currentSum + arr[i]);
//             maxSoFar = Math.max(maxSoFar, currentSum);
//         }

//         return maxSoFar;
//     }

//     public static void main(String[] args) {
//         int numbers[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

//         int result = maxSubArraySum(numbers);
//         System.out.println("Maximum Subarray Sum = " + result);
//     }
// }

 

//    class Main {
//   public static void main(String[] args) {
//     int arr[] = { -5, -3, -7 };
//     int maxSum = Integer.MIN_VALUE; // ✅ Correct initialization
//     for (int i = 0; i < arr.length; i++) {
//       int sum = 0;
//       for (int j = i; j < arr.length; j++) {
//         sum += arr[j];
//         if (sum > maxSum) {
//           maxSum = sum;
//         }
//       }
//     }
//     System.out.println("Maximum Subarray Sum: " + maxSum);
//   }
// }  






          


    





  }

}
