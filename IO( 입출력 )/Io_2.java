package study1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* 참고

     개행
      - 파일을 작성할 때는 \n만으로도 개행할 수 있지만, 윈도우 콘솔에서는 Enter를 입력했을 때는 \r, \n의 순으로 입력된다.
      
     한글 쓰기
      - write() 기본형은 1byte 단위로 쓰기를 수행하기 때문에 최소 2byte 이상인 한글을 작성할 때는 여러 개의 byte 데이터를 한 번에 전달할 수 밖에 없다.
      
     write() 메서드
      - write() 메서드를 사용하면 데이터가 메모리 버퍼에 쓰여진다.
	  - 메모리 버퍼에 쓰여진 값들을 실제 콘솔이나 파일에 출력하기 위해선 flush() 메서드를 사용해야 한다.
      - 출력이 끝나면 자원을 반납하기 위해서 close() 메서드 사용.
      
     flush() 메서드
      - FileOutputStream 객체는 내부적으로 메모리 버퍼를 사용하지 않으므로 flush()를 생략할 수 있다.
      - 하지만 콘솔, 네트워크 등 메모리 버퍼를 사용할 때 실제로 출력하기 위해서는 반드시 flush() 메서드를 호출해야 한다.
      - 처음에는 내부 메모리 버퍼를 사용할 때와 사용하지 않을 때를 일일이 구분할 필요 없이 write() 메서드 호출 이후에는 가급적 flush()를 사용하는 게 편할 수 있다.
      
 */

public class Io_2 {
	public static void main(String[] args) throws IOException {
		File tempDir = new File("test");	     // 생성한 txt 파일을 관리할 폴더.
		File engFile = new File("test/eng.txt"); // 영어 텍스트 작성할 txt 파일.
		File korFile = new File("test/kor.txt"); // 한글 텍스트 작성할 txt 파일.
		
		// eng.txt와 kor.txt 파일을 관리할 폴더 생성
		if(!tempDir.exists())
			tempDir.mkdir();
		
		
		
		// ---------- 영어 작성 ----------
		
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
		
		
		
		// ---------- 한글 작성 ---------- 
		
		// 한글 : n-byte 단위 쓰기( byte[]의 처음부터 끝가지 출력 ).
		OutputStream os4 = new FileOutputStream(korFile);
		byte[] byteArr3 = "안녕하세요".getBytes();
		
		os4.write(byteArr3);
		os4.write('\n');
		os4.close();
		
		// 한글 : n-byte 단위 쓰기( byte[]의 offset 위치부터 length만큼 읽어와 출력 ).
		OutputStream os5 = new FileOutputStream(korFile, true);
		byte[] byteArr4 = "반갑습니다".getBytes();
		
		os5.write(byteArr4, 0, 6);
		os5.write('\n');
		os5.close();
				
		// 한글 + 영어 작성
		OutputStream os6 = new FileOutputStream(korFile, true);
		byte[] byteArr5 = "ABC가나다".getBytes();
		
		os6.write(byteArr5, 0, 6); // ABC가( UTF-8 기준 영어 1글자 1byte, 한글 1글자 3byte이므로 'A ~ 가'까지 출력됨 ).
		os6.write('\n');
		os6.close();	
	}
}


