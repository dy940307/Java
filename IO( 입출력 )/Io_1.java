package study1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;


/* 참고
 
   1. 파일 구분자
    ㄴ new File("C:/abc/bcd.txt"), new File("C:\\abc\\bcd.txt"), new File("C:" + File.separator + "abc" + File.separator + "bcd.txt")
    
   2. 절대 경로, 상대 경로
    - 절대 경로( absolute path )	: 드라이브명( C:/, D:/ )부터 특정 위치까지의 전체 경로를 표기하는 방식.
    - 상대 경로( relative path )	: 현재 작업 폴더( working directory ) 위치를 기준으로 상대적인 경로를 표기하는 방식.
     - 절대 경로는 전체 위치를 그대로 표기해서 직관적기이기는 하지만, 다른 컴퓨터에서 프로그램을 실행할 때 파일을 해당 위치에 정확히 위치시켜야 한다.
     - 상대 경로는 절대 경로에 비해 경로가 간단히 표현될 뿐 아니라 다른 컴퓨터에서 실행할 때도 작업 폴더의 위치가 어디가 됐든 그 위치를 기준으로 파일의 위치를 저장할 수 있다.
   
   3. 아스키코드, 유니코드
    - 아스키( ASCII ) 코드 	: 영문, 알파벳, 숫자, 특수 기호, 제어 코드로 구성된 코드표.
     ㄴ 세계 어느나라든 전부 사용하는 요소만을 담았기에 아스키 코드는 전 세계의 문자셋에서 공통적으로 포함해 사용된다.
     ㄴ 아스키코드로는 모든 나라의 문자를 표현할 수 없다. 따라서 각 나라는 자신들만의 문자셋을 표준화홰 사용해야 한다( ex : 한국어( EUC-KR ), 일본어( EUC-JP ) ).
     ㄴ 어느 나라든 알파벳, 숫자, 특수 기호, 제어 코드를 사용하기에 모든 문자셋의 하위 비트에는 아스키코드를 중복해 포함하고 있다.
     
    - 유니코드( unicode )	: 하나의 문자셋 안에 전 세계 문자를 통합한 문자셋으로 다국어 문자를 동시에 표현할 수 있다( 국가별 모든 문자셋을 통합 ).
     ㄴ 나라별로 표준화된 문자셋으로 각 나라의 언어를 표현할 수 있지만, 하나의 시스템에는 하나의 문자셋만 사용할 수 있어서 동시에 여러 나라의 문자를 사용할 수 없다. 
     ㄴ 즉, 하나의 웹 페이지에서 EUC-KR, EUC-JP를 동시에 사용할 수 없다. 이걸 해결하기 위한 방법이 유니코드다.
       
   4. 문자셋
    - EUC KR	: 영어 1byte, 한글 2byte( 한글 누락o )
    - MS949	: 영어 1byte, 한글 2byte( 한글 누락X )
    
    - UTF-16	: 영어 2byte, 한글 2byte( BOM 코드로 인한 2byte 추가 )	  // 고정 길이
    - UTF-8	: 영어 1byte, 한글 3byte					  // 가변 길이
    
 */

public class Io_1 {
	public static void main(String[] args) throws IOException {
		// 폴더 및 파일 객체 생성.
		File tempDir = new File("test");
		File newFile = new File("test/test.txt");
		
		// 실제 폴더 생성
		if(!tempDir.exists())
			tempDir.mkdir(); // mkdirs() : 경로상의 모든 폴더 생성.
		
		// 실제 파일 생성
		if(!newFile.exists())
			newFile.createNewFile();
		
		// 영어 문자열 분해
		byte[] b1 = "abc".getBytes();						      // 설정된 문자셋 기본값( UTF-8 )
		byte[] b2 = "abc".getBytes(Charset.defaultCharset());			      // 설정된 문자셋 기본값( UTF-8 )
		byte[] b3 = "abc".getBytes("UTF-8");					
		byte[] b4 = "abc".getBytes("UTF-16");					
	
		// 분해한 영어 문자열을 저장한 byte[] 길이
		System.out.println(b1.length);						       // 길이 3( UTF-8로 분해한 길이 )
		System.out.println(b2.length);						       // 길이 3( UTF-8로 분해한 길이 )
		System.out.println(b3.length);						       // 길이 3( UTF-8로 분해한 길이 )
		System.out.println(b4.length);						       // 길이 8( UTF-16으로 분해한 길이 )
		
		// 분해한 영어 문자열 String으로 조합
		System.out.println(new String(b1));					       // abc
		System.out.println(new String(b2, Charset.defaultCharset()));	 	       // abc
		System.out.println(new String(b3, "UTF-8"));				       // abc
		System.out.println(new String(b4, "UTF-16"));				       // abc
		
		System.out.println();							       // 한 칸 띄우기
		
		// 한글 문자열 분해
		byte[] b5 = "가나다".getBytes();						      // 설정한 문자셋 기본값( UTF-8 )
		byte[] b6 = "봵봵".getBytes("EUC-KR");					      // EUC-KR은 누락된 한글이 있으므로 "봵봵" 문자열 대응할 수 없음.
		byte[] b7 = "봵봵".getBytes("MS949");					      // MS949는 누락된 한글이 없으므로 "봵봵" 문자열 대응할 수 있음.

		// 분해한 한글 문자열을 저장한 byte[] 길이
		System.out.println(b5.length);							// 길이 9( UTF-8로 분해한 길이 )
		System.out.println(b6.length);							// 길이 2( EUC-KR 문자셋에 포함되지 않는 문자를 분해하였으므로 '봵'은 '?' 문자 하나로 분해된다. "봵봵" -> "??" ).
		System.out.println(b7.length);							// 길이 4( MS949로 분해한 길이 )
		
		// 분해한 한글 문자열 String으로 조합
		System.out.println(new String(b5));						// 가나다
		System.out.println(new String(b6, "EUC-KR"));					// ??
		System.out.println(new String(b7, "MS949"));					// 봵봵
		
		System.out.println();								// 한 칸 띄우기
		
		// 문자셋 객체 생성 및 활용
		Charset cs1 = Charset.defaultCharset();
		Charset cs2 = Charset.forName("MS949");
		Charset cs3 = Charset.forName("EUC-KR");
		
		// Charset 타입의 참조변수를 매개변수로 전달하여 한글 문자열 분해
		byte[] b8 = "안녕하세요".getBytes(cs1);				    // 설정한 문자셋 기본값( UTF-8 )
		byte[] b9 = "안녕하세요".getBytes(cs2);				    // MS949
		byte[] b10 = "안녕하세요".getBytes(cs3);				    // EUC-KR
	
		// 분해한 한글 문자열을 저장한 byte[] 길이
		System.out.println(b8.length);						// 15( UTF-8로 분해한 길이 )
		System.out.println(b9.length);						// 10( MS949로 분해한 길이 )
		System.out.println(b10.length);						// 10( EUC-KR로 분해한 길이 )
		
		// 분해한 문자열 조합	
		System.out.println(new String(b8, cs1));				// 안녕하세요
		System.out.println(new String(b9, cs2));				// 안녕하세요
		System.out.println(new String(b10, cs3));				// 안녕하세요	
	}
}
