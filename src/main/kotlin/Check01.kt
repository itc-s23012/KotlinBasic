package org.example

fun main(args: Array<String>) {
    val score = readln().toInt()
//    val han = if (score in 0 .. 59){
//        println("D")
//    } else if (score in 60 .. 69){
//        println("C")
//    } else if (score in 70 .. 79){
//        println("B")
//    } else if (score in 80 .. 89){
//        println("A")
//    } else if (score in 90 .. 100){
//        println("S")
//    } else{
//        println("エラー")
//    }

    val rank2 = when {
        (score in 0 .. 59) -> "D"
        (score in 60 .. 69) -> "C"
        (score in 70 .. 79) -> "B"
        (score in 80 .. 89) -> "A"
        (score in 90 .. 100) -> "S"
        else -> "エラー"
    }
    println(rank2)

//    if (score < 0 || score > 100) {
//        println("エラー")
//    } else if (score < 60) {
//        println("D")
//    } else if (score < 70) {
//        println("C")
//    } else if (score < 80) {
//        println("B")
//    } else if (score < 90){
//        println("A")
//    }else{
//        println("S")
//    }

    //成績判定
    //0 ~ 59 は D
    //60 ~ 69 は C
    //70 ~ 79 は B
    //80 ~ 89 は A
    //90 ~ 100 は S
    //それ以外は「エラー」と出力
}