package study;

public class twoDimensionalArrCalc {
	
	// 다차원 배열에 저장된 모든 요소의 총합을 구하는 메서드
	 static int getTwoDimensionalArraySum(int[][] a) {
		 int sum = 0;	// 다차원 배열의 총합을 저장할 변수
		 
		 // 다차원 배열의 총합을 구한다
		 for(int i = 0; i < a.length; i++) {
			 for(int j = 0; j < a[i].length; j++) {
				 sum += a[i][j];
			 }
		 }
	
		 return sum; // 총합 리턴
	 }
	 
	 // 다차원 배열에 저장된 모든 요소의 평균을 구하는 메서드
	 static double getTwoDimensionalArrayAvg(int[][] a) {
		 double sum = getDimensionalArraySum(a);	// 평균을 구하기 위한 배열 총합 구하기
		 double count = 0;				// 평균을 구하기 위한 계산에 사용될 배열 요소의 총개수를 저장할 변수
		 
		 // 다차원 배열의 각 행마다 가진 요소의 개수를 count 변수에 저장하여 배열 요소의 총개수를 구한다
		 for(int i = 0; i < a.length; i++) {
			 count += a[i].length;
		 }
		
		 return sum / count; // 평균 리턴
	 }
	 
	 // 다차원 배열에 저장된 요소 중 최댓값을 구하는 메서드
	 static int getTwoDimensionalArrayMax(int[][] a) {
		 int max = a[0][0]; // 다차원 배열의 첫 번째 값으로 초깃값 설정
		 
		 // 현재 배열 a[i][j]의 값이 기존에 저장된 max( 최댓값 )보다 크면 a[i][j]의 값을 max에 저장한다
		 for(int i = 0; i < a.length;i ++) {
			 for(int j = 0; j < a[i].length; j++) {
				 if(a[i][j] > max)
					 max = a[i][j];
			 }
		 }
		 
		 return max; // 최댓값 리턴
	 }
	 
	 // 다차원 배열에 저장된 요소 중 최솟값을 구하는 메서드
	 static int getTwoDimensionalArrayMin(int[][] a) {
		 int min = a[0][0]; // 다차원 배열의 첫 번째 값으로 초깃값 설정
		 
		 // 현재 배열 a[i][j]의 값이 기존에 저장된 min( 최솟값 )보다 작으면 a[i][j]의 값을 min에 저장한다
		 for(int i = 0; i < a.length;i ++) {
			 for(int j = 0; j < a[i].length; j++) {
				 if(a[i][j] < min)
					 min = a[i][j];
			 }
		 }
		 
		 return min; // 최솟값 리턴
	 }
	
	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		System.out.println("총합: " + getTwoDimensionalArraySum(arr));
		System.out.println("평균: " + getTwoDimensionalArrayAvg(arr));
		System.out.println("최댓값: " + getTwoDimensionalArrayMax(arr));
		System.out.println("최솟값: " + getTwoDimensionalArrayMin(arr));
	}
}        
