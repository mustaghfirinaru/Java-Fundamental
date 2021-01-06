/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class BankAccount {
	private double balance;
	BankAccount(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount<0){
		System.out.println("Jumlah harus positif");
			throw new IllegalArgumentException();}
		balance -= amount;
	}
	public void withdraw(double amount) {
		if(amount<0){
		System.out.println("Jumlah harus positif");
			throw new IllegalArgumentException();}
		balance -= amount;
	}
	public double getBalance( ) {
		return balance;
	}
}