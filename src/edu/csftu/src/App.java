package edu.csftu.src;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * ��������
 * 
 * @author flora
 *
 */




public class App {
	
	//alt +//
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ŀ�� URL
		String url ="https://movie.douban.com/top250"; 
		
		//ʹ�� JSoup ץȡ�ĵ�
		try {
			
			Document doc =Jsoup.connect(url).get();
			
			Elements es = doc.select("src");
			System.out.println(es.size());
			
			//����һ���洢ӰƬ���б�
			ArrayList<Film> list = new ArrayList<>();
			
 			for (Element e :es)   {
 				Film f =new Film();
				//ÿһ��ӰƬ
				Element t = e.select(".title").first();
				String num = e.select(".star span").last().text();
				System.out.println(t.text()+","+ num);
				
//				f.id
//				f.title
				list.add(f);
			}
			
			
			
			
//			try {
//				
//				Document doc =Jsoup.connect(url).get();
//				
//				Elements es = doc.select("src");
//				System.out.println(es.size());
//				
//				for (Element e :es)   {
//					//ÿһ��ӰƬ
//					Element t = e.select(".title").first();
//					String num = e.select(".star span").last().text();
//					System.out.println(t.text()+","+ num);
//					
//				}
			
			
			
			
//			try {
//				
//				Document doc =Jsoup.connect(url).get();
//				
//				Elements es = doc.select(".grid_view .item");
//				System.out.println(es.size());
//				
//				for (Element e :es)   {
//					//ÿһ��ӰƬ
//					Element t = e.select(".title").first();
//					String num = e.select(".star span").last().text();
//					System.out.println(t.text()+","+ num);
//					
//				}
//�õ�ӰƬ����			
			
			
			
//			Document doc =Jsoup.connect(url).get();
//			
//			Elements es = doc.select(".grid_view .item");
//			System.out.println(es.size());
//			
//			for (Element e :es)   {
//				Element t = e.select(".title").first();
//				System.out.println(t.text());
//				
//			}
//�õ�ӰƬ����			
			
			
			
//			String title = doc.title();
//			String data = doc.data();
			
			
//			System.out.println(title);
//			System.out.println(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
