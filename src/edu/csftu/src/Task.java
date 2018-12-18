package edu.csftu.src;

/**
 * 定义一个可以交给线程去执行的任务
 * 
 * @author lenovo
 *
 */
public class Task implements Runnable{
	
	//  任务编号
	int n;
	

	public Task(int n) {
		super();
		this.n = n;
	}


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "开始 : " + n);
		// 延时
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "结束 : " + n);
	}

}
