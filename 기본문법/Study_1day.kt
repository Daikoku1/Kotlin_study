// Kotlin 스터디
// 1 day : Basic syntax
// https://kotlinlang.org/docs/home.html

fun main() {
    // print : ()안의 값 출력
    // println : ()안의 값 출력 + 줄 바꿈
    print("Hello ")
    print("world!")
    // >> Hello world!
    println("Hello ")
    println("world!")
    // >> Hello
    // >> world!
}
// 입력, 출력 타입 지정
fun sum1(a: Int, b: Int): Int {
    return a + b
}
// 함수를 표현식으로 사용할 수 있음.
// 출력값 타입은 유추됨
fun sum2(a: Int, b: Int) = a + b

// Unit 타입은 의미있는 값을 리턴하지 않음
// 생략가능
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

// val : 변경불가능한 값 == 상수(value)
// var : 변경가능한 값 == 변수(variable)
fun variables() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")
    var x = 5 // `Int` type is inferred
    x += 1
    println(x)
}

// Creating classes and instances
// 클래스의 속성은 선언 또는 나열될 수 있음
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}
/* The comment starts here
/* contains a nested comment *⁠/
and ends here. */
