
public abstract class Conta {

	private int agencia;
	private int conta;
	private String titular;
	private double limite;
	private double saldo;
	private double valorLimite;
	
	public Conta(int agencia, int conta, String titular) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}
	
	public Conta(int agencia, int conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}

	public abstract void sacar(double valor);
	
	public final void depositar(double valor) {
		saldo += valor;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValorLimite() {
		return valorLimite;
	}
	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	@Override
	public String toString() {
		return "Dados da Conta: agencia=" + agencia + ", conta=" + conta + ", titular=" + titular;
	}
	
	
	
	
}
