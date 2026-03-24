package com.example.mdi2_101_fp

//Class
class Student(
    val name: String,
    val age: Int,
    val isActive: Boolean
)

//Classes with functions
class User(
    val username: String,
    val verified: Boolean
) {
    fun showProfile(){
        println("Username: $username" )
        println("Verified: $verified" )
    }
}

//Challenge 4
class Book(
    val title: String,
    val author: String,
    val year: Int
) {
    fun showBook(){
        println("Book's title: $title")
        println("Book's author: $author")
        println("Year of publication: $year")
    }
}

fun main(){
    //Challenge 1
    println("----CHALLENGE 1----")
    val amount = 1400.00f
    val percentage = 15.00f
    val result = calculateDiscount(amount,percentage)
    println("The final price of $amount with a discount of $percentage% is $result")

    println("\n----Lambda functions----")
    //Lambda example
    val sayHi = { println("Hi!") }
    sayHi()

    //Example 2
    val greet = { name: String -> println("Hello, $name") }
    greet("Eduardo")

    //Example 3
    val multiply = { a:Int, b:Int -> a*b }
    println(multiply(3,7))

    //Challenge 2
    println("\n----CHALLENGE 2----")
    // Lambda function to print welcome
    val welcome = { println("Welcome") }
    welcome()

    //Lambda function to print a city name
    val printCity = { cityName:String -> println("The city is $cityName") }
    printCity("Tecate")

    //Lambda function to add 2 integers
    val addNumbers = { a:Int, b:Int -> a+b }
    println(addNumbers(5,7))

    //Challenge 3
    println("\n----CHALLENGE 3----")
    val isEven = { a:Int -> print("The number $a is "); if(a%2==0) println("even") else println("not even")}
    isEven(3)

    println("\n----Classes and objects----")
    //Object (Student class)
    val student1 = Student("Eduardo",21,true)
    println(student1.name)
    println(student1.age)
    println(student1.isActive)

    //Another object (User class)
    val user1 = User("ed",true)
    user1.showProfile()

    //Challenge 4
    println("\n----CHALLENGE 4----")
    val book1 = Book("Cuando vi a la muerte prestar su sombrero","Rodrigo Unda",2025)
    book1.showBook()

    println("\n----Nullability----")
    //Nullability
    var middleName: String? = null
    println(middleName)

    // Safe call operator
    var nickname1: String? = "ChrisUBS"
    println(nickname1?.length)

    // Elvis operator
    val displayName = nickname1 ?: "No nickname"
    println(displayName)

    //Challenge 5
    println("\n----CHALLENGE 5----")
    val middleName2: String? = "Eduardo"
    val gpa: Double? = null

    println(middleName2?:"No middle name provided")
    println(gpa?:"No GPA available")
}

//Challenge 1
fun calculateDiscount(amount:Float, percentage:Float):Float {
    return amount-(amount*(percentage/100))
}