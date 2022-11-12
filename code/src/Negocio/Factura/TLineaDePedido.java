package Negocio.Factura;

public class TLineaDePedido {
	
	private Integer idMenu;
	private Integer cantidad;
	private Integer idFactura;
	private Float precio;

	public Integer getIdMenu() {
		return this.idMenu;
	}
	
	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}
	
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	public TLineaDePedido(Integer idMenu, Integer cantidad, Integer idFactura, Float precio){
		
		this.idMenu = idMenu;
		this.cantidad = cantidad;
		this.idFactura = idFactura;
		this.precio = precio;
		
	}
	
	
}