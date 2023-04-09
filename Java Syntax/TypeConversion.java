package study1;

public class TypeConversion  {
	public static void main(String[] args) {
		
		// 숫자를 문자로 변환 
		System.out.println(3 + '0');				// 출력 결과 : 51	, ASCII 코드에서 '0'은 48이다. 48과 3을 더하면 정수 51이 된다.
		System.out.println((char)(3 + '0'));		// 출력 결과 : 3	, ASCII 코드에서 51은 문자 '3'을 나타낸다. 51을 char 타입으로 캐스팅하면 문자 '3'이 된다.
		
		// 문자열을 문자로 변환1
		char ch1 = "123".charAt(0);
		
		// 문자열을 문자로 변환해서 char[] 배열에 저장 후 출력
		String str = "123";
		char[] ch2 = new char[str.length()];
		for(int i = 0; i < ch2.length; i++) {
			ch2[i] = str.charAt(i);
			System.out.print(ch2[i]);				// 출력 결과 : 123
		}
		System.out.println();
		
		
		
		// 숫자를 문자열로 변환
		// String.valueof()은 null 값을 문자열 "null"을 반환하고, Integer.toString()은 반환하지 않는다. 일반적으로 null 값이 발생하지 않을 경우 valueof(), toString() 두 가지 방법 중 어떤 것을 사용해도 상관없다.
		String str1 = 123 + "";						// 숫자에 빈 문자열을 더한다.
		String str2 = Integer.toString(123);		// 메서드 사용해서 문자열로 변환.
		String str3 = String.valueOf(123);			// 메서드 사용해서 문자열로 변환.
			
		// 문자를 문자열로 변환
		String str4 = '3' + "";						// 문자에 빈 문자열을 더한다.
		String str5 = String.valueOf('3');			// 메서드 사용해서 문자열로 변환.
	
		
		
		// 문자를 숫자로 변환		
		int num1 = '3' - '0';						// ASCII 코드에서 '3'은 51이고, '0'은 48이다. 51과 48을 배면 정수 3이 된다.
		int num2 = Character.getNumericValue('3');	// Character.getNumericValue() 메서드 사용.

		// 문자열을 숫자로 변환 
		int num3 = Integer.parseInt("123");			// 메서드 사용해서 정수를 문자열로 변환.
		double num4 = Double.parseDouble("3.14");	// 메서드 사용해서 실수를 문자열로 변환.	
		
	}
}
