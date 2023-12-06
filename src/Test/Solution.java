//package Test;
//import java.util.*;
//
//
//public class Solution {
//
//
//        public static ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
//            List<List<Integer>> quadruplets = new ArrayList<>();
//            Arrays.sort(new ArrayList[]{A});
//
//            for (int i = 0; i < A.length - 3; i++) {
//                for (int j = i + 1; j < A.length - 2; j++) {
//                    int left = j + 1;
//                    int right = A.length - 1;
//
//                    while (left < right) {
//                        int sum = A.get(i) + A.get(j) + A.get(left) + A.get(right);
//
//                        if (sum == B) {
//                            quadruplets.add(Arrays.asList(A.get(i), A.get(j), A.get(left), A.get(right)));
//                            left++;
//                            right--;
//                        } else if (sum < B) {
//                            left++;
//                        } else {
//                            right--;
//                        }
//                    }
//                }
//            }
//
//            return quadruplets;
//        }
//
//        public static void main(String[] args) {
//            int[] A = {1, 0, -1, 0, -2, 2};
//            int B = 0;
//
//            ArrayList<ArrayList<Integer>> quadruplets = fourSum(A, B);
//
//            System.out.println(quadruplets);
//        }
//    }
//}
