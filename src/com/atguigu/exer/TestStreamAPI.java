package com.atguigu.exer;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.atguigu.Employee;
import com.atguigu.Employee.Status;

public class TestStreamAPI {

	@Test
	public void test01() throws Exception {
		Integer[] nums = {1,2,3,4,5,6};
		Arrays.stream(nums).map(x->x*x).forEach(System.out::println);
	}
	
	List<Employee> emps = Arrays.asList(
			new Employee(102, "李四", 79, 6666.66, Status.BUSY),
			new Employee(101, "张三", 18, 9999.99, Status.FREE),
			new Employee(103, "王五", 28, 3333.33, Status.VOCATION),
			new Employee(104, "赵六", 8, 7777.77, Status.BUSY),
			new Employee(104, "赵六", 8, 7777.77, Status.FREE),
			new Employee(104, "赵六", 8, 7777.77, Status.FREE),
			new Employee(105, "田七", 38, 5555.55, Status.BUSY)
	);
	
	@Test
	public void test02() throws Exception {
		Integer max = emps.stream().map(x->1).reduce(Integer::sum).get();
		System.out.println(max);
	}
}
