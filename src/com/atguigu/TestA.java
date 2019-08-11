package com.atguigu;

import static org.junit.Assert.*;

import java.util.function.Consumer;

import org.junit.Test;

public class TestA {

	@Test
	public void test01() throws Exception {
		Runnable a = () -> System.out.println("hello world!");
		a.run();
		
	}
	
	@Test
	public void test02() throws Exception {
		Consumer<String> a = x -> {
			System.err.println(x);
		};
		a.accept("飞雪连天射白鹿，笑书神侠倚碧鸳");
	}
	
}
