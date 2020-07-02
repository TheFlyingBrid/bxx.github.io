package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author ASUS
 * @version V1.0
 * @date 2017年9月10日 下午4:29:42
 */
public class ClassFind {
	
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		List<Integer> b = new ArrayList<Integer>();
		
		System.out.println(a.getClass());
		System.out.println(a.getClass() == b.getClass());
		System.out.println(a.getClass().equals(b.getClass()));
	}
}
