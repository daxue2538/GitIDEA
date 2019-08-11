package com.atguigu;

import static org.junit.Assert.*;

import java.util.function.Consumer;

import org.junit.Test;

public class TestLambda {

	@Test
	public void test01() {
		Runnable a = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
		};
		a.run();
		
		System.out.println("-------------------------------------------");
		
		Runnable b = () -> System.out.println("Hello Lambda!");
		b.run();
	}
	
	
	@Test
	public void test02() throws Exception {
		Consumer<String> a =  x -> System.out.println(x);
		a.accept("我大尚硅谷威武");
		
		System.out.println("--------------------");
		
		Consumer<String> b = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		b.accept("hello2");
		System.out.println("--------------------");
		b.accept("hello3");
		
	}
	
	@Test
	public void test3() throws Exception {
		System.out.println(operation(100, (Integer x)->x*x));
		System.out.println(operation(100, new Myfun() {
			
			@Override
			public Integer getValue(Integer num) {
				return num*num;
			}
		}));
		
		
		System.out.println(operation(200, x->x-100));
	}
	
	
	public Integer operation(Integer num, Myfun fun) {
		return fun.getValue(num);	
	}
	
	
}
