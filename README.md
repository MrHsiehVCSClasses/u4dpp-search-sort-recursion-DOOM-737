# u4dpp - Programming Project

In this programming project you will implement various sorting algorithms, a recursive binary search, recursive math functions, and a recursive palindrome checker.

## Allowed Resources for the Project

You are allowed to use any of the following to help you with your project:

- any online Java API documentation
- Group discssion in class or online
- Online concept tutorials (Examples: *How does Recursion Work?* *How to Parse a String into an int in Java?*)

You are not permitted to use any of the following:

- Any tutorials on how to code solutions to the problems presented in this programming project, in any programming language. 

## Grading Breakdown

- Code compiles & runs without errors: 2 pts
- Formatting/indentation: 2 points
- All code commented: 2 points
- No public methods/attributes besides the ones specified (additional private methods/attributes are encouraged): 2 point
- All code is DRY (Don't repeat yourself): 2 points
- If recursive code is not recursive: minus 15 points. (binarySearch, mergeSort, RecursiveMath, and RecursivePalindromeChecker must all be recursive)
- Test Cases: 20 points (~60 test cases, so 1/3 of a point per question)
Total: 30 points


## Part A - Sort.java
Implement the following sorting algorithms in a static class `Sort`. You will implement selection sort, insertion sort, and merge sort:

- `int[] selectionSort(int[] x)`: Returns the array x sorted in ascending order using a selection sort
- `int[] insertionSort(int[] x)`: Returns the array x sorted in ascending order using an insertion sort
- `ArrayList<Integer> selectionSort(ArrayList<Integer> x)`: Returns the ArrayList x sorted in descending order using a selection sort
- `ArrayList<Integer> insertionSort(ArrayList<Integer> x)`: Returns the ArrayList x sorted in descending order using an insertion sort
- `ArrayList<Integer> mergeSort(ArrayList<Integer> x)`: Returns the ArrayList x sorted in ascending order using recursive merge sort
Because all the methods in this class are static, remember to not have any instance variables or constructors. Do not modify the parameters in any way.

## Part B - 'Search.java'
Write a recursive version of binary search, with the following method signature:

- `public static int binarySearch(int[] arr, int targetNumber)` - `targetNumber` is the value we are searching for. If the value is in the array/list, the function should return the index of the value. Otherwise, it returns -1.

If you need a refresher on how binary search works, you can google it.

Precondition: the given array is sorted, and there are no repeats (although binary search still works fine with repeats, it's just easier for testing if there are not repeats)



## Part C  - `RecursiveMath`
In a public class called `RecursiveMath`, implement the following functions: 
- `public static double pow(double base, int exponent)` 
  - returns `base` raised to the `exponent`. (e.g. `pow(2,4)` returns `16`)
  - *Precondition*: `exponent` is non-negative
- `public static BigInteger getFactorial(int n)` 
  - returns `n` factorial.
  - *Precondition*: `n` is non-negative
  - Google the documentation for BigInteger. You will only really need `BigInteger.multiply()` and `BigInteger.valueOf()`.
    - It is not necessary to know the `BigInteger` documentation for the AP Test, and it will not be tested in this class. The point of using `BigInteger` is more to develop your ability to find, understand, and utilize preexisting tools. 
- `public static int getFibonacciNumber(int n)` 
  - returns the `n`th number in the fibonacci series
    - Each fibonacci number is the sum of the two fibonacci numbers preceding it.
    - The first and second fibonacci number are both 1.  
  - *Precondition*: `n` is positive
  - **Note!!!** Running this number with anything above 50 will take a long time. It is recomended to test with 40 and below. 
  - Here is a mapping of the early fibonacci numbers: 

    | n | fib |
    | - | -- |
    | 1 | 1  |
    | 2 | 1  |
    | 3 | 2  |
    | 4 | 3  |
    | 5 | 5  |
    | 6 | 8  |
    | 7 | 13 |

It is recommended to implement the math functions in the order they are given above.

## Part D - `RecursivePalindromeChecker`
Implement the following function in the `RecursivePalindromeChecker` class:
- `public static boolean isPalindrome(String s)` 
  - returns `true` if the `String` is a palindrome. 
  - Preconditions: input will only contain lowercase letters, from a-z. No capitals/numbers/symbols/whitespace.
