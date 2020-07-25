package com.example.rest.entidades;

public class Comprobante {
	
	private int idcomprobante;
	private String fechaRegistro;
	private String fechaPago;
	private String estado;
	private String pedido;
	private String cliente;
	private String usuario;
	
	
	public int getIdcomprobante() {
		return idcomprobante;
	}
	public void setIdcomprobante(int idcomprobante) {
		this.idcomprobante = idcomprobante;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
