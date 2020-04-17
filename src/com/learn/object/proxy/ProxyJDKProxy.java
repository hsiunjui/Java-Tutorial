package com.learn.object.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ���ɶ�̬���������Ŀ�����Ҫ��ͬһ�ӿڣ�
 * ��ʹ�ö�̬����ʱ,�������ɴ����ί�ж��������һ���ӿ�...
 * @author reyshaw
 *
 */
public class ProxyJDKProxy implements InvocationHandler {
	
	private JDKProxy jDKProxy;
	
	public ProxyJDKProxy(JDKProxy jDKProxy) {
		this.jDKProxy = jDKProxy;
	}
	
	// ��������
	public Object createProxy() {
		Object proxy = Proxy.newProxyInstance(jDKProxy.getClass().getClassLoader(),jDKProxy.getClass().getInterfaces(), this);
		return proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if("save".equals(method.getName())) { // ��save����������ǿ
			System.out.println("check authurity...");
		}
		return method.invoke(jDKProxy, args);
	}
}
