package 모듈과_패키지_개념_자바_기본_패키지;
/* 		StringTokenizer클래스
 * java.util.StringTokenizer
 * 		하나의 문자열을 여러 문자열 분리
 * 			문자열을 분리할 때 사용되는 기준 문자 : 구분 문자(delimiter)
 *  String query = "name=kitae&addr=seoul&age=21";
 *  StringTokenizer st = new StringTokenizer(query, "&");
 *  	토큰(token)
 *  		구분 문자로 분리된 문자열
 * 
 * String 클래스의 split() 메소드를 이용하여 동일한 구현 가능
 *  	String s[] = a.split(",");
 */
// "홍길동/장화/홍련/콩쥐/팥쥐" 문자열을 '/'를 구분 문자로 하여 토큰을 분리하여 각 토큰을 출력하라.
import java.util.StringTokenizer;
public class StringTokenizerClass {

	public static void main(String[] args) {
				StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
				while (st.hasMoreTokens()) 
					System.out.println(st.nextToken());
			}
		}
	
