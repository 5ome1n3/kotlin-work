// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
import kotlin.math.min
import kotlin.math.max

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(tri: Triangle): Boolean {
    // horrible one liner based on the fact that the 2 smaller sides
    // being greater than the longest validates triangle
    return min(tri.first, tri.second) + min(max(tri.first, tri.second), tri.third) > max(max(tri.first, tri.second), tri.third)
}
fun triangleArea(tri: Triangle): Double {
    // ctrl-c ctrlv + some ammendments
    val a: Double = tri.first
    val b: Double = tri.second
    val c: Double = tri.third
    val s: Double = 0.5*(a+b+c)
    val A: Double = kotlin.math.sqrt(s*(s-a)*(s-b)*(s-c))
    return A
}