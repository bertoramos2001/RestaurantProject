package Negocio.Empleado;

public class TEmpleado {

	private String nombre;
	private Boolean activo;
	private Float sueldo;
	private String dni;
	private String horario;
	private Integer id_empleado;
	protected String idioma;
	protected Boolean titulo;

	public TEmpleado(Integer id, String nombre, Boolean activo, Float sueldo, String dni, String horario, String idioma, Boolean titulo) {
		this.id_empleado = id;
		this.nombre = nombre;
		this.activo = activo;
		this.sueldo = sueldo;
		this.dni = dni;
		this.horario = horario;
		this.idioma = idioma;
		this.titulo = titulo;
	}
	
	public TEmpleado(String nombre, Boolean activo, Float sueldo, String dni, String horario, String idioma, Boolean titulo) {
		this.nombre = nombre;
		this.activo = activo;
		this.sueldo = sueldo;
		this.dni = dni;
		this.horario = horario;
		this.idioma = idioma;
		this.titulo = titulo;
	}
	
	public TEmpleado() {

	}

	public String getNombre() {
		return nombre;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public String getDNI() {
		return dni;
	}

	public String getHorario() {
		return horario;
	}

	public Integer getId() {
		return id_empleado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void setId(Integer id) {
		id_empleado = id;
	}
	public void setIdioma(String idioma){
		this.idioma = idioma;
	}
	
	public void setTitulo(Boolean titulo){
		this.titulo = titulo;
	}
	
	public String getIdioma(){
		return idioma;
	}
	
	public Boolean getTitulo(){
		return titulo;
	}
}