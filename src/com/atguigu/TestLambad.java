/*package com.atguigu;

import static org.junit.Assert.*;

import java.beans.Customizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class TestLambad {

	List<Emp> emps = Arrays.asList(
		new Emp(104, "李四", 24, 4444.11), 
		new Emp(105, "王五", 25, 5555.11),
		new Emp(107, "陈七", 27, 7777.11),
		new Emp(106, "赵六", 26, 6666.11), 
		new Emp(103, "张三", 23, 3333.11));

	@Test
	public void test01() throws Exception {
		Collections.sort(emps, (e1, e2)->{
			if(e1.getAge() == e2.getAge()) {
				return e1.getName().compareTo(e2.getName());
			}else {
				return Integer.compare(e1.getAge(), e2.getAge());
			}
		});
		
		for (Emp emp : emps) {
			System.out.println(emp.toString());
		}
	}
	
	

	@Test
	public void test02() throws Exception {
		Consumer<String> con = System.out::println;
		con.accept("大家好");
	}
	
	
	@Test
	public void test03() throws Exception {
		Comparator<Integer> com = Integer::compareTo;
		System.out.println(com.compare(53, 324));
		
	}
}*/