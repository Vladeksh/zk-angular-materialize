package zk.angular.demo;

public class MenuPrincipal {

	private String icono;
	private String menu;
	private String descripcion;
	
	public MenuPrincipal() {
	}

	public MenuPrincipal(String icono, String menu, String descripcion) {
		this.icono = icono;
		this.menu = menu;
		this.descripcion = descripcion;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
