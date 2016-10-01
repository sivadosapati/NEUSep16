
public class Teacher {
	public Wallet wallet;
	private Wallet encapsulatedWallet;
	private String name;

	public int giveMoney(int denomination, SeattleStudent st) {
		int m = encapsulatedWallet.getMoney();

		if (st.getName().equals("Ruby")) {
			// st.name = "Rose";
			return 0;
		}
		if (st.getName().equals("Vishaal")) {
			if (denomination < 50) {
				if (m > denomination) {
					encapsulatedWallet.remove(denomination);
					return denomination;
				} else {
					return 0;
				}
			}
			if (m > 50) {
				encapsulatedWallet.remove(50);
				return 50;
			} else {
				return 0;
			}
		}
		encapsulatedWallet.remove(denomination);
		//encapsulatedWallet.money = encapsulatedWallet.money - denomination;
		return denomination;
	}

	Teacher(String name) {
		this.name = name;
		this.wallet = new Wallet();
		this.encapsulatedWallet = new Wallet();
	}

	public void printMoneyInWallet() {
		// System.out.println("Wallet has -> " + wallet.money);
		System.out.println("Encapsulated Wallet has -> " + encapsulatedWallet.getMoney());
	}

	public static void main(String args[]) {
		Teacher siva = new Teacher("Siva");
		// siva.printMoneyInWallet();
		// siva.wallet.money = siva.wallet.money - 20;
		// siva.printMoneyInWallet();

		// siva.wallet.money = siva.wallet.money - 50;
		// siva.printMoneyInWallet();
		SeattleStudent serena = new SeattleStudent(siva, "serena");
		serena.takeSomeMoney();

		System.out.println(siva.giveMoney(150, serena));
		siva.printMoneyInWallet();

		SeattleStudent ruby = new SeattleStudent(siva, "Ruby");
		System.out.println(siva.giveMoney(15, ruby));
		siva.printMoneyInWallet();
		System.out.println(ruby.getName());

		SeattleStudent vishaal = new SeattleStudent(siva, "Vishaal");
		System.out.println(siva.giveMoney(190, vishaal));
		siva.printMoneyInWallet();
	}

}

class SeattleStudent {
	private Teacher teacher;
	private String name;

	public String getName() {
		return name;
	}

	public SeattleStudent(Teacher t, String name) {
		this.teacher = t;
		this.name = name;
	}

	public void takeSomeMoney() {
		teacher.wallet.remove(teacher.wallet.getMoney());

	}
}

class Wallet {
	public int money;

	Wallet() {
		this.money = 100;
	}

	int getMoney() {
		return money;
	}

	void remove(int money) {
		if (money > this.money) {
			throw new IllegalArgumentException();
		}
		this.money = this.money - money;
	}

	void add(int money) {
		this.money = this.money + money;
	}
}
