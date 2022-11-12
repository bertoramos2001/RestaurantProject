package Negocio.Factura;

import java.sql.Date;


public class TFactura {
	
	private Integer id_factura;
	private Boolean activo;
	private Integer id_mesa;
	private Float importe;
	private Date hora_cobro;
	private Integer id_empleado;

	
	
	public Integer getId() {
		return this.id_factura;
	}
	
	public void setId(Integer id) {
		this.id_factura = id;
	}

	
	public Integer getIdMesa() {
		return this.id_mesa;
	}
	
	public void setIdMesa(Integer id_mesa) {
		this.id_mesa = id_mesa;
	}

	
	public Float getImporte() {
		return this.importe;
	}
	
	public void setImporte(Float importe) {
		this.importe = importe;
	}
	
	
	public Integer getIdEmpleado() {
		return this.id_empleado;
	}
	
	public void setIdEmpleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}
	
	
	public Boolean getActivo() {
		return this.activo;
	}
	
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	public Date getHoraCobro() {
		return this.hora_cobro;
	}
	
	public void setHoraCobro(Date hora) {
		this.hora_cobro = hora;
	}

	public TFactura(Integer id_mesa, Integer id_empleado, Float importe, Date hora_cobro, Boolean activo) {
		this.id_mesa = id_mesa;
		this.id_empleado = id_empleado;
		this.importe = importe;
		this.hora_cobro = hora_cobro;
		this.activo = activo;
	}
	
	public TFactura(Integer id_factura, Integer id_mesa, Integer id_empleado, Float importe, Date hora_cobro, Boolean activo) {
		this.id_factura = id_factura;
		this.id_mesa = id_mesa;
		this.id_empleado = id_empleado;
		this.importe = importe;
		this.hora_cobro = hora_cobro;
		this.activo = activo;
	}
	
}