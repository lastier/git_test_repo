import java.util.Scanner;


public class Scanner_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.");
//		
//		System.out.println("당신의 나이는 "+scanner.nextInt()+"살입니다.");
//		
//		System.out.println("당신의 체중은 "+scanner.nextDouble()+"kg 입니다.");
//		
//		System.out.println("당신의 신장은 "+scanner.nextDouble()+"cm 입니다."); 
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단어를 입력하세요.");
		
		String sc = scanner.nextLine();
		
		String word= scanner.next();
		
		System.out.println("입력된 단어는 : " + word+" 입니다.");
	
		System.out.println("입력된 단어의 갯수는 : "+ sc.split(" ").length + "개 입니다.");
		
		scanner.close();
	}

}
