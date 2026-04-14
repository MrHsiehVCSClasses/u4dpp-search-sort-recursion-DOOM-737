package u4cpp;

import java.util.ArrayList;

public class Sort {

    //selection sort
    public static int [] selectionSort(int[] x){
        int[] result = copyArray(x);

        for (int i = 0; i < result.length - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < result.length; j++){
                if (result[j] < result[minIndex]){
                    minIndex = j;
                }
            }

            int temp = result[i];
            result[i] = result[minIndex];
            result[minIndex] = temp;
        }
        return result;
    }

    //insertion sort
    public static int[] insertionSort(int[] x){
        int[] result = copyArray(x);

        for (int i = 1; i < result.length; i++){
            int current = result[i];
            int j = i - 1;

            while (j >= 0 && result[j] > current){
                result[j + 1] = result[j];
                j--;
            }
            result[j + 1] = current;
        }
        return result;
    }

    //sekection sort
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> x){
        ArrayList<Integer> result = copyList(x);

        for (int i = 0; i < result.size() - 1; i++){
            int maxIndex = i;

            for (int j = i + 1; j < result.size(); j++){
                if (result.get(j) > result.get(maxIndex)){
                    maxIndex = j;
                }
            }

            int temp = result.get(i);
            result.set(i, result.get(maxIndex));
            result.set(maxIndex, temp);
        }
        return result;
    }

    //insertion sort
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> x){
        ArrayList<Integer> result = copyList(x);

        for (int i = 1; i < result.size(); i++){
            int current = result.get(i);
            int j = i - 1;

            while (j >= 0 && result.get(j) < current){
                result.set(j + 1, result.get(j));
                j--;
            }
            result.set(j + 1, current);
        }
        return result;
    }

    //merge sort
    public static ArrayList<Integer> mergeSort (ArrayList<Integer> x){
        ArrayList<Integer> result = copyList(x);

        if (result.size() <= 1){
            return result;
        }

        int mid = result.size() / 2;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < mid; i++){
            left.add(result.get(i));
        }
        for (int i = mid; i < result.size(); i++){
            right.add(result.get(i));
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    //helper to merge two sorted lists
    private static ArrayList<Integer> merge (ArrayList<Integer> left, ArrayList<Integer> right){
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()){
            if (left.get(i) <= right.get(j)){
                merged.add(left.get(i));
                i++;
            }else{
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()){
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()){
            merged.add(right.get(j));
            j++;
        }
        return merged;
    }

    //helper to copy array
    private static int[] copyArray(int[] x){
        int[] copy = new int[x.length];
        for(int i = 0; i < x.length; i++){
            copy[i] = x[i];
        }
        return copy;
    }

    //helper to copy list
    private static ArrayList<Integer> copyList(ArrayList<Integer> x){
        ArrayList<Integer> copy = new ArrayList<>();
        for (int i = 0; i < x.size(); i++){
            copy.add(x.get(i));
        }
        return copy;
    }

}