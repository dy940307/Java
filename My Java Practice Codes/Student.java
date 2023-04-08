package study1;

import java.util.Scanner;
import java.util.function.Function;

/*

 	주요 내용: 
	 - 사용자로부터 학생 이름, 키, 몸무게, 시력을 입력받는다. 
	 - 사용자는 몇 명의 학생 정보를 입력할 건지 학생 수를 입력한 후에 각 학생의 정보를 입력한다.
	 - 학생의 정보 입력이 끝나면 입력한 데이터를 바탕으로 '키, 몸무게, 시력'의 '최솟값, 최댓값, 평균, 빈도수' 정보를 출력한다.

	세부 내용:
	 - 학생 수 입력 범위 : 1 ~ 5
	 - 키, 몸무게 입력 범위 : 0.0 이상( 소수점 자릿수 입력 제한은 없지만, 화면에 출력될 때는 첫 번째 자리까지만 출력 ).
	 - 시력 입력 범위 : 0.0 ~ 2.0
	 - 키 빈도수 구간 : 100 이하, 101 ~ 110, 111 ~ 120, 121 ~ 130, 131 ~ 140, 141 ~ 150, 151 ~ 160, 161 ~ 170, 171 ~ 180, 191 ~ 200, 200 이상
	 - 몸무게 빈도수 구간 : 0kg 이하, 21 ~ 40kg, 41 ~ 60kg, 61 ~ 80kg, 81 ~ 100kg, 101kg 이상
	
 */

public class Student {
	String name;				// 이름
	double height, weight, vision;		// 키, 몸무게, 시력
	static final int VISION_FREQ_SIZE = 21;	// 시력 빈도수 저장할 배열 크기( 시력 범위 0.0 ~ 2.0( 0.1 단위로 총 21개 )
	
	// 학생 이름, 키, 몸무게, 시력을 초기화하는 생성자
	Student(String name, double height, double weight, double vision) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.vision = vision;
	}
	
	// 키 평균을 구하는 메서드
	static double getAverageHeight(Student[] students) { return getAverage(students, s -> s.height); }
	
	// 몸무게 평균을 구하는 메서드
	static double getAverageWeight(Student[] students) { return getAverage(students, s -> s.weight); }
	
	// 시력 평균을 구하는 메서드
	static double getAverageVision(Student[] students) { return getAverage(students, s -> s.vision); }
	
	// 키 최솟값과 최댓값을 구하는 메서드
	static double[] getMinMaxHeight(Student[] students) { return getMinMaxValues(students, "height"); }
	
	// 몸무게 최솟값과 최댓값을 구하는 메서드
	static double[] getMinMaxWeight(Student[] students) { return getMinMaxValues(students, "weight"); }
	
	// 시력 최솟값과 최댓값을 구하는 메서드
	static double[] getMinMaxVision(Student[] students) { return getMinMaxValues(students, "vision"); }
	
	// 평균을 구하는 메서드( 소수점 첫째 자리 반환( 나머지 자리 값들은 버림 처리 )
	static double getAverage(Student[] students, Function<Student, Double> attributeSelector) {
		double sum = 0.0;
		for(int i = 0; i < students.length; i++) {
			sum += attributeSelector.apply(students[i]);
		}
		double avg = sum / students.length;
		avg = Math.floor(avg * 10) / 10;
		return avg;
	}
         
	// 최솟값과 최댓값을 구하는 메서드
	static double[] getMinMaxValues(Student[] students, String field) {
	    double[] result = new double[2];	// 최솟값과 최댓값을 저장
	    double min = 0.0;
	    double max = 0.0;
	    
	    // 구분자( field )에 따라서 최솟값과 최댓값을 구한다
	    switch (field) {
		    case "height": // 입력받은 학생 키의 최솟값과 최댓값을 구한다
			    min = students[0].height;
			    max = students[0].height;
			    for (int i = 1; i < students.length; i++) {
				    if (students[i].height < min)
					    min = students[i].height;
				    else if (students[i].height > max)
					    max = students[i].height;
			    }
			    break;
		    case "weight": // 입력받은 학생 몸무게의 최솟값과 최댓값을 구한다
			    min = students[0].weight;
			    max = students[0].weight;
			    for (int i = 1; i < students.length; i++) {
				    if (students[i].weight < min)
					    min = students[i].weight;
				    else if (students[i].weight > max)
					    max = students[i].weight;
			    }
			    break;
		    case "vision": // 입력받은 학생 시력의 최솟값과 최댓값을 구한다
			    min = students[0].vision;
			    max = students[0].vision;
			    for (int i = 1; i < students.length; i++) {
				    if (students[i].vision < min)
					    min = students[i].vision;
				    else if (students[i].vision > max)
					    max = students[i].vision;
			    }
			    break;
		    default: // 존재하지 않는 학생 정보( 키, 몸무게, 시력 등 )일 경우 유효하지 않는 값이라고 화면에 출력한다
			    System.out.println("Invalid field");
			    return null;
	    } 
		
	    // switch문에서 구한 최솟값을 0번 인덱스, 최댓값을 1번 인덱스에 저장
		result[0] = min;
		result[1] = max;
		return result;
	}
	
	// 키 빈도수를 구하는 메서드
	static int[] getFrequencyHeight(Student[] students) {
		int[] freq = new int[12];
		for(int i = 0; i < students.length; i++) {
		    double height = students[i].height;
		    if 	    (height <= 100) freq[0]++;	// 키 100 이하
		    else if (height <= 110) freq[1]++;	// 키 101 ~ 110
		    else if (height <= 120) freq[2]++;	// 키 111 ~ 120
		    else if (height <= 130) freq[3]++;	// 키 121 ~ 130
		    else if (height <= 140) freq[4]++;	// 키 131 ~ 140
		    else if (height <= 150) freq[5]++;	// 키 141 ~ 150
		    else if (height <= 160) freq[6]++;	// 키 151 ~ 160
		    else if (height <= 170) freq[7]++;	// 키 161 ~ 170
		    else if (height <= 180) freq[8]++;	// 키 171 ~ 180
		    else if (height <= 190) freq[9]++;	// 키 181 ~ 190
		    else if (height <= 200) freq[10]++;	// 키 191 ~ 200
		    else 		    freq[11]++;	// 키 200 이상  
		}
		return freq;
	}	
	
	// 몸무게 빈도수를 구하는 메서드
	static int[] getFrequencyWeight(Student[] students) {
		int[] freq = new int[6];
		for(int i = 0; i < students.length; i++) {
			double weight = students[i].weight;
			if(weight <= 20) 	freq[0]++;	// 몸무게 20kg 이하
	        	else if(weight <= 40)	freq[1]++;	// 몸무게 21 ~ 40kg
			else if(weight <= 60)	freq[2]++;	// 몸무게 41 ~ 60kg
			else if(weight <= 80)	freq[3]++;	// 몸무게 61 ~ 80kg
			else if(weight <= 100)	freq[4]++;	// 몸무게 81 ~ 100kg
			else 			freq[5]++;	// 몸무게 101kg 이상
		}
		return freq;
	}
	
	// 시력 빈도수를 구하는 메서드
	static void getFrequencyVision(Student[] students, int[] freq) {
		int i = 0;
		freq[i] = 0;
		for(i = 0; i < students.length; i++) {
			if(students[i].vision >= 0.0 && students[i].vision < VISION_FREQ_SIZE / 10.0) {
				freq[(int)(students[i].vision * 10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String studentName;					
		double studentHeight, studentWeight, studentVision;	
		int studentCount;				
	
		// 학생 수 입력( 최대 5명 )
		do {
			System.out.print("학생 수 입력(1~5): ");
			studentCount = Integer.parseInt(sc.nextLine());
		} while(studentCount < 1 || studentCount > 5);
		System.out.println("-------------------------------------------");
		System.out.println();
		
		// 입력 받은 학생 수만큼 배열 초기화
		Student[] studentaArr = new Student[studentCount];
		
		// 학생 정보(이름, 키, 몸무게, 시력) 입력 후 객체 배열에 저장
		System.out.println("학생 정보(이름, 키, 몸무게, 시력)를 입력합니다.");
		System.out.println("----------------------------------");
		for(int i = 0; i < studentCount; i++) {
			// 학생 이름 입력
			System.out.print((i+1) + "번 학생 이름: " );
			studentName = sc.nextLine();
		
			// 학생 키, 몸무게, 시력을 음수로 입력할 경우 재입력
			do {
				System.out.print((i+1) + "번 학생 키: " );
				studentHeight = Double.parseDouble(sc.nextLine());
			} while(studentHeight < 0);
			
			do {
				System.out.print((i+1) + "번 학생 몸무게: " );
				studentWeight = Double.parseDouble(sc.nextLine());
			} while(studentWeight < 0);
			
			do {
				System.out.print((i+1) + "번 학생 시력(0.0~2.0): " );
				studentVision = Double.parseDouble(sc.nextLine());
			} while(studentVision < 0 || studentVision > 2);
			
			// 입력된 정보로 객체 배열 생성
			studentaArr[i] = new Student(studentName, studentHeight, studentWeight, studentVision);	
			System.out.println();
		}

		// 키, 몸무게, 시력 평균값 출력
		System.out.println("[평균값 출력]: --------------------------------");
		System.out.println(" 평균 키: " + getAverageHeight(studentaArr));
		System.out.println(" 평균 몸무게: " + getAverageWeight(studentaArr));
		System.out.println(" 평균 시력: " + getAverageVision(studentaArr));
		System.out.println("-------------------------------------------");
		System.out.println();
		
		// 키 최솟값, 최댓값 출력
		System.out.println("[최솟값, 최댓값 출력]: --------------------------");
		double[] heightMinMax = getMinMaxHeight(studentaArr);
		System.out.println(" 키 최솟값: " + heightMinMax[0] + ", 키 최댓값: " + heightMinMax[1]);
		
		// 몸무게 최솟값, 최댓값 출력
		double[] weightMinMax = getMinMaxWeight(studentaArr);
		System.out.println(" 몸무게 최솟값: " + weightMinMax[0] + ", 몸무게 최댓값: " + weightMinMax[1]);
		
		// 시력 최솟값, 최댓값 출력
		double[] visionMinMax = getMinMaxVision(studentaArr);
		System.out.println(" 시력 최솟값: " + visionMinMax[0] + ", 시력 최댓값: " + visionMinMax[1]);
		System.out.println("-------------------------------------------");
		System.out.println();
	
		// 키 빈도수 출력
		int[] heightFreq = getFrequencyHeight(studentaArr);
		System.out.println("[키 빈도수 출력]: ------------------------------");
		for(int i = 0; i < heightFreq.length; i++) {
			String range;
           		switch(i) {
                		case 0:  range = " 100 이하: ";	  break;
				case 1:  range = " 101 ~ 110: ";  break;
				case 2:  range = " 111 ~ 120: ";  break;
				case 3:  range = " 121 ~ 130: ";  break;
				case 4:  range = " 131 ~ 140: ";  break;
				case 5:  range = " 141 ~ 150: ";  break;
				case 6:  range = " 151 ~ 160: ";  break;
				case 7:  range = " 161 ~ 170: ";  break;
				case 8:  range = " 171 ~ 180: ";  break;
				case 9:  range = " 181 ~ 190: ";  break;
				case 10: range = " 191 ~ 200: ";  break;
				default: range = " 201 이상: ";	  break;
			}
            		System.out.println(range + heightFreq[i] + "명");
		}
		System.out.println("-------------------------------------------");
		System.out.println();
		
		// 몸무게 빈도수 출력
		int[] weightFreq = getFrequencyWeight(studentaArr);
		System.out.println("[몸무게 빈도수 출력]: ----------------------------");
		for(int i = 0; i < weightFreq.length; i++) {
			String range;
			switch(i) {
				case 0:	range 	= " 20kg 이하: ";	break;
				case 1:	range 	= " 21~40kg: ";	   break;
				case 2: range 	= " 41~60kg: ";	   break;
				case 3: range 	= " 61~80kg: ";	   break;
				case 4: range	= " 81~100kg: ";   break;
				default: range	= " 101kg 이상: "; break;
			}
			System.out.println(range + weightFreq[i] + "명");
		}
		System.out.println("-------------------------------------------");
		System.out.println();
				
		// 시력 빈도수 출력
		int[] freqVision = new int[VISION_FREQ_SIZE];
		getFrequencyVision(studentaArr, freqVision);
		System.out.println("[시력 빈도수 출력]: -----------------------------");
		for(int i = 0; i < VISION_FREQ_SIZE; i++) {
			System.out.printf(" %3.1f~: %2d명\n", i / 10.0, freqVision[i]);
		}
		System.out.println("-------------------------------------------");
		System.out.println();	
	}
}
