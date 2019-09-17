package TestDemo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) throws Exception {
        ItHeiMa hm = new ItHeiMa();
        SchoolService service = (SchoolService) Proxy.newProxyInstance(ItHeiMa.class.getClassLoader(), ItHeiMa.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                String methodName = method.getName();
                if (methodName.equals("login") || methodName.equals("buyCourse")) {
                    long start = System.currentTimeMillis();
                    result = method.invoke(hm, args);
                    long end = System.currentTimeMillis();
                    System.out.println("运行时长:" + (end - start));
                }else {
                    result = method.invoke(hm, args);
                }
                return result;
            }
        });

        System.out.println(service.login("admin", "123"));
        System.out.println(service.buyCourse(900));
        System.out.println(service.searchMyScore());
    }
}
