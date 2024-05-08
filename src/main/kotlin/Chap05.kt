package org.example

fun main(args: Array<String>) {
//    val a: Char = 'えい'
//    val b: Char = 'びい'
//    val c: Char = 'しい'
//    println(a)
//    println(b)
//    println(c)
//    val message: String = "こんにちは、\n世界!"
//    val a = "こんにちは、"
//    val b = "世界!"
//    val message = a + b
//    val world = "世界!"
//    val message = "こんにちは、${world}"
    val h: Int = 9
    val m: Int = 3425
    val message = "本日働いた時間は、${h}hours"
    val t: Int = 8
    val message1 = "本日働いた時間は、${t}hours"
    val message2 = "このペースで1ヶ月毎日働くと、${t*30}hours の労働になります。"
    val message3 = "このペースで1年間毎日働くと、${t*365}hours の労働になります。"
    val message4 = "1ヶ月だと、${m*t*30}円"
    val message5 = "1年間だと、${m*t*365}円"
    val message12 = """
          |こんにちは、世界!
          |私は Kotlinに関して勉強しています。
          |Kotlinでは、とても簡潔なプログラミングを書くことができます。
          |皆さん、一緒に楽しくプログラミングしましょう!
          """.trimMargin()
    val message13 = """
        こんにちは、世界!
          私は Kotlinに関して勉強しています。
          Kotlinでは、とても簡潔なプログラミングを書くことができます。
          皆さん、一緒に楽しくプログラミングしましょう!
          """.trimIndent()
    println(message)
    println(message1)
    println(message2)
    println(message3)
    println(message4)
    println(message5)
    println(message12)
    println(message13)
}
