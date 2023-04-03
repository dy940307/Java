package study1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* 참고

     개행
      - 파일을 작성할 때는 \n만으로도 개행할 수 있지만, 윈도우 콘솔에서 Enter를 입력했을 때는 \r, \n의 순으로 입력된다.
      
     한글 쓰기 or 읽기
      - write() 기본형은 1byte 단위로 쓰기를 수행하기 때문에 최소 2byte 이상인 한글을 작성할 때는 영어와 달리 1-byte 단위로 작성할 수 없다.
      - read() 기본형은 1byte 단위로 읽기를 수행하기 때문에 한글을 읽을 때는 영어와 달리 1-byte 단위로 읽을 수 없다.
      
     write() 메서드
      - write() 메서드를 사용하면 데이터가 메모리 버퍼에 쓰여진다.
      - 메모리 버퍼에 쓰여진 값들을 실제 콘솔이나 네트워크 등으로 출력하기 위해선 flush() 메서드를 사용해야 한다.
      - 출력이 끝나면 자원을 반납하기 위해서 close() 메서드 사용.
      
     flush() 메서드
      - FileOutputStream 객체는 내부적으로 메모리 버퍼를 사용하지 않으므로 파일에 데이터를 작성할 때는 flush()를 생략할 수 있다.
      - 단, 어디까지나 파일일 경우이고 콘솔, 네트워크 등 메모리 버퍼를 사용하는 곳은 실제로 출력하기 위해서는 flush() 메서드를 사용해야 한다.
      - 처음에는 내부 메모리 버퍼를 사용할 때와 사용하지 않을 때를 일일이 구분하지말고 write() 메서드 호출 이후에는 flush()를 사용하기를 
      
 */

public class Io_2 {
	public static void main(String[] args) throws IOException {
		File tempDir = new File("test");	     // 생성한 txt 파일을 관리할 폴더.
		File engFile = new File("test/eng.txt");     // 영어 텍스트 작성할 txt 파일.
		File korFile = new File("test/kor.txt");     // 한글 텍스트 작성할 txt 파일.
		
		// eng.txt와 kor.txt 파일을 관리할 폴더 생성
		if(!tempDir.exists())
			tempDir.mkdir();
		
		
		
		// ---------- eng.txt 파일에 영어 작성 ----------
		
		// 영어 : 1-byte 단위 쓰기
		OutputStream os1 = new FileOutputStream(engFile, false); // false는 기본값으로 생략 가능( false : 덮어쓰기, true : 이어쓰기 ).
		os1.write('J');
		os1.write('a');
		os1.write('v');
		os1.write('a');
		os1.write('\n'); 
		os1.close();

		// 영어 : n-byte 단위 쓰기( byte[]의 처음부터 끝가지 출력 ).
		OutputStream os2 = new FileOutputStream(engFile, true);
		byte[] byteArr1 = "Hello".getBytes();
		
		os2.write(byteArr1);
		os2.write('\n'); 
		os2.close();
		
		// 영어 : n-byte 단위 쓰기( byte[]의 offset 위치부터 length만큼 읽어와 출력 ).
		OutputStream os3 = new FileOutputStream(engFile, true);
		byte[] byteArr2 = "Hello Java".getBytes();
		
		os3.write(byteArr2,6,4);
		os3.close();
		
		
		
		// ---------- 작성된 eng.txt 파일의 영어 읽기 ----------
		
		// 영어 : 1-byte 단위 읽기
		InputStream is1 = new FileInputStream(engFile);
		int data;
		
		while((data = is1.read()) != -1) {
			System.out.print((char)data);
		}
		
		is1.close();
		System.out.println();
		System.out.println();
		
		// 영어 : n-byte 단위 읽기( byte[]의 길이만큼 읽기 )
		InputStream is2 = new FileInputStream(engFile);
		byte[] byteArr3 = new byte[5];
		
		while((data = is2.read(byteArr3)) != -1) {
			for(int i = 0; i < data; i++)
				System.out.print((char)byteArr3[i]);
		}
		
		is2.close();
		System.out.println();
		System.out.println();
		
		// 영어 : n-byte 단위 읽기( 지정된 length만큼 읽어와 byte[]의 offset 위치부터 입력).
		InputStream is3 = new FileInputStream(engFile);
		byte[] byteArr4 = new byte[9];
		int offset = 3;
		int length = 6;
		// [0][1][2][3][4][5][6][7][8] 배열 공간 9개 중, offset( 3번 )부터 length( 6개 )의 데이터를 입력한다. 
		
		data = is3.read(byteArr4, offset, length); // 실제로 읽은 데이터의 길이는 6이므로 data 변수에 저장되는 값은 6이다.
		for(int i = 0; i < offset + data; i++)
			System.out.print((char)byteArr4[i]);
		
		is3.close();
		System.out.println();
		System.out.println();
		

		
		
		
		// ---------- kor.txt 파일에 한글 작성 ---------- 
		
		// 한글 : n-byte 단위 쓰기( byte[]의 처음부터 끝가지 출력 ).
		OutputStream os4 = new FileOutputStream(korFile);
		byte[] byteArr5 = "안녕하세요".getBytes();
		
		os4.write(byteArr5);
		os4.write('\n');
		os4.close();
		
		// 한글 : n-byte 단위 쓰기( byte[]의 offset 위치부터 length만큼 읽어와 출력 ).
		OutputStream os5 = new FileOutputStream(korFile, true);
		byte[] byteArr6 = "반갑습니다".getBytes();
		
		os5.write(byteArr6, 0, 6);
		os5.write('\n');
		os5.close();
				
		// 한글 + 영어 작성
		OutputStream os6 = new FileOutputStream(korFile, true);
		byte[] byteArr7 = "ABC가나다".getBytes();
		
		os6.write(byteArr7, 0, 6); // ABC가( UTF-8 기준 영어 1글자 1byte, 한글 1글자 3byte이므로 'A ~ 가'까지 출력됨 ).
		os6.write('\n');
		os6.close();
		
	
		
		// ---------- 작성된 kor.txt 파일의 한글 읽기 ----------
		
		// 한글 : n-byte 단위 읽기( byte[]의 길이만큼 읽기 )
		InputStream is4 = new FileInputStream(korFile);
		byte[] byteArr8 = new byte[50];
		
		while((data = is4.read(byteArr8)) != -1) {
			String str = new String(byteArr8, 0, data, "UTF-8"); // UTF-8 기본값이라서 생략 가능
			System.out.print(str);
		}
		
		is4.close();
		System.out.println();
		System.out.println();
		
		// 한글 : n-byte 단위 읽기( 지정된 length만큼 읽어와 byte[]의 offset 위치부터 입력).
		InputStream is5 = new FileInputStream(korFile);
		byte[] byteArr9 = new byte[9];
		int off = 3;
		int len = 6;
		// [0][1][2][3][4][5][6][7][8] 배열 공간 9개 중, offset( 3번 )부터 length( 6개 )의 데이터를 입력한다.  
		// UTF-8 기준으로 한글 1글자는 3byte이므로 한글 2글자만 저장하게 된다.
		
		data = is5.read(byteArr9, off, len);
		String str = new String(byteArr9, 0, off + len, "UTF-8");
		System.out.println(str);
		
		is5.close();	
	}
}


