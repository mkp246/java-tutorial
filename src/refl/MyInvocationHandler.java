package refl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //do something dynamic
        if(method.getName().equals("greet")){
            System.out.println("hi welcome to proxy worlds");
            return method.invoke(args);
        }
        return "no proxy executed";
    }
}
