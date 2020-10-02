package machine
import java.util.*

// println("The coffee machine has: ")
// println("$water of water")
// println("$milk of milk")
// println("$beans of coffee beans")
// println("$discups of disposable cups")
// println("$money of money")
// println("")
fun main() {
    val scanner = Scanner(System.`in`)
    var water = 400
    var milk = 540
    var beans = 120
    var discups = 9
    var money = 550
    var ax = "inicio"
    while (ax != "exit") {
        println("Write action (buy, fill, take, remaining, exit): ")
        ax = scanner.next()
        when (ax) {
            "buy" -> {
                print("What do you want to buy?")
                println(" 1 - espresso, 2 - latte, 3 - cappuccino:")
                val prod = scanner.next().first()
                when (prod) {
                    '1' -> {
                        if (water >= 250) {
                            if (beans >= 16) {
                                if (discups >= 1) {
                                    water -= 250
                                    beans -= 16
                                    money += 4
                                    discups -= 1
                                    println("I have enough resources, making you a coffee!")
                                } else {
                                    println("Sorry, not enough disposable cups!")
                                }
                            } else {
                                println("Sorry, not enough coffee beans!")
                            }
                        } else {
                            println("Sorry, not enough water!")
                        }
                        println("")
                    }
                    '2' -> {
                        if (water >= 350) {
                            if (milk >= 75) {
                                if (beans >= 20) {
                                    if (discups >= 1) {
                                        water -= 350
                                        milk -= 75
                                        beans -= 20
                                        money += 7
                                        discups -= 1
                                        println("I have enough resources, making you a coffee!")
                                    } else {
                                        println("Sorry, not enough disposable cups!")
                                    }
                                } else {
                                    println("Sorry, not enough coffee beans!")
                                }
                            } else {
                                println("Sorry, not enough milk!")
                            }
                        } else {
                            println("Sorry, not enough water!")
                        }
                        println("")
                    }
                    '3' -> {

                        if (water >= 200) {
                            if (milk >= 100) {
                                if (beans >= 12) {
                                    if (discups >= 1) {
                                        water -= 200
                                        milk -= 100
                                        beans -= 12
                                        money += 6
                                        discups -= 1
                                        println("I have enough resources, making you a coffee!")
                                    } else {
                                        println("Sorry, not enough disposable cups!")
                                    }
                                } else {
                                    println("Sorry, not enough coffee beans!")
                                }
                            } else {
                                println("Sorry, not enough milk!")
                            }
                        } else {
                            println("Sorry, not enough water!")
                        }
                        println("")
                    }
                    else -> println("")
                }
            }
            "fill" -> {
                println("Write how many ml of water do you want to add:")
                val wafill = scanner.nextInt()
                water += wafill
                println("Write how many ml of milk do you want to add:")
                val milkfill = scanner.nextInt()
                milk += milkfill
                println("Write how many grams of coffee beans do you want to add:")
                val beansfill = scanner.nextInt()
                beans += beansfill
                println("Write how many disposable cups do you want to add:")
                val dcupsfill = scanner.nextInt()
                discups += dcupsfill
                println("")
            }
            "take" -> {
                println("I gave you $${money}")
                money = 0
                println("")
            }
            "remaining" -> {
                println("The coffee machine has: ")
                println("$water of water")
                println("$milk of milk")
                println("$beans of coffee beans")
                println("$discups of disposable cups")
                println("$money of money")
                println("")
            }

        }

    }



}

