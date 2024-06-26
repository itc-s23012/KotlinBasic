package org.example

import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    print("1:グー 2:チョキ 3:パー を選んでください: ")
    // 入力は1,2,3 ですが、0,1,2 となるよう工夫してください
    val player = readln().toInt() - 1
    // CPUの手をランダムで決める
//    val cpu = Random.nextInt(0, 3) // 0,1,2のどれかになる

    // 勝敗判定
//    val playerchoice = when (player){
//        0 -> "グー"
//        1 -> "チョキ"
//        2 -> "パー"
//        else -> "エラー"
//    }
//    println("player選択: $playerchoice")
//
//    val cpuchoice = when (cpu) {
//        0 -> "グー"
//        1 -> "チョキ"
//        2 -> "パー"
//        else -> "エラー"
//    }
//    println("cpu選択: $cpuchoice")
//
//    val result = when {
//        player == cpu -> "あいこ"
//        player == 0 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 0 -> "勝ち"
//        else -> "負け"
//    }
//    println(result)
//    // 勝敗の結果表示(プレイヤー視点)
//    // 勝ち
//    // 負け
//    // あいこ
//
//    val diff = (player - cpu + 3) % 3
//    val judge = when (diff) {
//        0 -> "あいこ"
//        1 -> "まけ"
//        2 -> "勝ち"
//        else -> "?"
//    }
//
//    println("CPU: ${cpu + 1} --- $judge")

    val cpu = Random.nextInt(0, 3) // 0,1,2 のどれかになる

    // 勝敗判定
    // 方法1
    /*
    val judge = when {
        player == 0 && cpu == 0 -> "あいこ"
        player == 0 && cpu == 1 -> "かち"
        player == 0 && cpu == 2 -> "まけ"
        player == 1 && cpu == 0 -> "まけ"
        player == 1 && cpu == 1 -> "あいこ"
        player == 1 && cpu == 2 -> "かち"
        player == 2 && cpu == 0 -> "かち"
        player == 2 && cpu == 1 -> "まけ"
        player == 2 && cpu == 2 -> "あいこ"
        else -> "?"
    }
   */
    // 方法2
    /*
    val judge = when {
        player == cpu
        -> "あいこ"

        player == 0 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 0
        -> "かち"

        player == 0 && cpu == 2 || player == 1 && cpu == 0 || player == 2 && cpu == 1
        -> "まけ"

        else -> "?"
    }
    */
    // 方法3
    val diff = (player - cpu + 3) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "まけ"
        2 -> "かち"
        else -> "?"
    }

    // 勝敗の結果表示(プレイヤー視点)
    println("CPU: ${cpu + 1} --- $judge")
}