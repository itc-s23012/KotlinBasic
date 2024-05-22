package com.exapmle.chap29

import com.exapmle.chap28.Ferrari
import com.exapmle.chap28.Prius

fun main(args: Array<String>) {
    run {
        println("----29.3----")
        val car1 = Ferrari("赤")
        val car2 = Prius("グレー")
        driveByFerrari(car1)
        driveByPrius(car2)
    }
}

fun driveByCar(car: Car) {
    car.drive(100.0)
}

fun driveByFerrari(car: Ferrari){
    car.drive(100.0)
}

fun driveByPrius(car: Prius) {
    car.drive(100.0)
}

open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています!ブウオオオーン!")
        println("すごい静かですね!")
        println("マイレージは ${distance}キロです。")
    }
}

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のフェラーリが走っています!ブウオオオーン!")
        println("おおっ、かっこいい!!!")
        println("マイレージは ${distance}キロになったぜい!")
    }
}

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っています!スイーン!")
        println("すごい静かですね!")
        println("マイレージは ${distance}キロです。トヨタの車はいっぱい走ってもなかなか故障しません!")
    }
}