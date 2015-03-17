package zk.angular.demo;

import java.util.LinkedList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.Messagebox;

public class ViewModelIndex {

	private List<MenuPrincipal> menuList = new LinkedList<MenuPrincipal>();
	private String msjePrincipal;
	private String escribeAlgo;
	
	@Init
	public void Init() {
		menuList.add( new MenuPrincipal("mdi-image-flash-on", "Speeds up development", "We did most of the heavy lifting for you to provide a default stylings that incorporate our custom components. Additionally, we refined animations and transitions to provide a smoother experience for developers.") );
		menuList.add( new MenuPrincipal("mdi-social-group", "User Experience Focused", "By utilizing elements and principles of Material Design, we were able to create a framework that incorporates components and animations that provide more feedback to users. Additionally, a single underlying responsive system across all platforms allow for a more unified user experience.") );
		menuList.add( new MenuPrincipal("mdi-action-settings", "Easy to work with", "We have provided detailed documentation as well as specific code examples to help new users get started. We are also always open to feedback and can answer any questions a user may have about Materialize.") );
		msjePrincipal = "Starter Template";
		escribeAlgo = "A modern responsive front-end framework based on Material Design";
	}
	
	@Command
	@NotifyChange("msjePrincipal")
	public void pruebaBoton() {
		String[] mensaje = msjePrincipal.split(" ");
		msjePrincipal = mensaje[1] + " " + mensaje[0];
		Messagebox.show("Hiciste clic", "Titulo", Messagebox.OK | Messagebox.IGNORE  | Messagebox.CANCEL, Messagebox.EXCLAMATION);
	}

	public List<MenuPrincipal> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuPrincipal> menuList) {
		this.menuList = menuList;
	}

	public String getMsjePrincipal() {
		return msjePrincipal;
	}

	public void setMsjePrincipal(String msjePrincipal) {
		this.msjePrincipal = msjePrincipal;
	}

	public String getEscribeAlgo() {
		return escribeAlgo;
	}

	public void setEscribeAlgo(String escribeAlgo) {
		this.escribeAlgo = escribeAlgo;
	}
}
