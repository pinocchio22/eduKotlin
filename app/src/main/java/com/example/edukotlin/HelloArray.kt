package com.example.edukotlin

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2021-06-27
 * @desc
 */
class HelloArray {

}

fun main() {
    
    // 1. 배열
    var arr1 = listOf("1","2") // ArrayList <= 넣고 빼고 '수정' 가능
    var arr2 = mutableListOf("3","4")

    arr2.add("5")

    println(arr2)

    // 2. 반복문 (향상된 반복문)
    for((index, item) in arr1.withIndex()) { //withIndex는 인덱스 + 원소값이 필요할때 사용
        println("$index $item")
    }

    // 3. casting = < String, Int > 등을 담을 수 있는 object중 Any 객체의 타입을 찾는과정(Auto casting)
    var hello: Any = "hello"    // 타입은 Any 이지만 String
    if(hello is String) {
        println(hello.length)
    }


}