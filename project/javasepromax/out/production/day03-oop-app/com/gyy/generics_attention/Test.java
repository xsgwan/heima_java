// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

package com.gyy.generics_attention;

import java.io.PrintStream;
import java.util.ArrayList;

public class Test
{

	public Test()
	{
	}

	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add("java1");
		list.add("java2");
		list.add("java3");
		String rs = (String)list.get(2);
		System.out.println(rs);
	}
}
