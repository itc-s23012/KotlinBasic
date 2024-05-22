package com.exapmle.chap28

import com.exapmle.chap27.Car
import com.exapmle.chap27.Car5

fun main(args: Array<String>) {
    run {
        println("----28.4----")
        val car = Ferrari("赤")
        car.drive(100.0)
    }
    run {
        println("----28.6----")
        val car = Prius("グレー")
        car.drive(500.0)
    }
}

class Ferrari(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のフェラーリが走っています!ブウオオオ−ン")
        println("おおっ、かっこいい!!!")
        println("マイレージは ${distance}キロになったぜい!")
    }
}

class Prius(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っています!スイーン!")
        println("すごい静かですね!")
        println("マイレージは ${distance}キロです。")
        println("トヨタの車はいっぱい走ってもなかなか故障しません!")
    }
}