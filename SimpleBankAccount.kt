// A simple class to represent a bank account
class Account(private val ownerName: String, private var currentBalance: Double) {

    // Function to add money to the account
    fun deposit(amount: Double) {
        if (amount > 0) {
            currentBalance += amount
            println("✅ $amount deposited. New balance is: $$currentBalance")
        } else {
            println("❌ Deposit amount must be more than 0.")
        }
    }

    // Function to take money out of the account
    fun withdraw(amount: Double) {
        if (amount <= currentBalance) {
            currentBalance -= amount
            println("✅ $amount withdrawn. New balance is: $$currentBalance")
        } else {
            println("❌ Not enough money to withdraw $amount.")
        }
    }

    // Function to show the current balance and owner name
    fun showBalance() {
        println("👤 Account Holder: $ownerName")
        println("💰 Current Balance: $$currentBalance")
    }
}

// The main function where the program starts
fun main() {
    // Create a new account with $500 balance
    val myAccount = Account("John Doe", 500.0)

    // Perform some operations
    myAccount.showBalance()
    myAccount.deposit(150.0)
    myAccount.withdraw(100.0)
    myAccount.withdraw(600.0) // This should fail due to insufficient balance
}
