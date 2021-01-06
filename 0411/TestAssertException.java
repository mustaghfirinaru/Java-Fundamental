/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class TestAssertException {
	public static void main(String[] args) {
		BankAccount acct = new BankAccount(200);
		acct.deposit(-25);
		System.out.println("Current Balance: " + acct.getBalance());
	}
}