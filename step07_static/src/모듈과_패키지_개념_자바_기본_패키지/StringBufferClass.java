package 모듈과_패키지_개념_자바_기본_패키지;
/* 가변 크기의 문자열 저장 클래스
 * Java.lang.StringBuffer
 * String 클래스와 달리 문자열 변경 가능
 * StringBuffer 객체의 크기는 스트링 길이에 따라 가변적
 * 
 * 생성
 * StringBuffer sb = new StringBuffer("java");
 */
public class StringBufferClass {
// StringBuffer를 이용하여 문자열을 조작하는 다음코드의 실행 결과는 무엇인가?
	public static void main(String[] args) {
				StringBuffer sb = new StringBuffer("This");

				sb.append(" is pencil"); // 문자열 덧붙이기
				System.out.println(sb);

				sb.insert(7, " my"); // "my" 문자열 삽입
				System.out.println(sb);

				sb.replace(8, 10, "your"); // "my"를 "your"로 변경
				System.out.println(sb);

				sb.delete(8, 13); // "your " 삭제
				System.out.println(sb);

				sb.setLength(4); // 스트링 버퍼 내 문자열 길이 수정
				System.out.println(sb);
			}
		}
	
