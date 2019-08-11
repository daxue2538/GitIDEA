/*package com.atguigu;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class TestStreamAPI03 {

	List<Emp> emps = Arrays.asList(
			new Emp(104, "李四", 24, 4444.11), 
			new Emp(105, "王五", 25, 5555.11),
			new Emp(107, "陈七", 27, 7777.11),
			new Emp(106, "赵六", 26, 6666.11), 
			new Emp(103, "张三", 23, 3333.11)
	);
	
	
	@Test
	public void test01() throws Exception {
		boolean b = emps.stream()
		    .allMatch(x -> x.getSalary()>5000);
		System.out.println(b);
	}
	
	
	
	@Test
	public void testNam02() throws Exception {
		List<Double> costBeforeTax = Arrays.asList(100D, 200D, 300D, 400D, 500D);
		double bill = costBeforeTax.stream()
				                   .map((cost) -> cost + .12*cost)
				                   .reduce((sum, cost) -> sum + cost)
				                   .get();
		System.out.println("Total : " + bill);
		
		
		List<Integer> aaa = Arrays.asList(100, 200, 300, 400, 500);
		double asDouble = aaa.stream()
						     .mapToDouble((cost) -> cost + .12*cost)
						     .reduce((x,y)->x+y)
						     .getAsDouble();
		System.out.println(asDouble);
		
		
		List<Integer> bbb = Arrays.asList(100, 200, 300, 400, 500);
		Double collect = bbb.stream()
				            .collect(Collectors.summingDouble(x -> x + 0.12 * x));
		System.out.println(collect);
		
		
		
		
		
	}
	
	
	
	
	
}
*/