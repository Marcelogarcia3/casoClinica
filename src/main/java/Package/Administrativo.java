package Package;

class Administrativo extends Trabajador {
	private String correoElectronico;

	public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo, String especialidad) {
		super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo, especialidad);
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	@Override
	public String getTipo() {
		return "Administrativo";
	}
}
