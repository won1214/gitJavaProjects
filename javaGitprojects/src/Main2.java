import java.util.Scanner;

	public class Main2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n;
	        do {
	            System.out.print("정수 : ");
	            n = sc.nextInt();
	            if (n < 3 || n % 2 == 0) {
	                System.out.println("다시 입력하세요.");
	            }
	        } while (n < 3 || n % 2 == 0);

	        int[] arr = new int[n];

	        for (int i = 0; i <= n / 2; i++) {
	            arr[i] = i + 1;
	        }

	        for (int i = n / 2 + 1, j = n / 2 - 1; i < n; i++, j--) {
	            arr[i] = j;
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


