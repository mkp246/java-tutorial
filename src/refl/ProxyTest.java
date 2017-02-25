package refl;

import java.lang.reflect.InvocationHandler;

public class ProxyTest {
    public static void main(String[] args) {
        InvocationHandler handler = new MyInvocationHandler();
        MyInterface proxyInstance = (MyInterface) java.lang.reflect.Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), new Class[]{MyInterface.class}, handler);
//        System.out.println(proxyInstance.greet());

        System.out.println(ProxyTest.class.getDeclaredClasses());
    }
}
