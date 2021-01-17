package visibilities;

import visibilities.core.CoreApiKotlinA;

public class JavaVisibilities {
    public static void main(String[] args) {
        ApiJava apiJava = new ApiJava();
        apiJava.a();

        CoreApiJavaA coreApiJavaA = new CoreApiJavaA();
        coreApiJavaA.a();

        // "internal" is not effective in Java: even IDE treat it as an error, it can still be executed in Java
        // use @JvmName(name) to avoid this
        CoreApiKotlinA coreApiKotlinA = new CoreApiKotlinA();
//        coreApiKotlinA.%abcd();
    }
}
