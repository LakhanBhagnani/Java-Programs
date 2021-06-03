import java.util.*;
import java.util.function.Function;

public class code {
    public static int isValuePresent(int pages, int elements, int query, int a[][]) {
        for (int j = 0; j < pages; j++) {
            for (int k = 0; k < elements; k++) {
                if (a[j][k] == query) {
                    return j;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Pages");
        int noOfPages = sc.nextInt();
        System.out.println("Enter no of elements in pages");
        int noOfElements = sc.nextInt();
        System.out.println("Enter no of queries:");
        int noOfQueries = sc.nextInt();
        int[][] pageArray = new int[noOfPages][noOfElements];
        for (int i = 0; i < noOfPages; i++) {
            System.out.println("Enter the elements of page no." + (i+1));
            for (int j = 0; j < noOfElements; j++) {
                pageArray[i][j] = sc.nextInt();
            }
        }
        int[] queries = new int[noOfQueries];
        int isValueFound;
        for (int i = 0; i < noOfQueries; i++) {
            System.out.println("Which element do you want to check: ");

            queries[i] = sc.nextInt();
            isValueFound = isValuePresent(noOfPages, noOfElements, queries[i], pageArray);

            if (isValueFound == -1) {
                System.out.println("No Value found");
            } else {
                System.out.println("The value "+queries[i]+" found in page no."+ (isValueFound+1));
            }
        }

        sc.close();
    }

}
