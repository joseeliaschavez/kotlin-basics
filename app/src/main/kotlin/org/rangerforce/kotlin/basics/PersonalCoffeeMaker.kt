package org.rangerforce.kotlin.basics

/**
 * How to use a data class
 */
data class Coffee(val forCustomer: String, val sugarCount: Int)

class PersonalCoffeeMaker(private val coffee: Coffee) {
    fun makeCoffee() {
        val spoons = when (coffee.sugarCount) {
            0 -> "no sugar"
            1 -> "1 spoon of sugar"
            else -> "${coffee.sugarCount} spoons of sugar"
        }
        println("Making personal coffee with $spoons for ${coffee.forCustomer}.")
    }
}

fun main() {
    val bobsCoffee = PersonalCoffeeMaker(Coffee("Bob", 2))
    bobsCoffee.makeCoffee()
    for (i in 0..2) {
        val someCoffee = PersonalCoffeeMaker(Coffee("Dan", i))
        someCoffee.makeCoffee()
    }
    val aliceCoffee = PersonalCoffeeMaker(Coffee("Alice", 2))
    aliceCoffee.makeCoffee()
}