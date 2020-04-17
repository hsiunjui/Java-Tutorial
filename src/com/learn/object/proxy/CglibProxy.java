package com.learn.object.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Cglib cg;
	
	public CglibProxy(Cglib cg) {
		this.cg = cg;
	}
	
	public Object createProxy() {
		// 创建核心类
		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(cg.getClass());
		// 设置回调
		enhancer.setCallback(this);
		// 生成代理
		return enhancer.create();
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		if("save".equals(method.getName())) {
			System.out.println("enhanced..");
		}
		return methodProxy.invokeSuper(proxy, args);
	}
}
