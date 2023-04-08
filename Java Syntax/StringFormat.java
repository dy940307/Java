package study1;

import java.util.Date;
import java.util.Locale;

public class StringFormat {
	public static void main(String[] args) {
		
		// %d( = Integer Formatting )
		int i = 123456;
		System.out.println(String.format("%d", i));		// (123456)			, 기본 출력
		System.out.println(String.format("%,d", i));		// (123,456)			, % 뒤에 쉼표(,)를 붙이면 세 자리마다 쉼표
		System.out.println(String.format("%10d_", i));		// (    123456_)		, 출력 공간 10자리 확보( 우측 정렬 )
		System.out.println(String.format("%-10d_", i)); 	// (123456    _)		, 출력 공간 10자리 확보( 좌측 정렬 )
		System.out.println(String.format("%010d", i));		// (0000123456)			, 출력 공간 10자리 확보( 우측 정렬 ) + 값이 출력 공간 10보다 작으면 빈 공간에 0을 붙인다
		System.out.println();
		
		// %s( = String Formatting )
		String s = "abcd";
		System.out.println(String.format("%s", s));		// (abcd)			, 기본 출력
		System.out.println(String.format("%.2s", s));		// (ab)				, 출력 문자열 개수 설정( 점(.) 뒤에 숫자를 입력하면 된다 )
		System.out.println(String.format("%10s_", s));		// (      abcd_)		, 출력 공간 10자리 확보( 우측 정렬 )
		System.out.println(String.format("%10.2s_", s));	// (        ab_)		, 출력 공간 10자리 확보( 우측 정렬 ) + 2글자만 출력
		System.out.println(String.format("%-10s_", s));		// (abcd      _)		, 출력 공간 10자리 확보( 좌측 정렬 )
		System.out.println(String.format("%-10.2s_", s));	// (ab        _)		, 출력 공간 10자리 확보( 좌측 정렬 ) + 2글자만 출력
		System.out.println();
		
		// %f( = Floating point Formatting )
		double d = 123.45678;
		System.out.println(String.format("%f", d));		// (123.456780)			, 기본 출력( %f = %.6f )
		System.out.println(String.format("%.1f", d));		// (123.5)			, 출력 자릿수 설정( 점(.) 뒤에 숫자를 입력하면 된다), 반올림 된다
		System.out.println(String.format("%15f_", d));		// (     123.456780_)		, 출력 공간 15자리 확보( 우측 정렬 ), 소수점도 길이에 포함
		System.out.println(String.format("%15.2f_", d));	// (         123.46_)		, 출력 공간 15자리 확보( 우측 정렬 ), 소수점도 길이에 포함 + 소수점 아래 2자
		System.out.println(String.format("%-15f_", d));		// (123.456780     _)		, 출력 공간 15자리 확보( 좌측 정렬 ), 소수점도 길이에 포함
		System.out.println(String.format("%-15.2f_", d));	// (123.46         _)		, 출력 공간 15자리 확보( 좌측 정렬 ), 소수점도 길이에 포함
		System.out.println();
		
		// 10진수 -> n진수. %o, %x( = Octal/Hex Formatting ), %c( = Unicode char Formatting ) 
		int n = 100;
		System.out.println(String.format("%d", n));				// 100		, 10진수 출력
		System.out.println(String.format("%s", Integer.toBinaryString(n)));	// 1100100	, 2진수 출력
		System.out.println(String.format("%o", n));				// 144		, 8진수 출력
		System.out.println(String.format("%x", n));				// 64		, 16진수 출력
		System.out.println(String.format("%c", n));				// d		, 숫자를 유니코드로 변환
		System.out.println();
		
		// %t( DateTime Formatting )
		/*

		    %tF	: 연-원-일	
		    %tT	: 시:분:초
		    %ty	: 연, year
		    %tm	: 월, month
		    %td	: 일, day of month
		    %tH	: 시, 24-hour
		    %tM	: 분, minute
		    %tS	: 초, second
		    %tp : 오전, 오후    
		 */
		
		Date date = new Date();
		
		System.out.println(String.format("%tF", date));					// 2023-04-08
		System.out.println(String.format("%tT", date));					// 17:58:13
		System.out.println(String.format("%tF %tT", date, date));			// 2023-04-08 17:58:13
		System.out.println(String.format("%ty", date));					// 23
		System.out.println(String.format("%tm", date));					// 04
		System.out.println(String.format("%td", date));					// 08
		System.out.println(String.format("%tH", date));					// 17
		System.out.println(String.format("%tM", date));					// 58
		System.out.println(String.format("%tS", date));					// 13
		System.out.println();
		
		// Locale( 국가별 포맷 설정, Locale 미설정 시 OS에 설정된 값 적용 ).
		System.out.println(String.format("%tp", date));					// 오후
		System.out.println(String.format(Locale.ENGLISH,"%tp", date));			// pm
		System.out.println(String.format(Locale.JAPAN,"%tp", date));			// 午後
	
	}
}

