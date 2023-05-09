package jdbc.controller;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import jdbc.dao.ReservasDAO;
import jdbc.factory.ConexionBase;
import jdbc.modelo.Reserva;

public class ReservasController {

	private ReservasDAO reservaD;

	public ReservasController() {
		Connection con = new ConexionBase().conectarBase();
		this.reservaD = new ReservasDAO(con);
	}

	public void guardar(Reserva reserva) {
		this.reservaD.guardar(reserva);
	}
	
	public List<Reserva> mostrar() {
		return this.reservaD.mostrar();
	}
	
	public List<Reserva> buscar(String id) {
		return this.reservaD.buscarId(id);
	}
	
	public void actualizarReserva(LocalDate dataE, LocalDate dataS, String valor, String formaPago, Integer id) {
	this.reservaD.Actualizar(dataE, dataS, valor, formaPago, id);
	}
	
	public void Eliminar(Integer id) {
		this.reservaD.Eliminar(id);
	}
}
