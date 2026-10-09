// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess



fun main(args: Array<String>) {
    if (args.size < 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    else {
        val a: Double = args[0].toDouble()
        val b: Double = args[1].toDouble()
        val c: Double = args[2].toDouble()
        val s: Double = 0.5*(a+b+c)
        val A: Double = kotlin.math.sqrt(s*(s-a)*(s-b)*(s-c))
        println("Area = %.5f".format(A))
    }
    exitProcess(0)
}