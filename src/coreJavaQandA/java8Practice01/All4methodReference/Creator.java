package coreJavaQandA.java8Practice01.All4methodReference;

@FunctionalInterface
public interface Creator<T> {
    T create(String str);
}
