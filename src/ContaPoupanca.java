
public final class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	public ContaPoupanca(int agencia, int conta) {
		super(agencia, conta);
	}

	@Override
	public void sacar(double valor) {
		
	}

}
