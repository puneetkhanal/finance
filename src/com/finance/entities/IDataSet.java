package com.finance.entities;

import java.util.Vector;

public interface IDataSet<R> {
	public Vector toVector();
	public R getData();

}