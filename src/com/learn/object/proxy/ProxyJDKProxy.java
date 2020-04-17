package com.learn.object.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 生成动态代理对象与目标对象要是同一接口：
 * 在使用动态代理时,用来生成代理的委托对象必须是一个接口...
 * @author reyshaw
 *
 */
public class ProxyJDKProxy implements InvocationHandler {
	
	private JDKProxy jDKProxy;
	
	public ProxyJDKProxy(JDKProxy jDKProxy) {
		this.jDKProxy = jDKProxy;
	}
	
	// 产生代理
	public Object createProxy() {
		Object proxy = Proxy.newProxyInstance(jDKProxy.getClass().getClassLoader(),jDKProxy.getClass().getInterfaces(), this);
		return proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if("save".equals(method.getName())) { // 对save方法进行增强
			System.out.println("check authurity...");
		}
		return method.invoke(jDKProxy, args);
	}
}
