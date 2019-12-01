package com.banyuan.cglib;

import com.sun.xml.internal.xsom.XSUnionSimpleType;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynProxyImpl  implements MethodInterceptor {

    //在调用目标方法的时候    cglib会回调MethodInterceptor 拦截器里面的 实现方法进行拦截  来实现自己的代理逻辑
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        System.out.println("我在这里执行了拦截操作,然后再去执行目标方法"+method.getName());

     //  Object   obj= methodProxy.invokeSuper(o,objects); // 不可调用  invoke();
        Object  obj=methodProxy.invokeSuper(o,objects);

        return obj;
    }


    /**
     * Enhancer    既能够代理class  也能代理接口
     */



}
