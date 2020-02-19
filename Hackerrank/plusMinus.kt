import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


fun plusMinus(arr: Array<Int>): Unit {
    var countPos : Double  = 0.0
    var countNeg : Double  = 0.0
    var countZero : Double  = 0.0
    for ( a in arr) {
        if (a < 0) {
            countNeg++
        }
        if (a > 0) {
            countPos++
        }
        if (a == 0) {
            countZero++
        }    
    }
    val size = arr.size
    val pos = countPos/size
    val neg = countNeg/size
    val zero = countZero/size

    println(pos)
    println(neg)
    println(zero)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}


