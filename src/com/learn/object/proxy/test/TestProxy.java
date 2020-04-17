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
		
		// ��ǿ��Ķ���(����ת��ʵ������)
		JDKProxy proxy = (JDKProxy)new ProxyJDKProxy(jDKProxy).createProxy();
		proxy.save();
		
		/*** ----------------------------**/
		Cglib cg = new Cglib();
		cg.save();
		
		Cglib cgProxy = (Cglib) new CglibProxy(cg).createProxy();
		cgProxy.save(); // ��һ������,��JDK�汾������ɵ�
	
	}

}
