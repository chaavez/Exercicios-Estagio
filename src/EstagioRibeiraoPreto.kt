
fun main() {
    sumValue()
    sequenceFibonacci(1, 2)
    logicOfNumbers(50)
}

//Questão 1

fun sumValue() {
    println("-------------------------------------------")
    println("Questão 1")
    val index = 13
    var sum = 0
    var k = 0

    while (k < index) {
        k += 1
        sum += k
    }
    println("Valor da soma é: $sum.")
    println("-------------------------------------------")
}

//Questão 2

fun sequenceFibonacci(numberOne: Int, numberTwo: Int) {
    println("Questão 2")

    val count = 10
    var nextNumber: Int
    var firstNumber = numberOne
    var secondNumber = numberTwo
    print("$firstNumber, $secondNumber")

    for(i in 0..< count) {
        nextNumber = firstNumber + secondNumber
        print(", $nextNumber")
        firstNumber = secondNumber
        secondNumber = nextNumber
    }

    println()
    println("-------------------------------------------")
}

/*3) Descubra a lógica e complete o próximo elemento:

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

f) 2,10, 12, 16, 17, 18, 19, ____*/

//Questão 3

fun logicOfNumbers(numbers: Int) {
    println("Questão 3-A")

    for (number in 0 .. numbers) {
        if(number % 2 == 1) {
            print("$number ")
        }
    }
    println()
    println("-------------------------------------------")
    println("Questão 3-B")

    var currentNumber = 0

    while (currentNumber <= numbers) {
        print("$currentNumber ")
        currentNumber *= 2
        if (currentNumber == 0) {
            currentNumber = 2
        }
    }
    println()
    println("-------------------------------------------")
    println("Questão 3-C")


    println("-------------------------------------------")
    println("Questão 3-D")


    println("-------------------------------------------")
    println("Questão 3-E")

    val count = 10
    var nextNumber: Int
    var firstNumber = 0
    var secondNumber = 1
    print("$firstNumber, $secondNumber")

    for(i in 0..< count) {
        nextNumber = firstNumber + secondNumber
        print(", $nextNumber")
        firstNumber = secondNumber
        secondNumber = nextNumber
    }

    println()
    println("-------------------------------------------")
    println("Questão 3-F")


    println("-------------------------------------------")

}

//Questão 4

