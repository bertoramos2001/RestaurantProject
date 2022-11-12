package Negocio.Menu;

public class TMenuProducto {
	
	private Integer id_menu;

	private Integer id_producto;

	public TMenuProducto(Integer idMenu, Integer idProducto) {
		this.id_menu = idMenu;
		this.id_producto = idProducto;
	}
	
	public Integer getIdProducto() {return this.id_producto;}
	
	public Integer getIdMenu() {return this.id_menu;}
	
	public void setIdProducto(Integer idP) {this.id_producto = idP;}

	public void setIdMenu(Integer idM) {this.id_menu = idM;}
}