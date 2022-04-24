fun main() {
//    [] [] [] [] [] [] [] []
    var intArr: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // intArr[1] = 2
    var boolArr: Array<Boolean> = arrayOf(true, false, true) // boolArr[2] = true
    var stringArr: Array<String> = arrayOf("Hello", "World", "Royal") // stringArr[0] = Hello
    var stringArr2 = arrayOf("Hello world!", "Who am i?") // simpler form

    println(intArr[5]) // 6
    println(boolArr[0]) // true
    println(stringArr[1]) // World

//    or println(stringArr.get(1)) == 10 line

    stringArr2[0] = "I'm a programmer!"
    println(stringArr2[0]) // Hello world -> I'm a programmer

//    or stringArr2.set(0, "I'm a programmer!") == 14 line

    println(intArr.size) // 10 []

    for (i in stringArr) {
        println(i)
    }

    stringArr.forEach { i ->
        println(i)
    }

    intArr.forEach { // it - default value
        if (it <= 5) println("$it <= 5")
        else println("$it > 5")
    }

    stringArr.forEachIndexed { index, element ->
        println("$element has index [$index]")
    }
}