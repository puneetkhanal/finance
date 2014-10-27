package com.finance.framework.intefaces;

import java.util.Vector;

public interface IDataSet<R> {
	public Vector toVector();
	public R getData();

}
