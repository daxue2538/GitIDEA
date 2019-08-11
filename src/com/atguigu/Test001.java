package com.atguigu;

abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int fly();
}

public class Test001 {

	public void test(Bird bird) {
		System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
	}

	public static void main(String[] args) {
		Test001 test = new Test001();
		test.test(new Bird() {

			public int fly() {
				return 10000;
			}

			public String getName() {
				return "大雁";
			}
		});
	}
}
