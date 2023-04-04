package day17;

import java.io.IOException;

public class IOStreamEx {

	public static void main(String[] args) {
		/* 자바는 입력스트림, 출력스트림을 통해 데이터를 입출력한다.
		 * 스트림 : 단방향으로 데이터가 흘러가는 형태
		 * 다양한 입출력 장치에의해 입출력이 이루어짐.
		 * 다양한 장치에 독립적으로 일관성있는 입출력을 유지하기 위해 입출력스트림을 통해 일성관을 제공
		 * 
		 * 두가지 형태의 스트림 구분
		 * - 바이트 형태의 스트림 : 기본 (문자, 그림, 멀티미디어)
		 * - 문자 형태의 스트림 : 문자만 입출력할 때 사용
		 * 
		 * - 바이트 스트림
		 * 	-입력 : InputStream : fileInputStream, BufferedInputStream, DataInputStream...
		 * 	-출력 : OutputStream : fileOutputStream, PrintStream, BufferedOutputStream...
		 * - 문자 스트림
		 *  -입력 : Reader : FileReader, BufferedReader, InputStreamReader...
		 *  -출력 : Writer : FileWriter, PrintWriter, BufferedWriter...
		 *  
		 * - 기반스트림 / 보조스트림
		 * - 기반스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * - 보조스트림 : 직접 읽고 쓰는 기능은 없지만 추가적인 기능을 더해주는 스트림
		 * - 기반스트림EX : fileInputStream, fileOutputStream, FileReader, FileWriter ...
		 * - 보조스트림Ex : InputStreamReader, BufferedReader, BufferedWriter, BufferedOutputStream ...
		 *  		 
		 * */
		//표준 출력(모니터) 스트림
		System.out.println();
		
		//표준 입력(키보드) 스트림
		try {
			int d = System.in.read(); //한바이트 읽기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//표준 에러 출력(모니터) 스트림
		System.err.println();

	}

}
