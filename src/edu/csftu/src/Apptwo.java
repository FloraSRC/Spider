package edu.csftu.src;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javafx.stage.DirectoryChooser;

/**
 * ����ӰƬҳ����Ϣ
 * 
 * @author lenovo
 *
 */
public class Apptwo {
	
	public static void main(String[] args) {
		
		//  1   ·��
		String url ="https://movie.douban.com/subject/1292722/"; 
	    //  2 Jsoup
		try {
			//  �����ҳ�е�����  ��DOM ����

			Document d = Jsoup.connect(url).get();
			
			//  ���ϣ������
			
			Elements es = d.select("#info");
			
			//  һ��
			
			//Element e = d.selectFirst("");		
			
			
			for (Element e :es)  
			{
				
//				String Name = e.select(".attrs").text();
				
			    String Director = (e.select(".attrs")).first().text();			    
				String Playwright = e.select(".attrs.attrs.attrs").first().text();
				String Player = e.select(".attrs").text();
//				String Style = e.select(".v:genre span").text();
				String Country = e.select(".attrs").text();
				String Language = e.select(".attrs").text();
//		    	String Date = e.select(".v:initialReleaseDate span").text();
//				String Time = e.select(".v:runtime span").text();
				String anothername = e.select(".attrs").text();
				String IMDbid = e.select(".attrs").text();
				//+Director+Playwright+Player+Style+Country+language+Date+Time+anothername+IMDbid
				System.out.println(Director+Playwright+Player+Country+Language+anothername+IMDbid);

			}

			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
