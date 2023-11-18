import java.io.*; //자바 IO패키지를 전부 불러오는 구문


public class keyboard_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while(true) { // CTRL-Z가 입력되면 read는 -1을 리턴
				int a=rd.read();
				if(a==-1)
					break;
				System.out.println((char)a); //입력된 문자 출력
			}
		}
		catch(IOException e) {
			System.out.println("입력 오류 발생");
		}

	}

}
