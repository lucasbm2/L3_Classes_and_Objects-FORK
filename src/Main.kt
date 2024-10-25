fun main(args:Array<String>){
    //exercise1()
    //exercise2()
    //exercise3()
    //exercise4()
    //exercise5()
    exercise6()
}
fun exercise1(){
    val person1 = Person("Kevin",18)
    person1.showInfo()
}
fun exercise2(){
    val car1 = Car("Toyota")
    val car2 = Car("Toyota",180)
    car1.showInfo()
    car2.showInfo()

}
fun exercise3(){
    val product1 = Product("Smartphone")

}
fun exercise4(){
    val rectangle1 = Rectangle(2,4)
    println("The area of rectangle is: ${rectangle1.area}")
}
fun exercise5(){
    val account = BankAccount()
    account.balance = 1000.0
    println("Balance: ${account.balance}")

    account.balance = -5000.0
    println("Balance: ${account.balance}")
}
fun exercise6(){
    val student1 = Student("Alice", 20)
    val student2 = Student("Bob", 22, 105)

    println("Student 1: Name = ${student1.name}, Age = ${student1.age}, Grade = ${student1.grade}")
    println("Student 2: Name = ${student2.name}, Age = ${student2.age}, Grade = ${student2.grade}")
}