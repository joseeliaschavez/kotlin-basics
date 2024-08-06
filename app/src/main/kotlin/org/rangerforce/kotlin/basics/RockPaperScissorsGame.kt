package org.rangerforce.kotlin.basics

class RockPaperScissorsGame {
    fun playGame() {
        println("Rock, Paper, Scissors!")
        var playerChoice = askPlayerChoice()
        while (playerChoice != RockPaperScissors.EXIT) {
            if (playerChoice == RockPaperScissors.UNKNOWN) {
                println("Invalid choice. Please try again.")
                playerChoice = askPlayerChoice()
                continue
            }
            val agentChoice = RockPaperScissors.entries
                .toList()
                .slice(1..3)
                .toTypedArray()
                .random()
            val winner = getResult(playerChoice, agentChoice)
            println("$playerChoice vs $agentChoice; $winner")
            playerChoice = askPlayerChoice()
        }
        println("Exiting game...")
    }

    private fun askPlayerChoice(): RockPaperScissors {
        println("Enter your choice: ")
        println("1. Rock")
        println("2. Paper")
        println("3. Scissors")
        println("4. Exit")
        print("Enter your choice [1..4]: ")
        val playerInput = readlnOrNull()
        val playerChoice = translateChoice(playerInput ?: "0")
        return playerChoice
    }

    private fun translateChoice(inputValue: String) : RockPaperScissors {
        val inputByte = inputValue.toByte();
        return when (inputByte) {
            1.toByte() -> RockPaperScissors.ROCK
            2.toByte() -> RockPaperScissors.PAPER
            3.toByte() -> RockPaperScissors.SCISSORS
            4.toByte() -> RockPaperScissors.EXIT
            else -> RockPaperScissors.UNKNOWN
        }
    }

    private fun getResult(playerChoice: RockPaperScissors, agentChoice: RockPaperScissors): String {
        return when {
            playerChoice == agentChoice -> "Draw"
            playerChoice == RockPaperScissors.ROCK && agentChoice == RockPaperScissors.SCISSORS -> "Player wins"
            playerChoice == RockPaperScissors.PAPER && agentChoice == RockPaperScissors.ROCK -> "Player wins"
            playerChoice == RockPaperScissors.SCISSORS && agentChoice == RockPaperScissors.PAPER -> "Player wins"
            else -> "Agent wins"
        }
    }
}

fun main() {
    RockPaperScissorsGame().playGame()
}