import org.junit.Test;
import org.junit.Assert;

public class SortingTest {
    /**
     * Test of insertionSort method, of class Sorting.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("Testing insertionSort...\n");
        int[] nums1 = new int[]{ 3, 6, 1 };
        int[] expResult1 = new int[]{ 1, 3, 6 };
        Solution instance = new Solution(nums1);
        instance.insertionSort();
        Assert.assertArrayEquals(expResult1, instance.sortingArray);
        Assert.assertEquals(3, instance.comparisonCount);

        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] expResult2 = new int[]{ 1, 2, 3, 4};
        instance = new Solution(nums2);
        instance.insertionSort();
        Assert.assertArrayEquals(expResult2, instance.sortingArray);
        Assert.assertEquals(3, instance.comparisonCount);

        int[] nums3 = new int[]{ 7, 3, 1, 5, 6, 2, 4 };
        int[] expResult3 = new int[]{ 1, 2, 3, 4, 5, 6, 7 };
        instance = new Solution(nums3);
        instance.insertionSort();
        Assert.assertArrayEquals(expResult3, instance.sortingArray);
        Assert.assertEquals(16, instance.comparisonCount);

        int[] nums4 = new int[99];
        for (int i = 0; i < 99; i++){
          nums4[i] = 99-i;
        }
        int[] expResult4 = new int[99];
        for (int i = 0; i < 99; i++){
          expResult4[i] = i+1;
        }
        instance = new Solution(nums4);
        instance.insertionSort();
        Assert.assertArrayEquals(expResult4, instance.sortingArray);
        Assert.assertEquals(4851, instance.comparisonCount);

    }

    /**
     * Test of mergeSort method, of class Sorting.
     */
    @Test
    public void testMergeSort() {
        System.out.println("Testing mergeSort...\n");
        int[] nums1 = new int[]{ 3, 6, 1 };
        int[] expResult1 = new int[]{ 1, 3, 6 };
        Solution instance = new Solution(nums1);
        instance.mergeSort(0, nums1.length-1);
        Assert.assertArrayEquals(expResult1, instance.sortingArray);
        Assert.assertEquals(5, instance.comparisonCount);

        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] expResult2 = new int[]{1, 2, 3, 4};
        instance = new Solution(nums2);
        instance.mergeSort(0, nums2.length-1);
        Assert.assertArrayEquals(expResult2, instance.sortingArray);
        Assert.assertEquals(8, instance.comparisonCount);

        int[] nums3 = new int[]{ 7, 3, 1, 5, 6, 2, 4 };
        int[] expResult3 = new int[]{ 1, 2, 3, 4, 5, 6, 7 };
        instance = new Solution(nums3);
        instance.mergeSort(0, nums3.length-1);
        Assert.assertArrayEquals(expResult3, instance.sortingArray);
        Assert.assertEquals(20, instance.comparisonCount);

        int[] nums4 = new int[99];
        for (int i = 0; i < 99; i++){
          nums4[i] = 99-i;
        }
        int[] expResult4 = new int[99];
        for (int i = 0; i < 99; i++){
          expResult4[i] = i+1;
        }
        instance = new Solution(nums4);
        instance.mergeSort(0,nums4.length-1);
        Assert.assertArrayEquals(expResult4, instance.sortingArray);
        Assert.assertEquals(664, instance.comparisonCount);


    }


    /**
     * Test of heapSort method, of class Sorting.
     */
    @Test
    public void testHeapSort() {
        System.out.println("Testing heapSort...\n");
        int[] nums1 = new int[]{ 3, 6, 1 };
        int[] expResult1 = new int[]{ 1, 3, 6 };
        Solution instance = new Solution(nums1);
        instance.heapSort();
        Assert.assertArrayEquals(expResult1, instance.sortingArray);
        Assert.assertEquals(3, instance.comparisonCount);

        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] expResult2 = new int[]{ 1, 2, 3, 4};
        instance = new Solution(nums2);
        instance.heapSort();
        Assert.assertArrayEquals(expResult2, instance.sortingArray);
        Assert.assertEquals(7, instance.comparisonCount);

        int[] nums3 = new int[]{ 7, 3, 1, 5, 6, 2, 4 };
        int[] expResult3 = new int[]{ 1, 2, 3, 4, 5, 6, 7 };
        instance = new Solution(nums3);
        instance.heapSort();
        Assert.assertArrayEquals(expResult3, instance.sortingArray);
        Assert.assertEquals(19, instance.comparisonCount);

        int[] nums4 = new int[99];
        for (int i = 0; i < 99; i++){
          nums4[i] = 99-i;
        }
        int[] expResult4 = new int[99];
        for (int i = 0; i < 99; i++){
          expResult4[i] = i+1;
        }
        instance = new Solution(nums4);
        instance.heapSort();
        Assert.assertArrayEquals(expResult4, instance.sortingArray);
        Assert.assertEquals(927, instance.comparisonCount);

    }

}
