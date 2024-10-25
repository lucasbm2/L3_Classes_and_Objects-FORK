class Student(val name: String, val age: Int) {
    var grade: Int = 0
        set(value) {
            if (value in 0..100) {
                field = value
            } else {
                field = 0
                println("Invalid grade. Setting to 0.")
            }
        }

    init {
        println("Student $name has been created.")
    }

    constructor(name: String, age: Int, grade: Int) : this(name, age) {
        this.grade = grade
    }
}