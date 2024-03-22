import kotlin.math.pow

fun main() {
    sumValue()
    sequenceFibonacci(1, 2)
    logicOfNumbers(50)
    switchRoom(true, false)
    reverseString("Anderson Chaves")
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

    for (i in 0..<count) {
        nextNumber = firstNumber + secondNumber
        print(", $nextNumber")
        firstNumber = secondNumber
        secondNumber = nextNumber
    }

    println()
    println("-------------------------------------------")
}

//Questão 3

fun logicOfNumbers(numbers: Int) {
    println("Questão 3-A")

    for (number in 0..numbers) {
        if (number % 2 == 1) {
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

    var resultNumber = 0
    var increment = 1
    while (resultNumber < numbers) {
        print("$resultNumber, ")
        resultNumber += increment
        increment += 2
    }

    println()
    println("-------------------------------------------")
    println("Questão 3-D")

    val baseNumber = 2.0
    var exponentiation = 2.0
    var countNumber = 0

    while (countNumber < 4) {
        val result = baseNumber.pow(exponentiation)
        exponentiation *= 2
        print("$result ")
        countNumber++
    }

    println()
    println("-------------------------------------------")
    println("Questão 3-E")

    val count = 10
    var nextNumber: Int
    var firstNumber = 0
    var secondNumber = 1
    print("$firstNumber, $secondNumber")

    for (i in 0..<count) {
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

fun switchRoom(switchOne: Boolean, switchTwo: Boolean) {
    println("Questão 4")

    val firstSwitch = switchOne
    val secondSwitch = switchTwo
    val lampOne: Boolean
    val lampTwo: Boolean
    val lampThree: Boolean

    if (firstSwitch) {
        lampOne = true
        lampTwo = false
        lampThree = false
    } else if (secondSwitch) {
        lampOne = false
        lampTwo = true
        lampThree = false
    } else {
        lampOne = false
        lampTwo = false
        lampThree = true
    }

    print("Lâmpada Um: $lampOne, Lâmpada Dois: $lampTwo, Lâmpada Três: $lampThree")

    println()
    println("-------------------------------------------")
}

//Questão 5

fun reverseString(text: String) {
    println("Questão 5")

    var reversedString = ""

    for (i in text.length - 1 downTo 0) {
        reversedString += text[i]
    }

    print("$text ao contrário é: $reversedString")

    println()
    println("-------------------------------------------")
}