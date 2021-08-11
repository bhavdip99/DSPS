package com.bhavdip.sample;

public class MergeSortTest {

    public static void main(String[] args) {
//        int[] arr = new int[]{36, 11, 72, 4, 55, 82, 3, 19, 9, 10};
        int[] arr = new int[]{1, 101, 10, 17, 19, 23, 23};
        MergeSortTest test = new MergeSortTest();
        test.mergeSort(arr, 0, arr.length - 1);

        test.traversal(arr);
        for (int j : arr) {
            System.out.print(j);
        }
    }

    void merge(int Arr[], int start, int mid, int end) {

        // create a temp array
        int temp[] = new int[end - start + 1];

        // crawlers for both intervals and for temp
        int i = start, j = mid + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while (i <= mid && j <= end) {
            if (Arr[i] <= Arr[j]) {
                temp[k] = Arr[i];
                k += 1;
                i += 1;
            } else {
                temp[k] = Arr[j];
                k += 1;
                j += 1;
            }
        }

        // add elements left in the first interval
        while (i <= mid) {
            temp[k] = Arr[i];
            k += 1;
            i += 1;
        }

        // add elements left in the second interval
        while (j <= end) {
            temp[k] = Arr[j];
            k += 1;
            j += 1;
        }

        // copy temp to original interval
        for (i = start; i <= end; i += 1) {
            Arr[i] = temp[i - start];
        }
    }

// Arr is an array of integer type
// start and end are the starting and ending index of current interval of Arr

    void mergeSort(int Arr[], int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid + 1, end);
            merge(Arr, start, mid, end);
        }
    }


    /*
    1,2,3,4,5
    5,1,4,2,3

    1,101,10,17,19,23,23

    ------

    INPUT - 1,10,17,19,23,23,101 = 4 executions 7/2 = 3
              arr
    start             end
    ->                <-
     !                 !
    101,1,23,10,23,17,19

    101, 1, 23, 10, 23, 17, 19

//     25, 62,19, 6, 17, 19


if(con){
    // something
}else{
    //something
}

val value = a<b ?. let{
    // something
} ?: run {
    //something
}


     */

    void traversal(int[] arr) {
        int[] temp = new int[arr.length];
//        temp[0] = arr[arr.length-1];
//        temp[1] = arr[0];
        int count = 0;
        int n = 100;
        int execution = 99 - 20;// log n
        for (int start = 0, end = arr.length - 1; start <= (arr.length / 2); start++, end--) {
            if (start < end) {
                temp[count++] = arr[end];
                temp[count++] = arr[start];
            } else {
                temp[arr.length - 1] = arr[arr.length / 2];
            }
        }

        //Printing
        for (int j : temp) {
            System.out.println(j);
        }

    }
}


