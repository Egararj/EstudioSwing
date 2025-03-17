package modelo;

import java.math.BigDecimal;

public class Cuenta {
	private String persona;
	private BigDecimal saldo;

	public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	public Cuenta(String persona, BigDecimal saldo) {
		this.persona = persona;
		this.saldo = saldo;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [persona=" + persona + ", saldo=" + saldo + "]";
	}
	
	

}
