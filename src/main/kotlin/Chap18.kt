package org.example

import kotlin.time.measureTime

fun main(args: Array<String>) {
   run {
        val s: Set<String> = setOf("あ", "い", "う", "え", "お")
        println(s)
    }

    run {
        println("----18.2----")
        val s: MutableSet<String> = mutableSetOf("あ", "い", "う", "え", "お")
        s += "か"
        s += "き"
        s += "く"
        s += "い"
        s += "お"
        s += "か"
        println(s)
    }

    val charlist = 'a' .. 'z'
    val searchCharList = mutableListOf('z', 'x', 'c', 'v', 'b', 'n', 'm')
    val serchCharset = mutableSetOf('z', 'x', 'c', 'v', 'b', 'n', 'm')
    val count = 1_000_000_000L
    val listTime = measureTime {
        for (i in 0 ..<count){
            val target = charlist.shuffled()[0]
            println(" 「${target}」は存在する？ : ${target in searchCharList}")
        }
    }
    val setTime = measureTime {
        for (i in 0 ..<count) {
            val target = charlist.shuffled()[0]
            println(" 「${target}」は存在する？ : ${target in searchCharList}")
        }
    }

    println("Listでかかった時間: $listTime")
    println(" Setデカかった時間: $setTime")
}