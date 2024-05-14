package org.example

import kotlin.random.Random

fun main(args: Array<String>) {

    print("1:グー 2:チョキ 3:パー を選んでください: ")
    val player = readln().toInt() - 1

    val result = when (Random.nextInt(0, 100)){
        in 0 ..<10 -> 2
        in 10 ..<15 -> 0
        else -> 2
    }

    val cpu = (player + result) % 3

    val judge = when(result) {
        0 -> "あいこ"
        1 -> "勝ち"
        else -> "負け"
    }

    println("cpu: ${cpu + 1} --- $judge")
}