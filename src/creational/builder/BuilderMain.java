package creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        BuilderDesignPattern builderDesignPattern = BuilderDesignPattern.builder().name("hello").build();
        System.out.println(builderDesignPattern);
    }
}
