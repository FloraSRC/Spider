package edu.csftu.src;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 单个影片页面信息
 * 
 * @author lenovo
 *
 */
public class Apptwo {
	
	public static void main(String[] args) {
		

		//  1   路径
		String url ="https://movie.douban.com/subject/1292722/"; 
	    //  2 Jsoup
		try {
			//  获得网页中的内容  （DOM 树）
		    ArrayList<Film> list= new ArrayList<>();
			Document d = Jsoup.connect(url).get();
			
			//  集合（多个）
			
			Elements es = d.select("#info");


			for (Element e :es)  
			{
				
//				String Name = e.select(".attrs").text();
				
			    String Director = (e.select(".attrs")).first().text();			    
				String Playwright = e.select(".attrs").get(1).text();
				String Player = e.select(".attrs").get(2).text();
				String Style = e.select("span").get(10).text()+e.select("span").get(11).text()+e.select("span").get(12).text();
//				String Country = e.select(".attrs").get().text();
//				String Language = e.select(".attrs").text();
//		    	String Date = e.select(".v:initialReleaseDate span").text();
//				String Time = e.select(".v:runtime span").text();
//				String anothername = e.select(".attrs").text();
//				String IMDbid = e.select(".attrs").text();
				//+Director+Playwright+Player+Style+Country+language+Date+Time+anothername+IMDbid
				System.out.println("导演   :   " + Director + "  编剧   ：   " +Playwright+"   演员   ：   "+Player+"   类型   ：   "+Style);

			}

			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
