import java.util.Scanner

fun add(arr : IntArray):Int {
    var sum = 0
    for( s in arr) {
        sum = sum+s
    }
    return sum 
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val testCases = scan.nextInt()
    val arr = IntArray(testCases)
    for ( i in 0..(testCases-1)) {
        arr[i] = scan.nextInt()
    }
    val sum = add(arr)
    println(sum)
}

    
