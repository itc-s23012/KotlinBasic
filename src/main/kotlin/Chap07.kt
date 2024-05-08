package org.example

fun main(args: Array<String>) {
    val delicious = true
    val cheap = false
    val letsEat = (delicious && cheap)
    println("食事する?:$letsEat")
    println("このレストランはおいしい:${delicious}")
    println("このレストランは安い:${cheap}")

    val delicious2 = false
    val cheap2 = true
    val letsEat2 = delicious2 && cheap2
    println("食事する?:$letsEat2")
    val delicious3 = false
    val cheap3 = true
    val letsEat3 = delicious3 && cheap3
    println("食事する?:$letsEat3")
    val delicious4 = false
    val cheap4 = false
    val letsEat4 = delicious4 && cheap4
    println("食事する?:$letsEat4")
    println("---7.6---")
    val delicious5 = true
    val cheap5 = false
    val letsEat5 = (delicious5 || cheap5)
    println("食事する?:$letsEat5")
    println("このレストランはおいしい:${delicious5}")
    println("このレストランは安い:${cheap5}")

    val delicious6 = false
    val cheap6 = true
    val letsEat6 = delicious6 || cheap6
    println("食事する?:$letsEat6")
    val delicious7 = false
    val cheap7 = true
    val letsEat7 = delicious7 || cheap7
    println("食事する?:$letsEat7")
    val delicious8 = false
    val cheap8 = false
    val letsEat8 = delicious8 || cheap8
    println("食事する?:$letsEat8")
    println("---7.10---")
    val x10 = 75
    val a10 = (x10 >= 50 && x10 <= 100)
    val b10 = (x10 < 50 || x10 > 100)
    println("変数 x10 が50から100の範囲内にある:$a10")
    println("変数 x10 が50から100の範囲外にある:$b10")
    println("---7.12---")
    val a12 = true
    val b12 = !a12
    val c12 = !b12
    println("a12 の値は $a12 です。")
    println("b12 の値は $b12 です。")
    println("c12 の値は $c12 です。")
}