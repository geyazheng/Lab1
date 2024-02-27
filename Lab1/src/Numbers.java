public class Numbers {
    public static void maxArrays() {
        int[] x = {1, 2, 9, 4, 11};
        int[] y = {6, 7, 8, 9, 10};
        int[] z = new int[5];
        
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        
        System.out.println("Array x = {" + arrayToString(x) + "}");
        System.out.println("Array y = {" + arrayToString(y) + "}");
        System.out.println("Array z = x + y = {" + arrayToString(z) + "}");
    }
    
    private static String arrayToString(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}

