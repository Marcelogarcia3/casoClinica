package Package;

import java.util.ArrayList;
import java.util.List;

class EspecialidadMedica {
	private String nombre;
	private List<Medico> medicos;

	public EspecialidadMedica(String nombre) {
		this.nombre = nombre;
		this.medicos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarMedico(Medico medico) {
		medicos.add(medico);
	}

	public List<Medico> getMedicos() {
		return medicos;
	}
}