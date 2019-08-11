/*package com.atguigu;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class TestStreamAPI02 {
	
	
	List<Emp> emps = Arrays.asList(
			new Emp(104, "李四", 24, 4444.11), 
			new Emp(105, "王五", 25, 5555.11),
			new Emp(107, "陈七", 27, 7777.11),
			new Emp(107, "陈七", 27, 7777.11),
			new Emp(107, "陈七", 27, 7777.11),
			new Emp(106, "赵六", 26, 6666.11), 
			new Emp(103, "张三", 23, 3333.11)
	);
	
	
	

	// 内部迭代
	@Test
	public void test01() throws Exception {
		// 中间操作：不会执行如何操作，
		Stream<Emp> stream = emps.stream()
								 .filter(x -> {
									 System.out.println("中间操作");
									 return  x.getAge() > 25;
								 });
		// 终止操作：一次性执行全部内容，即"惰性求值"。
		stream.forEach(System.out::println);
		
	}
	
	
	
	@Test
	public void test02() throws Exception {
		emps.stream()
		    .filter(x -> {
		    	System.out.println("短路");
		    	return x.getSalary()>5000;
		    })
		    .limit(2)
		    .forEach(System.out::println);
	}
	
	@Test
	public void test03() throws Exception {
		emps.stream()
		    .filter(x ->x.getSalary()>5000)
		    .skip(2)
		    //.limit(1)
		    .distinct()
		    .forEach(System.out::println);
	}
	
	*//**
	 * 映射
	 * @throws Exception
	 *//*
	@Test
	public void test04() throws Exception {
		List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
		
		list.stream()
		    .map(str -> str.toUpperCase())
		    .forEach(System.out::println);
		
		System.out.println("--------------------");
		
		emps.stream()
		    .map(Emp::getName)
		    .forEach(System.out::println);
	}
	
	
	*//**
	 * 排序
	 * @throws Exception
	 *//*
	@Test
	public void test05() throws Exception {
		List<String> list = Arrays.asList("ccc","aaa","bbb","ddd","eee");
		list.stream()
		    .sorted()
		    .forEach(System.out::println);
		
		System.out.println("------------------------");
		emps.stream()
		    .sorted((e1,e2)-> {
		    	if(Integer.valueOf(e1.getAge()).equals(Integer.valueOf(e2.getAge()))) {
		    		return e1.getName().compareTo(e2.getName());
		    	}else {
		    		return -Integer.compare(e1.getAge(), e2.getAge());
		    	}
		    }).forEach(System.out::println);
		
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void test() throws Exception {
		// 创建Stream
		//1、可以通过Collection 系列集合提供的stream() 或是 parallelStram()
		List<String> list = new ArrayList<>();
		Stream<String> stream1 = list.stream();
		
		// 2、通过Arrays中的静态方法stream()获取数组流
		Emp[] emps = new Emp[10];
		Stream<Emp> stream2 = Arrays.stream(emps);
		
		// 3、通过Stream类中的静态方法of()
		Stream<String> stream3 = Stream.of("aa","bb","cc");
		
		// 4、无限流
		//迭代
		Stream<Integer> stream4 = Stream.iterate(0, x->x+2);
		//stream4.forEach(System.out::println);
		stream4.limit(20).forEach(System.out::println);
		
		//生成
		Stream.generate(()->Math.random())
			  .limit(10)
			  .forEach(System.out::println);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
*/