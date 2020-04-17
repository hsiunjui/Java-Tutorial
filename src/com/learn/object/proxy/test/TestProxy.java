package com.learn.object.proxy.test;

import com.learn.object.proxy.Cglib;
import com.learn.object.proxy.CglibProxy;
import com.learn.object.proxy.JDKProxy;
import com.learn.object.proxy.JDKProxyImpl;
import com.learn.object.proxy.ProxyJDKProxy;

public class TestProxy {

	public static void main(String[] args) {
		
		JDKProxy jDKProxy = new JDKProxyImpl();
		jDKProxy.save();
		
		// 增强后的对象(不能转成实例类型)
		JDKProxy proxy = (JDKProxy)new ProxyJDKProxy(jDKProxy).createProxy();
		proxy.save();
		
		/*** ----------------------------**/
		Cglib cg = new Cglib();
		cg.save();
		
		Cglib cgProxy = (Cglib) new CglibProxy(cg).createProxy();
		cgProxy.save(); // 有一个警告,是JDK版本过高造成的
	
	}

}
