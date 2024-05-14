package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {

    print("試行回数?: ")
    val count = readln().toInt()

    // 勝ち・負け・あいこ の数を数える変数を用意する
    var win = 0
    var lose = 0
    var draw = 0

    for (i in 0 ..<count) {
        val player = Random.nextInt(1 .. 3)
        print("1:グー 2:チョキ 3:パー を選んでください: ")

        val (result, judge) = when (Random.nextInt(0 ..<100)) {
            in 0..<10 ->{
              win++
              Pair(1, "勝ち")
            }
            in 10..<15 ->{
              draw++
              Pair(0, "あいこ")
            }
            else -> {
                lose++
                Pair(2, "負け")
            }
        }

        val cpu = (player + result) % 3
        println("cpu: ${cpu + 1} --- $judge")
    }
}