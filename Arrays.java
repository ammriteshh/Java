// public class Arrays {
//     public static void main(String a[]) {
//         int nums[] = { 3, 7, 2, 4 };
//         nums[1] = 5;
//         System.out.println(nums[0]);
//         System.out.println(nums[1]);
//     }
// }

// public class Arrays {
//     public static void main(String a[]) {
//         int nums[] = new int[4]; // 4 boxes but the values are 0
//         nums[0] = 4;
//         nums[1] = 3;
//         nums[2] = 6;
//         nums[3] = 5;
//         System.out.println(nums[0]);
//         System.out.println(nums[1]);
//     }

//print all the values at once
public class Arrays {
    public static void main(String a[]) {
        int nums[] = new int[4]; // 4 boxes but the values are 0
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 6;
        nums[3] = 5;

        for (int i = 0; i <= 4; i++) {
            System.out.println(nums[i]);
        }
    }
}