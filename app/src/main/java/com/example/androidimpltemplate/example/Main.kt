package com.example.androidimpltemplate.example

fun main(){
    val userOne = UserJava(
        "name1",
        "designation1"
    )

    val userOneCopy = userOne.copy("","")

    val userOneHandCopy = UserJava(
        "name1",
        "designation1"
    )

    val userTwo = UserJava(
        "name2",
        "designation1"
    )

    println("userOne.equals(userOneHandCopy) => "+ userOne.equals(userOneHandCopy))
    println("userOne.equals(userOneCopy) => "+ userOne.equals(userOneCopy))
    println("userTwo.equals(userOneHandCopy) => "+ userTwo.equals(userOneHandCopy))
    println("userOne.toString() => "+ userOne.toString())
    println("userOne.component1() => "+ userOne.component1())
    println("userOne.hashCode() => "+ userOne.hashCode())

    val userKotlinOne = UserKotlin(
        "name1",
        "designation1"
    )

    val userKotlinOneCopy = userKotlinOne.copy("","")

    val userKotlinOneHandCopy = UserKotlin(
        "name1",
        "designation1"
    )

    val userKotlinTwo = UserKotlin(
        "name2",
        "designation1"
    )

    println("userKotlinOne.equals(userOneHandCopy) => "+ userKotlinOne.equals(userKotlinOneCopy))
    println("userKotlinOne.equals(userOneCopy) => "+ userKotlinOne.equals(userKotlinOneCopy))
    println("userKotlinTwo.equals(userOneHandCopy) => "+ userKotlinTwo.equals(userKotlinOneHandCopy))
    println("userKotlinOne.toString() => "+ userKotlinOne.toString())
    println("userKotlinOne.component1() => "+ userKotlinOne.component1())
    println("userKotlinOne.hashCode() => "+ userKotlinOne.hashCode())


}