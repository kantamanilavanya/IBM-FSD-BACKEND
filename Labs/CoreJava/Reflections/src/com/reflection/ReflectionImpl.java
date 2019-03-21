package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionImpl {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class<?> c = Class.forName("com.reflection.Calculator");
		Constructor<?> con = c.getConstructor();
		Object ob = c.newInstance();
		Method m = c.getDeclaredMethod("add", Integer.class, Integer.class);
		int results = (int) m.invoke(ob, 10, 20);
		System.out.println("Add:" + results);

		Method m1 = c.getDeclaredMethod("sub", Integer.class, Integer.class);
		int results1 = (int) m1.invoke(ob, 30, 20);
		System.out.println("SUB:" + results1);

		Method m2 = c.getDeclaredMethod("div", Integer.class, Integer.class);
		int results2 = (int) m.invoke(ob, 10, 20);
		System.out.println("DIV:" + results2);

		Method m3 = c.getDeclaredMethod("mul", Integer.class, Integer.class);
		int results3 = (int) m.invoke(ob, 100, 20);
		System.out.println("MUL:" + results3);

		/*
		 * Calculator s=(Calculator)c.newInstance(); int result= s.add(100,120);
		 * System.out.println(result);
		 */

	}

}
