package refl;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException {
        Class personClass = Person.class; //Class.forName("refl.Person")
        System.out.println("class name : " + personClass.getName());
        System.out.println("class name simple: " + personClass.getSimpleName());
        System.out.println("modifiers : " + personClass.getModifiers());
        int modifiers = personClass.getModifiers();
        System.out.println("isInterface : " + Modifier.isInterface(modifiers));
        System.out.println("isNative : " + Modifier.isNative(modifiers));
        System.out.println("isFinal : " + Modifier.isFinal(modifiers));
        System.out.println("isPrivate : " + Modifier.isPrivate(modifiers));
        System.out.println("isProtected : " + Modifier.isProtected(modifiers));
        System.out.println("isPublic : " + Modifier.isPublic(modifiers));
        System.out.println("isStatic : " + Modifier.isStatic(modifiers));
        System.out.println("isStrict : " + Modifier.isStrict(modifiers));
        System.out.println("isSynchronized : " + Modifier.isSynchronized(modifiers));
        System.out.println("isTransient : " + Modifier.isTransient(modifiers));
        System.out.println("isVOlatile : " + Modifier.isVolatile(modifiers));
        System.out.println("superclass : " + personClass.getSuperclass());
        System.out.println("interface implemented : " + personClass.getInterfaces().length);
        System.out.println("cons : " + personClass.getConstructors().length);
        System.out.println("methods : " + personClass.getDeclaredMethods().length);

        for (Constructor constructor : personClass.getConstructors()) {
            System.out.println(constructor.getParameterCount());
            if (constructor.getParameterCount() == 0) {
                Person o = (Person) constructor.newInstance();
            }
            for (Class c : constructor.getParameterTypes()) {
                System.out.println(c.getName());
            }
        }
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType().getName());
        }

        Method method = personClass.getMethod("getName", null);
        System.out.println(method.invoke(new Person() {{
            setName("yahoo");
        }}, null));

        System.out.println("=================================");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field field : declaredFields) field.setAccessible(true);
        System.out.println(declaredFields[3].get(new Person()));
        System.out.println(Class.forName("[Ljava.lang.Integer;").getComponentType().getName()); //get array of string class "[I" for int array //comp is basic unit of array

    }
}
