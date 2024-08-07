package org.rangerforce.kotlin.basics

/**
 * How to use lists in Kotlin
 */
class ComputerComponents {
    val fixedComponents = listOf("CPU", "RAM", "HDD", "SSD", "GPU", "PSU", "Motherboard")
    val customComponents = mutableListOf("CPU", "RAM", "HDD", "SSD", "GPU", "PSU", "Motherboard")

    fun listFixedComponents() {
        printList(fixedComponents)
    }

    fun listCustomComponents() {
        printList(customComponents)
    }

    private fun printList(list: List<String>) {
        val formattedString = list.joinToString(prefix = "[", postfix = "]")
        println(formattedString)
    }
}

fun main() {
    val computer = ComputerComponents()
    computer.listFixedComponents()
    computer.listCustomComponents()

    computer.customComponents.add("Cooling Fan")
    computer.listCustomComponents()

    computer.customComponents.remove("HDD")
    computer.listCustomComponents()

    computer.customComponents[0] = "AMD CPU"
    computer.customComponents[1] = "Kingston RAM"
    computer.customComponents[2] = "Western Digital SSD"
    computer.customComponents[3] = "Nvidia GPU"
    computer.customComponents[4] = "Corsair PSU"
    computer.customComponents[5] = "Asus Motherboard"
    computer.listCustomComponents()

    println("Printing custom components using for loop")
    for (component in computer.customComponents) {
        println(component)
    }

    println("Printing custom components using for loop with index")
    for (index in computer.customComponents.indices) {
        println("Index: $index, Component: ${computer.customComponents[index]}")
    }
}