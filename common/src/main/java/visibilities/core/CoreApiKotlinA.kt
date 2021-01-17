package visibilities.core


internal class CoreApiKotlinA {
    // make Java cannot access this function
    @JvmName("%abcd")
    fun a() {
        println("Hello A")
    }
}