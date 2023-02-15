package com.zz.gitstudy.dao;

import java.util.List;

/**
 * @author zhangfx
 * @date 2023/2/15
 */
public interface AppDao {
	<T> List<T> get();
	
	<T> T get(int id);
}
