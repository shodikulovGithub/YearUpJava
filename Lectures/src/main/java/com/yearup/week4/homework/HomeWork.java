package com.yearup.week4.homework;

import com.yearup.week4.code.linkedlist.SinglyLinkedList;


public class HomeWork {
//    public static void generateTable(int n) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i + " x " + n + " = " + i * n);
//        }
//    }

//    public static char[] reverseString(String input) {
//
//        int c = 0;
//        char[] out = new char[input.length()];
//        for (int i = input.length() - 1; i >= 0; i--) {
//            out[c++] = input.charAt(i);
//
//        }
//        return out;
//    }
//
//    /**
//     * returns true if element is contained in the array else false
//     *
//     * @param arr
//     * @param element
//     * @return
//     */
//    public static boolean containsElement(int[] arr, int element) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == element) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    /**
//     * returns the sum of primary diagonal of given 2d int array n*n
//     *
//     * @param arr
//     * @return
//     */
//    public static int diagonalSumOfArray(int[][] arr) {
//
//        int d = arr.length - 1;
//        int sum = 0;
//        for (int i = 0; i <= d; i++) {
//            sum += arr[i][d - i];
//        }
//
//        return sum;
//    }
////        int sum = 0;
////        for (int i = 0; i < arr.length; i++)
////            for (int j = 0; j < arr[0].length; j++) {
////
////                if (i == j) {
////                    sum += arr[i][j];
////                }
////
////            }
//
//
////        int[] oneD = new int[]{1,2,3,4,5,6,7,8,9};
////        int[][] twoD = new int[][] {
////                {1,2,3},
////                {4,5,6},
////                {7,8,9}
////        };
//
////        int [][] dynamic2D = new int[3][3];
////        for (int i = 0; i<3; i++){
////            for(int j=0;j<3; j++){
////                    dynamic2D[i][j] = i;
////            }
////        }
////        for (int i = 0; i<3; i++){ //looping over rows
////            for(int j=0;j<3; j++){ //looping over colums
////                System.out.print(dynamic2D[i][j]);
////            }
////            System.out.println();
////        }
////        return 0;
////    }
//
//    /**
//     * @param arr player X ,player O
//     * @return X, O or D for draw
//     */
//    public static char ticTacToeWinner(char[][] arr) {
//        /*
//        {'X','X','O'},
//        {'O','X','O'},
//        {'O','O','X'}
//
//        0,0, 0,1, 0,2
//        1,0, 0,1, 1,2
//        2,0, 2,1, 2,2
//
//         */
//
////            if(arr[0][0] ==  arr [0][1] && arr[])
//        return 0;
//    }
//
//    /**
//     * returns the array with duplicates removed
//     *
//     * @param arr
//     * @return
//     */
//    public static int[] removeDuplicates(int[] arr) {
//
//        return null;
//    }
//
//    /**
//     * returns the reversed linked list
//     *
//     * @param input
//     * @return
//     */
//    public static SinglyLinkedList<Integer> reverseLinkedList(SinglyLinkedList<Integer> input) {
//        return null;
//    }
//
//    /**
//     * implement this interface to create your own arraylist
//     */
//    interface MyArrayList {
//        int size();
//
//        void add(int element);
//
//        int remove(int pos);
//    }
//
//    public static int[] getEvenElementsArray(int start, int total) {
//
//        int[] out = new int[total];
//
//        if (start % 2 != 0) start += 1;
//        for (int i = 0; i < total; i++) {
//            out[i] = start;
//            start += start + 2;
//        }
//        return out;
//    }
//
//    public static int[] progressivelyDecreasingSeries(int start, int limit) {
//
//        int[] myArray = new int[limit];
//        int full = 0;
//
//        for (int i = 1; i < limit; i++) {
//
//        }
//        return myArray;
//    }


//    class MyList implements MyArrayList{
//
//
//            @Override
//            public int size() {
//                return 0;
//
//            @Override
//            public void add ( int element){
//                arr[size++] = element;
//            }
//            @Override
//            public int remove ( int pos){
//                int toBeRemoved = arr[pos];
//                }
//                return 0;
//            }
//        }

    public static int[] removeElement(int[] arr, int pos) {


        for(int i=pos;i<arr.length;i++) {
            arr[i] = arr[i+1];
        }
        return arr;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

//        int[] out = HomeWork.removeElement(arr,2);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if (i == 2) continue;
            System.out.print("hi");
    }



//        int[] out = HomeWork.progressivelyDecreasingSeries(10, 5);
//        for (int i =0; i<out.length; i++)
//            System.out.print(out[i]+ " ");

//        int[] out = HomeWork.getEvenElementsArray(5, 4);
//        for (int i =0; i<out.length; i++)
//            System.out.print(out[i]+ " ");

//        int[] intArray = new int[]{5,3,6,8,10};
//        int searchValue = 1;
//        System.out.println(HomeWork.containsElement(intArray, searchValue));
//        System.out.print(HomeWork.reverseString("YearUp"));

//        int[][] twoD = new int[][] {
//                {1,2,2},
//                {4,6,6},
//                {11,8,9}
//        };
//
//        System.out.print(HomeWork.diagonalSumOfArray(twoD));

    }
}
