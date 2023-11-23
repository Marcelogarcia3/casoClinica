package Package;

import java.util.ArrayList;
import java.util.List;

class ClinicaMedica {
	private String nombre;
	private List<String> direcciones;
	private String tipoClinica;
	private List<EspecialidadMedica> especialidades;

	public ClinicaMedica() {
		this.nombre = nombre;
		this.direcciones = direcciones;
		this.tipoClinica = tipoClinica;
		this.especialidades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<String> getDirecciones() {
		return direcciones;
	}

	public String getTipoClinica() {
		return tipoClinica;
	}

	public void agregarEspecialidad(EspecialidadMedica especialidad) {
		especialidades.add(especialidad);
	}

	public List<Medico> obtenerMedicos() {
		List<Medico> todosLosMedicos = new ArrayList<>();
		for (EspecialidadMedica especialidad : especialidades) {
			todosLosMedicos.addAll(especialidad.getMedicos());
		}
		return todosLosMedicos;
	}

	public List<Administrativo> obtenerAdministrativos() {
		List<Administrativo> todosLosAdministrativos = new ArrayList<>();
		for (EspecialidadMedica especialidad : especialidades) {
			for (Medico medico : especialidad.getMedicos()) {
				todosLosAdministrativos.addAll(medico.getAdministrativos());
			}
		}
		return todosLosAdministrativos;
	}
		public List<Medico> obtenerMedicosPorEspecialidad(String nombreEspecialidad) {
			List<Medico> medicosPorEspecialidad = new ArrayList<>();
			for (EspecialidadMedica especialidad : especialidades) {
				if (especialidad.getNombre().equalsIgnoreCase(nombreEspecialidad)) {
					medicosPorEspecialidad.addAll(especialidad.getMedicos());
					break; // Terminar el bucle si se encuentra la especialidad buscada
				}
			}
			return medicosPorEspecialidad;
		}

		public Administrativo obtenerAdministrativoPorEspecialidad(String nombreEspecialidad, String nombreAdministrativo, String rutAdministrativo) {
			for (EspecialidadMedica especialidad : especialidades) {
				if (especialidad.getNombre().equalsIgnoreCase(nombreEspecialidad)) {
					for (Medico medico : especialidad.getMedicos()) {
						for (Administrativo administrativo : medico.getAdministrativos()) {
							if (administrativo.getNombre().equalsIgnoreCase(nombreAdministrativo) && administrativo.getRut().equalsIgnoreCase(rutAdministrativo)) {
								return administrativo;
							}
						}
					}
				}
			}
			return null; // Retornar null si no se encuentra el administrativo buscado
		}
	}
