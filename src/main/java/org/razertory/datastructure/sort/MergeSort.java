package org.razertory.datastructure.sort;

public class MergeSort extends Sort {

    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort(array, low, middle);
        mergeSort(array, middle + 1, high);
        merge(array, low, middle, high);
    }

    /**
     * 归并array
     *
     * @param array
     * @param low
     * @param middle
     * @param high
     */
    private void merge(int[] array, int low, int middle, int high) {
        // 辅助数组
        int[] helper = new int[array.length];
        System.arraycopy(array, 0, helper, 0, high + 1);

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        System.arraycopy(helper, helperLeft, array, current, remaining + 1);
    }
}
