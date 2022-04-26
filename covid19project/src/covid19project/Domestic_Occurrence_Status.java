package covid19project;
/* 정부 코로나바이러스감영증-19(covid-19) 홈페이지에서 
 * jsoup으로 매일 갱신되는 html값들을 받아와서 출력해줌*/
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Domestic_Occurrence_Status {

    public static void main(String[] args) {
    	
    		ArrayList<Element> elements0 = new ArrayList<>();
    		ArrayList<Element> title_element = new ArrayList<>();
        ArrayList<Element> elements1 = new ArrayList<>();
        ArrayList<Element> elements2 = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("http://ncov.mohw.go.kr/bdBoardList_Real.do?brdId=1&brdGubun=11&ncvContSeq=&contSeq=&board_id=&gubun=").userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36").get();
            Elements contents0 = doc.select("h5.s_title_in3");  //국재 발생현황
            Elements title = doc.select("div.caseTable>div>strong.ca_top");  //사망, 재원 위중증, 신규입원, 확진
            Elements contents1 = doc.select("div.caseTable>div>ul>li>dl>dd.ca_value");  //표의 숫자
            Elements contents2 = doc.select("div.caseTable>div>ul>li>dl>dt.ca_subtit"); //표의 글자(일일, 인구 10만명당)
//            System.out.println(contents1);
            for(Element e : contents0){
                elements0.add(e);
            }
            Element[] elementarr0 = elements0.toArray(new Element[]{});
            for(Element e : title){
            		title_element.add(e);
            }
            Element[] title_arr = title_element.toArray(new Element[]{});
            for(Element e : contents1){
                elements1.add(e);
            }
            Element[] elementarr1 = elements1.toArray(new Element[]{});
            for(Element e : contents2){
                elements2.add(e);
            }
            Element[] elementarr2 = elements2.toArray(new Element[]{});
            System.out.println("- - - - - - - - - - - - - - - - - - - -");
            String str0 = elementarr0[0].select("h5").get(0).text();
    			String result0 = str0.replaceAll("[^a-z|A-Z|0-9|ㄱ-ㅎ|가-힣+:.+()]", " "); //국내 발생현황
            	System.out.println("| "+result0+" |");	
            	System.out.println("- - - - - - - - - - - - - - - - - - - -");

            	for(int i=0 ; i<8 ; i++){
            		if(i%2 == 0) {
            			System.out.println("- - - - - - - - - - - - - - - - - - - -");
		        		String str_title = title_arr[i/2].select("strong").get(0).text();  
		        		String result_title = str_title.replaceAll("[^a-z|A-Z|0-9|ㄱ-ㅎ|가-힣]", "");
		        		System.out.println("| "+result_title);
            		}
            		String str2 = elementarr2[i].select("dt").get(0).text();  
            		String result2 = str2.replaceAll("[^a-z|A-Z|0-9|ㄱ-ㅎ|가-힣]", "");
                
                String str = elementarr1[i].select("dd").get(0).text();
                String result = str.replaceAll("[^0-9+.]", "");
                System.out.println("| "+result2+" : "+result);
               
            	}
        }catch (Exception e){
            System.out.println("error");
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        
        
    }
}
