package java8features.functionalInterface.methodReference.constructorMethodReference;

@FunctionalInterface
public interface Creator<T> {
    T create(String str);
}
