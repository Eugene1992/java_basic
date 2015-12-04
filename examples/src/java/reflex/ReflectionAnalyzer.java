package reflex;

import hw5.Test;
import oop3.BadPupil;
import queGen.QuestionGenerator;
import regex.RegexExample;

import java.awt.*;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionAnalyzer {

    public static void main(String[] args) throws IllegalAccessException {
        drawClassAnalyzer(new QuestionGenerator());
    }

    public static<T> void drawClassAnalyzer(T object) throws IllegalAccessException {
        Class aClass = object.getClass();
        StringBuilder drawClassBuilder = new StringBuilder();

        //find class modifiers
        int mods = aClass.getModifiers();
        if (Modifier.isPublic(mods)) {
            drawClassBuilder.append("public ");
        }
        if (Modifier.isPrivate(mods)) {
            drawClassBuilder.append("private ");
        }
        if (Modifier.isProtected(mods)) {
            drawClassBuilder.append("protected ");
        }
        if (Modifier.isStatic(mods)) {
            drawClassBuilder.append("static ");
        }
        if (Modifier.isFinal(mods)) {
            drawClassBuilder.append("final ");
        }
        if (Modifier.isAbstract(mods)) {
            drawClassBuilder.append(" abstract ");
        }
        if (Modifier.isStrict(mods)) {
            drawClassBuilder.append("strictfp ");
        }

        //add simple class name
        drawClassBuilder.append("class ").append(aClass.getSimpleName());

        //get superclass
        Class superclass = aClass.getSuperclass();
        String superClassSimpleName = superclass.getSimpleName();
        if (!superClassSimpleName.equals("Object")) {
            drawClassBuilder.append(" extends ").append(superclass.getSimpleName());
        }

        //get interfaces
        Class[] interfaces = aClass.getInterfaces();
        if (interfaces.length > 0) {
            drawClassBuilder.append(" implements ");
            for (int i = 0; i < interfaces.length; i++) {
                if (interfaces.length > 1 && i != interfaces.length - 1) {
                    drawClassBuilder.append(interfaces[i].getSimpleName()).append(", ");
                } else {
                    drawClassBuilder.append(interfaces[i].getSimpleName());
                }
            }
        }
        drawClassBuilder.append(" {\n");
        System.out.println(drawClassBuilder);

        //get all(including private) class fields
        Field[] publicFields = aClass.getDeclaredFields();
        for (Field field : publicFields) {
            StringBuilder fieldModsBuilder = new StringBuilder();
            //get field modifiers
            int fieldMods = field.getModifiers();
            if (Modifier.isPublic(fieldMods)) {
                fieldModsBuilder.append("\tpublic ");
            } else
            if (Modifier.isPrivate(fieldMods)) {
                fieldModsBuilder.append("\tprivate ");
            } else
            if (Modifier.isProtected(fieldMods)) {
                fieldModsBuilder.append("\tprotected ");
            } else fieldModsBuilder.append("\t");
            if (Modifier.isStatic(fieldMods)) {
                fieldModsBuilder.append("static ");
            }
            if (Modifier.isFinal(fieldMods)) {
                fieldModsBuilder.append("final ");
            }
            if (Modifier.isAbstract(fieldMods)) {
                fieldModsBuilder.append(" abstract ");
            }
            if (Modifier.isVolatile(fieldMods)) {
                fieldModsBuilder.append("volatile ");
            }
            //get field type simple name
            Class fieldType = field.getType();
            fieldModsBuilder.append(fieldType.getSimpleName()).append(" ");
            //get field values
            if (Modifier.isPrivate(fieldMods)) {
                field.setAccessible(true);
                fieldModsBuilder.append(field.getName()).append(" = ").append(field.get(object)).append(";");
            } else {
                fieldModsBuilder.append(field.getName()).append(" = ").append(field.get(object)).append(";");
            }
            System.out.println(fieldModsBuilder);
        }
        System.out.println();

        //get constructors
        Constructor[] constructors = aClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            StringBuilder constrModsBuilder = new StringBuilder();
            int constrMods = constructor.getModifiers();
            //get constructor modifiers
            if (Modifier.isPublic(constrMods)) {
                constrModsBuilder.append("\tpublic ");
            } else
            if (Modifier.isPrivate(constrMods)) {
                constrModsBuilder.append("\tprivate ");
            } else
            if (Modifier.isProtected(constrMods)) {
                constrModsBuilder.append("\tprotected ");
            } else constrModsBuilder.append("\t");
            constrModsBuilder.append(aClass.getSimpleName()).append("(");
            Class[] paramTypes = constructor.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (paramTypes.length > 1 && i != paramTypes.length - 1) {
                    constrModsBuilder.append(paramTypes[i].getSimpleName()).append(" ").append("param").append(", ");
                } else {
                    constrModsBuilder.append(paramTypes[i].getSimpleName()).append(" ").append("param");
                }
            }
            constrModsBuilder.append("){\n\t}");
            System.out.println(constrModsBuilder);
        }
        System.out.println();

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            StringBuilder methodModsBuilder = new StringBuilder();
            int methodMods = method.getModifiers();
            //get methods modifiers
            if (Modifier.isPublic(methodMods)) {
                methodModsBuilder.append("\tpublic ");
            } else
            if (Modifier.isPrivate(methodMods)) {
                methodModsBuilder.append("\tprivate ");
            } else
            if (Modifier.isProtected(methodMods)) {
                methodModsBuilder.append("\tprotected ");
            } else methodModsBuilder.append("\t");
            if (Modifier.isFinal(methodMods)) {
                methodModsBuilder.append("final ");
            }
            if (Modifier.isStatic(methodMods)) {
                methodModsBuilder.append("static ");
            }
            if (Modifier.isAbstract(methodMods)) {
                methodModsBuilder.append("abstract ");
            }
            if (Modifier.isStrict(methodMods)) {
                methodModsBuilder.append("strictfp ");
            }
            if (Modifier.isSynchronized(methodMods)) {
                methodModsBuilder.append("synchronized ");
            }
            if (Modifier.isNative(methodMods)) {
                methodModsBuilder.append("native ");
            }
            //get methods return value type
            if (method.getReturnType().getName() != null) {
                methodModsBuilder.append(method.getReturnType().getSimpleName()).append(" ");
            }
            methodModsBuilder.append(method.getName()).append("(");
            //get methods parameters
            Class[] methodParamTypes = method.getParameterTypes();
            for (int i = 0; i < methodParamTypes.length; i++) {
                if (methodParamTypes.length > 1 && i != methodParamTypes.length - 1) {
                    methodModsBuilder.append(methodParamTypes[i].getSimpleName()).append(" ").append("param").append(", ");
                } else {
                    methodModsBuilder.append(methodParamTypes[i].getSimpleName()).append(" ").append("param");
                }
            }
            methodModsBuilder.append("){\n\t}");
            System.out.println(methodModsBuilder);
        }
        System.out.println("}");
    }

    public static final class User extends RegexExample implements Serializable {
        private String name = "Eugene";
        String secondName;
        public static int age = 23;
        protected static volatile int ff = 23;

        private User(String secondName) {
            this.secondName = secondName;
        }

        public User() {
        }

        public final synchronized String makeNewString(Integer integer) {
            return null;
        }

        private static synchronized String makeNewIntegerString(Integer integer, String s) {
            return null;
        }
    }
}
