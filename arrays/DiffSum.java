//package arrays;
//
//import java.lang.reflect.Array;
//import java.util.*;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class DiffSum {
//    public static void main(String[] args) {
//        Integer[] numArr = {3, 1, 4, 2, 2};
//        Arrays.sort(numArr, Collections.reverseOrder());
//        //
//        /**
//         *  can use for primitive and wraper classes
//         *  -- Arrays.stream(numArray).sorted(Comparator.reverseOrder)
//         *
//         */
//        int[] splitArr1 = new int[numArr.length];
//        int[] splitArr2 = new int[numArr.length];
//
//        int split1Index = 0;
//        int split2Index = 0;
//
//        for (Integer integer : numArr) {
//
//            //    if (Arrays.stream(splitArr1).sum() > Arrays.stream(splitArr2).sum()) {
//            if (sumOfArr(splitArr1) > sumOfArr(splitArr2)) {
//                splitArr2[split2Index] = integer;
//                split2Index += 1;
//            } else {
//                splitArr1[split1Index] = integer;
//                split1Index += 1;
//            }
//        }
//
//
//        System.out.println("------------Split 1 Array -------------------");
//
//        Arrays.stream(splitArr1).forEach(System.out::print);
//
//        System.out.println("-------------Split 2 Array ---------------------");
//        Arrays.stream(splitArr2).forEach(System.out::print);
//        System.out.println("------------------------------------");
//        System.out.println(Arrays.stream(splitArr1).sum());
//        System.out.println(Arrays.stream(splitArr2).sum());
//    }
//
//    private static int sumOfArr(int[] arr) {
//        if (arr == null) {
//            System.out.println("sum of arr 0 ");
//            return 0;
//        } else {
//            int sum = 0;
//            for (int i : arr) {
//                sum += i;
//            }
//            System.out.println("sum of "+sum);
//            return sum;
////        }
//    }
//}