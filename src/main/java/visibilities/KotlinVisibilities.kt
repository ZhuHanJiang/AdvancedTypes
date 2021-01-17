package visibilities



fun main() {
//    val coreApiKotlinA = CoreApiKotlinA()
    // another module cannot access
    val apiKotlin = ApiKotlin()
    apiKotlin.a()
}