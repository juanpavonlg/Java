class SolutionD {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    final int len = nums1.length + nums2.length;
    final int mid = len / 2;
    int prev = 0;
    int curr = 0;
    int i = 0;
    int j = 0;
    while (i + j <= mid) {
      prev = curr;
      if (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
          curr = nums1[i++];
        } else {
          curr = nums2[j++];
        }
      } else if (i < nums1.length) {
        curr = nums1[i++];
      } else {
        curr = nums2[j++];
      }
    }
    return len % 2 == 0 ? (curr + prev) / 2d : curr;
  } // findMedianSortedArrays()

  public static void main(String[] args) {
    final SolutionD sol = new SolutionD();
    System.out.println(sol.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3 }));
    System.out.println(sol.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
  } // main()
} // SolutionD
