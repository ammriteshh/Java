// public class While_Loop {
//     public static void main(String args[]) {
//         int i = 1;

//         while (i <= 4) {
//             System.out.println("Hello");
//             i++;
//         }

//         System.out.println("Bye");
//     }
// }

//**********************NESTED WHILE LOOP */
public class While_Loop {
    public static void main(String args[]) {
        int i = 1;

        while (i <= 4) {
            System.out.println("Hi");
            int j = 1;
            while (j <= 3) {
                System.out.println("Hello");
                j++;
            }
            i++;
        }

        System.out.println("Bye");
    }
}
