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
		// ����������
		Enhancer enhancer = new Enhancer();
		// ���ø���
		enhancer.setSuperclass(cg.getClass());
		// ���ûص�
		enhancer.setCallback(this);
		// ���ɴ���
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
