package com.wbt.cl2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring实战4 2.5程序清单
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private CompactDisc compactDisc;

	@Test
	public void cdShouldNoBeNull() {
		//todo 这里在书中使用的assertNoNull的断言方法，但是这里可能是因为依赖关系没有办法引用，需要后面再解决
		System.out.println(compactDisc.toString());
	}
}
