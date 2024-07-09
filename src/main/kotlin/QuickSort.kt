package org.example

class QuickSort {

    fun sort(list: IntArray, firstIndex: Int, lastIndex: Int) {

        if (lastIndex - firstIndex <= 0) {
            return;
        }

        if (lastIndex - firstIndex == 1) {
            if (list[firstIndex] > list[lastIndex]) {
                swap(list, firstIndex, lastIndex)
            }
            return;
        }

        val pivotValue = list[lastIndex];
        var swapIndex = 0;
        var swapValue = list[swapIndex];

        for (i in 0 until lastIndex) {
            val currentValue = list[i];

            if (currentValue <= pivotValue) {
                if (currentValue < swapValue) {
                    swap(list, i, swapIndex);
                }
                swapIndex++;
                swapValue = list[swapIndex];
            }
        }

        swap(list, lastIndex, swapIndex);

        sort(list, 0, swapIndex - 1);
        sort(list, swapIndex + 1, lastIndex);

    }

    private fun swap(list: IntArray, i: Int, j: Int) {
        val aux = list[i];
        list[i] = list[j];
        list[j] = aux;
    }

}