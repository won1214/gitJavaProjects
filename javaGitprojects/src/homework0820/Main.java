package homework0820;

public class Main {
	public static void main(String[] args) {
		
//		1번. numbur이라는 변수에 int형 값을 하나 입력받아 출력해라
		
		/*
		int number = sc.nextInt();
		System.out.println(number);
		*/
		
//		2번. 입력받은 값 num이 100보다 작은 정수이면 "100이하" 출력
//		100이면 "100" 100이상이면 "100을 초과하였습니다. 다시 입력해주세요"를 출력한 후
//		100이하가 입력될때 까지 반복한다.
		
		/*
		 int num = 0;
		
		while(true) {
			System.out.print("입력하세요 : ");
			num =sc.nextInt();
			
			if (num> 100) {
				System.out.println("100을 초과하였습니다. 다시 입력해주세요.");
			} else if(num < 100) {
				System.out.println("100 이하");
				break;
			} 
			else if(num == 100) {
				System.out.println("100");
				break;
			}
		} 
		 */
		
//		3번. 1부터 입력받은 num값까지의 전부를 더한 값을 구해라
//		 ex) num = 5일 때 1+2+3+4+5인 15출력   
		
		/*int sum = 0;
		int num = sc.nextInt();
		for(int i = 1; i<= num; i++) {
			sum += i;
		} 
		System.out.println(sum);
		*/
		
//		4번. 길이가 100인 int형 1차원배열 arr을 생성하고
//		1~num까지의 수를 순서대로 배열에 저장하고 출력해라
		
		/*int num = sc.nextInt();
		int[] arr = new int [100];
		
		for(int i = 1; i<= num ; i++) {
			arr[i] = i;
			System.out.print(arr[i] + " ");
		}
		*/
		
		Book[] BookList = new Book[5];
		
		BookList [0] = new Book(00, "상록수", "심훈");
		BookList [1] = new Book(01, "아무튼, 여름", "김신회");
		BookList [2] = new Book(02, "인형의 집", "헨리크 입센");
		BookList [3] = new Book(03, "자전거 도둑", "박완서");
		BookList [4] = new Book(04, "달콤한 인생", "이동건"  );
		
		System.out.println(BookList[0].toString());
		System.out.println(BookList[1].toString());
		System.out.println(BookList[2].toString());
		System.out.println(BookList[3].toString());
		System.out.println(BookList[4].toString());
	
		
		
		
		
		
	}
}
