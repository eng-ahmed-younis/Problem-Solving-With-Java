package rotate_array;

public class RotateArray {

    public int[] rotate(int[] input, int d) {
        // Storing rotated version of array
        int size = input.length;
        int[] temp = new int[size];
        int[] rotatedArr = new int[size];

        // Keeping track of the current index
        // of temp[]
        int k = 0;

        // Storing the [n - d] elements of
        // array arr[] to the front of temp[]
        // is d = 4
        //[_,_,_,_,5,6,7,8,9]
        for (int i = d; i < size; i++) {
            temp[k] = input[i];
            k++;
        }

        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < d; i++) {
            temp[k] = input[i];
            k++;
        }

        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        System.arraycopy(temp, 0, rotatedArr, 0, size);

        return rotatedArr;
    }


    public int rotateRight(int[] arr, int order) {
        if (arr == null || order < 0 {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < order; i++) {  // Outer loop to repeat the process `order` times
            for (int j = arr.length - 1; j > 0; j--) {  // Inner loop for bubble-like shifting
                int temp = arr[j];              // Save the current element (rightmost)
                arr[j] = arr[j - 1];            // Shift the element to the right
                arr[j - 1] = temp;              // Place the saved element one position to the left
            }
        }
    }
}

/**
 * public static void main(String[] args) {
 * int [] arr = {1,2,3,4,5,6};
 * <p>
 * RotateArray rotateArray = new RotateArray();
 * printArr(
 * rotateArray.rotate(arr,2)
 * );
 * <p>
 * }
 **/


/*
Write a Java Program for a given array of integers arr[] of size N and an integer,
 the task is to rotate the array elements to the left by d positions.

After rotating d positions to the left, the first d elements become the last d elements of the array


First store the elements from index d to N-1 into the temp array.
Then store the first d elements of the original array into the temp array.
Copy back the elements of the temp array into the original array
***********************************************************************************************

Suppose the give array is arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2.


First Step:
    => Store the elements from 2nd index to the last.
    => temp[] = [3, 4, 5, 6, 7]


Second Step:
    => Now store the first 2 elements into the temp[] array.
    => temp[] = [3, 4, 5, 6, 7, 1, 2]


Third Steps:
    => Copy the elements of the temp[] array into the original array.
    => arr[] = temp[] So arr[] = [3, 4, 5, 6, 7, 1, 2]



    Step-by-step approach:

1- Initialize a temporary array(temp[n]) of length same as the original array
2- Initialize an integer(k) to keep a track of the current index
Store the elements from the position d to n-1 in the temporary array
Now, store 0 to d-1 elements of the original array in the temporary array
Lastly, copy back the temporary array to the original array

*/
