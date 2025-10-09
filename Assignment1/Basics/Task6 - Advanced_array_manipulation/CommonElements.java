public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {3, 2, 6, 2};

        int[] common = commonElements(a, b);

        System.out.print("Common: [");
        for (int i = 0; i < common.length; i++) {
            System.out.print(common[i]);
            if (i < common.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int[] commonElements(int[] a, int[] b) {
        if (a == null || b == null) return new int[0];

        int[] temp = new int[Math.min(a.length, b.length)];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            boolean foundInB = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    foundInB = true;
                    break;
                }
            }
            if (foundInB) {
                boolean alreadyAdded = false;
                for (int m = 0; m < k; m++) {
                    if (temp[m] == a[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded) {
                    temp[k++] = a[i];
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
