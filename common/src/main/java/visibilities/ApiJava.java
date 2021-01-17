package visibilities;

public class ApiJava {
    // to make sure other classes cannot access class "CoreApiJavaA"
    // and "CoreApiJavaB", make them as "default visible class"
    private CoreApiJavaA coreApiJavaA = new CoreApiJavaA();
    private CoreApiJavaB coreApiJavaB = new CoreApiJavaB();

    public void a() { coreApiJavaA.a(); }
    public void b() { coreApiJavaB.b(); }
}
