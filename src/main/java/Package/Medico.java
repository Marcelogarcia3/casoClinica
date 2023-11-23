package Package;

import java.util.ArrayList;
import java.util.List;

class Medico {
	private String nombre;
	private List<Administrativo> administrativos;

	public Medico(String nombre) {
		this.nombre = nombre;
		this.administrativos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarAdministrativo(Administrativo administrativo) {
		administrativos.add(administrativo);
	}

	public List<Administrativo> getAdministrativos() {
		return administrativos;
	}
}