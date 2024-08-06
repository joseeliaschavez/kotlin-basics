package org.rangerforce.kotlin.basics

class CoffeeMaker {
    fun makeCoffee() {
        println("Making coffee.")
    }

    fun makeCoffeeWithSugar(sugarCount: Int) {
        val spoons = when (sugarCount) {
            0 -> "no sugar"
            1 -> "1 spoon of sugar"
            else -> "$sugarCount spoons of sugar"
        }
        println("Making coffee with $spoons.")
    }

    fun makeCoffeeForCustomer(customerName: String) {
        println("Making coffee for $customerName.")
    }
}

fun main() {
    val coffeeMaker = CoffeeMaker()
    coffeeMaker.makeCoffee()
    for (i in 0..2) {
        coffeeMaker.makeCoffeeWithSugar(i)
    }
    coffeeMaker.makeCoffeeForCustomer("Alice")
}