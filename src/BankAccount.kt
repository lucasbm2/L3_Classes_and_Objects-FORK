class BankAccount {
    var balance: Double =0.0
        set(value){
            if(value<0){
                println("It is not allowed negative balance")
            }else field = value
        }
}