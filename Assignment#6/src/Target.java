public class Target {
    public static int closestNumber(int[] a, int target) {
        if (a == null || a.length == 0) {
            return 0;
        }
        if (target <= a[0]) {
            return 0;
        }
        if (target >= a[a.length - 1]) {
            return a.length - 1;
        }
        int start = 0;
        int end = a.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (a[mid] >= target) {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        int index = end;
        if (a[start] >= target) {
            index = start;
        }
        return a[index] - target < target - a[index - 1] ? index : index - 1;
    }
    public static void main(String[] args) {
        int[] a = {0,1,5};
        int target = 7;
        System.out.println(closestNumber(a,target));
    }
}
