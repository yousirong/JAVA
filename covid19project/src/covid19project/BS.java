package covid19project;

import java.util.ArrayList;
import java.util.Scanner;
import java.net.*;
import java.io.*;

/**

* URL로 지정되는곳에서 TARGET을 찾습니다.

*/

class ST implements Runnable {  
    private String url;
    private String tar;
    public ST(String url,String tar) {
        this.url = url;
        this.tar = tar;
    }

    public void run() {
        BufferedReader b = null;
        try {
        URL u = new URL(url);
            b = new BufferedReader(new InputStreamReader(u.openStream()));
            String s = "";
            while((s = b.readLine()) != null) {
                if (s.indexOf(tar) != -1) {
                    System.out.println(url + " , " + tar + " 찾았습니다.");
									return;
                }
            }
            System.out.println(url + " , " + tar + " 없습니다.");

        }
        catch(Exception err ) {
            err.printStackTrace();
        }
        finally {
            try {
                if (b != null)                        
                    b.close();
            }
            catch(Exception ignore) { }         
        }
    }
}
class STTest  {
    public static void main(String[] args){
			System.out.println("찾으실 단어를 써주세요:");
			Scanner sc = new Scanner(System.in);
			
			String tg = sc.next();
			ArrayList<Thread> threadList = new ArrayList<Thread>();
			Runnable r1 = new ST("https://imnews.imbc.com/pc_main.html?gnb=top",tg);
			Thread test1 = new Thread(r1);
			test1.start();
			Runnable r2 = new ST("https://news.kbs.co.kr/common/main.html?ref=pLogo",tg);
			Thread test2 = new Thread(r2);
			test2.start();
			Runnable r3 = new ST("https://news.jtbc.joins.com",tg);
			Thread test3 = new Thread(r3);
			test3.start();
			Runnable r4 = new ST("https://www.ytn.co.kr",tg);
			Thread test4 = new Thread(r4);
			test4.start();

			threadList.add(test1);
			threadList.add(test2);
			threadList.add(test3);
			threadList.add(test4);
		try {
			for(Thread t: threadList) {
				t.join();
			}
		}catch (InterruptedException e) {  // [주석 10: 예외처리]
			
			e.printStackTrace();
		}
		
			System.out.println("찾기 종료");
			sc.close();
    }
}
public class BS {

    public static void main(String[] args) throws InterruptedException {
    	STTest ST = new STTest();
    	ST.main(null);
    }
   }
