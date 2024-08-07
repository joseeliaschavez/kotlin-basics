package org.rangerforce.kotlin.basics

/**
 * How to use a data class
 */
data class Coffee(val forCustomer: String, val sugarCount: Int)

fun makeCoffee(coffee: Coffee) {
    val spoons = when (coffee.sugarCount) {
        0 -> "no sugar"
        1 -> "1 spoon of sugar"
        else -> "${coffee.sugarCount} spoons of sugar"
    }
    println("Making personal coffee with $spoons for ${coffee.forCustomer}.")
}

fun main() {
    makeCoffee(Coffee("Bob", 2))
    for (i in 0..2) {
        makeCoffee(Coffee("Dan", i))
    }
    makeCoffee(Coffee("Alice", 2))
}