package org.example

fun main(args: Array<String>) {
    val num = 100
    val a: Boolean = (num == 100)
    val b: Boolean = (num == 125)
    println("変数 a の値は ${a} です。")
    println("変数 b の値は ${b} です。")
    val num61 = 5
    val num62 = 10
    val a6 = (num61 < num62)
    val b6 = (num61 > num62)
    println("num61は、num62より小さい:$a6")
    println("num61は、num62より大きい:$b6")


    val num3 = 8
    val num4 = 8
    val c = (num3 <= num4)
    val d = (num3 >= num4)
    println("num3が num4以下である : $c")
    println("num3が num4以上である : $d")
}