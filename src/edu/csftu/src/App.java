package edu.csftu.src;

import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 程序的入口
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
		//   线程池
		//   固定大小
		ExecutorService pool = Executors.newFixedThreadPool(4);
		//   无限（缓存）
		pool = Executors.newCachedThreadPool();
		//   一个线程
//		pool = Executors.newSingleThreadExecutor();
		ArrayList<Film> list = new ArrayList<Film>();
		String url = "https://movie.douban.com/top250?start";
		
		for(int i=0; i<10; i++) {
			String path = String.format("%s=%d",url,i*25);
			pool.submit(new Spider(path, list));		
			
			
		}
		pool.shutdown();
//		System.out.println(pool.isTerminated());
		while (!pool.isTerminated())
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//  数据排序
		System.out.println(list.size());
		for(Film film : list)
		{
			System.out.println(film.toCSV());
		}
		// 写入文件
		String file="d:/film.csv";//绝对路径
//		String file = "film.csv";//当前位置（可覆盖上一句代码）
		
		//排序
//		Collections.sort(list,null);//null可改成其他的排序规则
		
		//io操作
		try (FileWriter out = new FileWriter(file)){
			//写数据
			for (Film film : list) {
				out.write(film.toCSV());
			}
			System.out.println("ok");
		} catch (Exception e) {
			// TODO: handle exception
		}
			}
	}
		
//		pool.submit(task);



		
//		Thread thread1 = new Thread(new Runnable()
//				{
//
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						while (true) {
//							System.out.println("111");
//						}
//					}
//			
//				});
//		Thread thread2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				while (true) {
//					System.out.println("2222222");
//				}
//			}
//			
//		});
//		
//		thread1.start();
//		thread2.start();
//		
		

