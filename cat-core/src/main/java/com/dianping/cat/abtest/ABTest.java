package com.dianping.cat.abtest;

public interface ABTest {
	public ABTestId getTestId();

	public boolean isDefaultGroup();

	public boolean isGroupA();

	public boolean isGroupB();

	public boolean isGroupC();

	public boolean isGroupD();

	public boolean isGroupE();

	public boolean isGroup(String name);

}
