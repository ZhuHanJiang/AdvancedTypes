package visibilities

import visibilities.core.CoreApiKotlinA
import visibilities.core.CoreApiKotlinB

class ApiKotlin {
    // make two classes cannot be accessed outside
    // set them as "internal visible class"
    private val coreApiKotlinA = CoreApiKotlinA()
    private val coreApiKotlinB = CoreApiKotlinB()

    fun a() {
        coreApiKotlinA.a()
    }

    fun b() {
        coreApiKotlinB.b()
    }
}