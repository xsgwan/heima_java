// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MyArrayList.java

package com.gyy.generics_class;


public class MyArrayList
{

	private Object arr[];
	private int size;

	public MyArrayList()
	{
		arr = new Object[10];
	}

	public boolean add(Object e)
	{
		arr[size++] = e;
		return true;
	}

	public Object get(int index)
	{
		return arr[index];
	}
}
