// public class MultiArrays {
//     public static void main(String a[]) {
//         int nums[][] = new int[3][4];// three row four column
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//printing random values
public class MultiArrays {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];// three row four column
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                // System.out.print(nums[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
