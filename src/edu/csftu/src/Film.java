package edu.csftu.src;
/**
 * 影片
 * 
 * @author flora
 *
 */
public class Film implements Comparable<Film> {
	
	/**
	 * 影片名称
	 */
	String title;
	
	/**
	 * 相关信息
	 */
	String info;
	
	/**
	 * 评分
	 */
	double rating;
	
	/**
	 * 评分人数
	 */
	int num;
	
	/**
	 * 排名
	 */
	int id;
	
	/**
	 * 海报
	 */
	String poster;
	
	/**
	 * 短评
	 */
	String quote;
	
	public String toCSV() {
		return String.format("%d\t%s\t%d\t%.1f\n", 
				id,
				title,
				num,
				rating);
		
	}
	

	@Override
	public String toString() {
		return "Film [title=" + title + ", info=" + info + ", rating=" + rating + ", num=" + num + ", id=" + id
				+ ", poster=" + poster + ", quote=" + quote + "]";
	}


//	@Override
//	public int compareTo(Film o) {
//		// TODO Auto-generated method stub
//		return o.id - id;
//	}
//	


}
