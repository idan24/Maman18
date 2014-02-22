/**
 * Created by Idans on 22/02/14.
 */
/**
 * This class implements a maximum heap
 */
public class MaxHeap {
    private int[] data;
    private int size;

    /**
     * Initialize the heap with the given data. We clone it to make sure the original array is not
     * affected by this class.
     */
    public MaxHeap(int[] inputArray, int size) {
        data = inputArray.clone();
        this.size = size;
        for (int i = (int)Math.floor(size / 2); i >= 0; i--) {
            maxHeapify(i);
        }
    }

    /**
     * Fix the sub-tree of the given index to ensure it's a minimum heap.
     */
    private void maxHeapify(int index) {
        int l = left(index);
        int r = right(index);
        int smallest = compareChild(index, l);
        smallest = compareChild(smallest, r);
        if (smallest != index) {
            Utils.exchange(data, index, smallest);
            maxHeapify(smallest);
        }
    }

    /**
     * If the given child index exists, compares and returns the larger value.
     */
    private int compareChild(int smallest, int child) {
        if (child < size) {
            return (data[child] < data[smallest]) ? child : smallest;
        }
        return smallest;
    }

    /**
     * Return the left leaf of the given node.
     */
    private static int left(int index) {
        return 2 * index + 1;
    }

    /**
     * Return the right leaf of the given node.
     */
    private static int right(int index) {
        return 2 * index + 2;
    }

    /**
     * Return the minimum of the heap, delete it from the heap and fix the heap.
     */
    public int heapExtractMin() {
        int min = data[0];
        data[0] = data[size-1];
        size--;
        maxHeapify(0);
        return min;
    }
}
