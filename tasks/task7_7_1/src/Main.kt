// Task 7.7.1: program to compute stats for a numeric dataset


fun main(args: Array<String>) {
    println(args)
    var arr = readData(args[0])
    println("median is: ${median(arr)}")
    println("avg is: ${arr.sum()/arr.size}")
}
