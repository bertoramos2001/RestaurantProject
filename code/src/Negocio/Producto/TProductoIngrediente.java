package Negocio.Producto;

public class TProductoIngrediente {
	private Integer id_producto;
	private Integer id_ingrediente;
	
	public TProductoIngrediente(Integer id_producto, Integer id_ingrediente){
		this.id_producto = id_producto;
		this.id_ingrediente = id_ingrediente;
	}
	
	public Integer getIdProducto() {return this.id_producto;}
	
	public void setIdProducto(Integer idP) {this.id_producto = idP;}
	
	public Integer getIdIngrediente() {return this.id_ingrediente;}
	
	public void setIdIngrediente(Integer idI) {this.id_ingrediente = idI;}
}
