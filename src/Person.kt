class Person(name_param: String, age_param: Int) {
    val name: String = name_param
    val age: Int = age_param

    fun showInfo(){
        println("My name is $name and I am $age years old")
    }


}