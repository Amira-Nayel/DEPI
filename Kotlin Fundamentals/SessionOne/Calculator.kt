fun main(args: Array<String>){
    var stop :Boolean = true
    fun readNumbers():Double?{
        return try {
            readln()!!.toDouble()
        } catch (e: NumberFormatException) {
            stop = false
            return null
        }
    }
    fun readTxt():String?{
        return try {
            readln()
        } catch (error : NullPointerException) {
            println("Invalid input.")
            stop = false
            return null
        }
    }
loop@ do {
    print("Enter the first number: ")
    var firstNumb = readNumbers()
    print("\nEnter the second number: ")
    var secondNumb = readNumbers()
    println("Enter an operator: (  +  -  /  *  %  )" )
    var operator = readTxt()
//check input type and value
    if (firstNumb != null && secondNumb != null) {
        if (firstNumb.toInt().toDouble() == firstNumb) {
            firstNumb.toInt()
        }
        if (secondNumb.toInt().toDouble() == secondNumb){
            secondNumb.toInt()
        }
    }
    else if(operator == null || operator !in listOf("+", "-", "/", "*", "%")){
        println("You did not enter a valid operator!")
        stop = false
        continue
    }
    else{
        println("You have missed one of the two numbers or both of them!")
        stop = false
        continue
    }
//call suitable function
     when(operator){
        "+" -> summation (firstNumb,secondNumb)
        "-" -> subtract (firstNumb,secondNumb)
        "*" -> multiplication (firstNumb,secondNumb)
        "/" -> divided (firstNumb,secondNumb)
        "%" -> reminderM (firstNumb,secondNumb)
        else -> {
            println("Not an Operator! \n")
            stop = false
            continue@loop
        }
    }
    println("Do you want to make another calculation? (y/n)")
    var answer = readTxt()?.getOrNull(0)

    if (answer == null || answer.equals('n', ignoreCase = true)) {
        stop = true
    }
    else{
        stop=false
    }
}
while (!stop)
}

fun summation (numb1 : Int , numb2 : Int) {
    println("The summation = ${numb1+numb2}")
}
fun summation (numb1 : Double , numb2 : Double) {
    println("The summation = ${numb1+numb2}")
}
fun summation (numb1 : Double , numb2 : Int) {
    println("The summation = ${numb1+numb2}")
}
fun summation (numb1 : Int , numb2 : Double) {
    println("The summation = ${numb1+numb2}")
}
fun subtract (numb1 : Int , numb2 : Int) {
    println("The subtraction = ${numb1-numb2}")
}
fun subtract (numb1 : Double , numb2 : Double) {
    println("The subtraction = ${numb1-numb2}")
}
fun subtract (numb1 : Double , numb2 : Int) {
    println("The subtraction = ${numb1-numb2}")
}
fun subtract (numb1 : Int , numb2 : Double) {
    println("The subtraction = ${numb1-numb2}")
}
fun divided (numb1 : Int , numb2 : Int) {
    if (numb2==0){println("Error! Cannot divide by zero")
    } else {
        println("The division = ${numb1 / numb2}")
    }
}
fun divided (numb1 : Double , numb2 : Double) {
    if (numb2==0.0){println("Error! Cannot divide by zero")
    } else {
        println("The division = ${numb1 / numb2}")
    }
}
fun divided (numb1 : Int , numb2 : Double) {
    if (numb2==0.0){println("Error! Cannot divide by zero")
    } else println("The division = ${numb1/numb2}")
}
fun divided (numb1 : Double , numb2 : Int) {
    if (numb2==0){println("Error! Cannot divide by zero")
    } else println("The division = ${numb1/numb2}")
}
fun multiplication (numb1 : Int , numb2 : Int) {
    println("The multiplication = ${numb1*numb2}")
}
fun multiplication (numb1 : Double , numb2 : Double) {
    println("The multiplication = ${numb1*numb2}")
}
fun multiplication (numb1 : Double , numb2 : Int) {
    println("The multiplication = ${numb1*numb2}")
}
fun multiplication (numb1 : Int , numb2 : Double) {
    println("The multiplication = ${numb1*numb2}")
}
fun reminderM (numb1 : Int , numb2 : Int) {
    if (numb2==0){println("Error! Cannot divide by zero")
    } else {
        println("The reminder = ${numb1 % numb2}")
    }
}
fun reminderM (numb1 : Double , numb2 : Double) {
    if (numb2==0.0){println("Error! Cannot divide by zero")
    } else {
        println("The reminder = ${numb1 % numb2}")
    }
}
fun reminderM (numb1 : Double , numb2 : Int) {
    if (numb2==0){println("Error! Cannot divide by zero")
    } else {
        println("The reminder = ${numb1 % numb2}")
    }
}
fun reminderM (numb1 : Int , numb2 : Double) {
    if (numb2==0.0){println("Error! Cannot divide by zero")
    } else {
        println("The reminder = ${numb1 % numb2}")
    }
}