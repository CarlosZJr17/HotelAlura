package jdbc.modelo;

import java.time.LocalDate;

public class Reserva {

	private Integer id;
	private LocalDate fechaS;
	private LocalDate fechaE;
	private String valor;
	private String formaDePago;
	


	public Reserva( LocalDate fechaS, LocalDate fechaE, String valor, String formaDePago) {
		this.fechaS = fechaS;
		this.fechaE = fechaE;
		this.valor = valor;
		this.formaDePago = formaDePago;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaE() {
		return fechaE;
	}

	public void setFechaE(LocalDate fechaE) {
		this.fechaE = fechaE;
	}

	public LocalDate getFechaS() {
		return fechaS;
	}

	public void setFechaS(LocalDate fechaS) {
		this.fechaS = fechaS;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	
}
