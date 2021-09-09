
public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
	}

	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
	}

	@Override
	public void sacar(double valor) {
		
	}

}
