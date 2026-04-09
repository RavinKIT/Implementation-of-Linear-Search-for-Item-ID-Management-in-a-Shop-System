import java.util.Scanner;
public class LinearSearchProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key, flag = 0;
        System.out.print("Enter number of items: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter item IDs:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter item ID to search: ");
        key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Item found at position: " + (i + 1));
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Item not found");
        }
        sc.close();
    }
}

