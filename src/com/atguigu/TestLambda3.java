package com.atguigu;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/**
 *
 * Consumer<T> 消费型借口(有去无回)
 *  void accept(T t) 
 *
 * Supplier<T> : 供给型接口 (获取)
 *  T get();
 *  
 * Function<T,R> ： 函数型接口
 *    R apply(T t);
 * 
 * Predicate<T> :断言型接口
 *  boolean test(T t);
 *  
 */
public class TestLambda3 {
	
	//Predicate<T> 断言型接口
	@Test
	public void test04() throws Exception {
		List<String> list = Arrays.asList("hello","atguigu","Lambda","www","ok");
		List<String> list2 = filterStr(list, x -> x.length()>3);
		for (String s : list2) {
			System.out.println(s);
		}
	}
	
	//需求：将满足条件的字符串添加到集合中。
	public List<String> filterStr(List<String> list, Predicate<String> pre){
		List<String> strList = new ArrayList<>();
		for (String str : list) {
			if(pre.test(str)) {
				strList.add(str);
			}
		}
		return strList;
	}
	
	
	//Function<T, R> 函数型接口
	@Test
	public void test03() throws Exception {
		String newStr = strHandler("\t\t\t 我大尚硅谷威武          ，hello   ", str -> str.trim());
		System.out.println(newStr);
		
		String newStr2 = strHandler("我大尚硅谷威武 ", str -> str.substring(2, 5));
		System.out.println(newStr2);
	}
	
	//需求：用于处理字符串的
	public String strHandler(String str, Function<String, String> fun) {
		return fun.apply(str);
	}
	
	// Supplier<T> 供给型接口
	@Test
	public void test02() throws Exception {
		List<Integer> list = getNumList(10, ()->(int)(Math.random()*100));
		for (Integer i : list) {
			System.out.println(i);
		}
	}
	
	
	//产生指定个数的整数，并放入集合中
	public List<Integer> getNumList(int num, Supplier<Integer> sup){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Integer n = sup.get();
			list.add(n);
		}
		return list;
	}
	

	//Consumer<T> 消费型接口
	@Test
	public void test01() throws Exception {
		happy(1000, m->System.out.println("消费了"+m+"元"));
	}
	
	public void happy(double money, Consumer<Double> con) {
		con.accept(money);
	}
	
	
	
	
}
