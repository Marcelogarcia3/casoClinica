package Package;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clínica médica
        ClinicaMedica clinica = new ClinicaMedica();

        // Crear especialidades médicas
        EspecialidadMedica especialidad1 = new EspecialidadMedica("Cardiología");
        EspecialidadMedica especialidad2 = new EspecialidadMedica("Dermatología");

        // Crear médicos y administrativos
        Medico medico1 = new Medico("Dr. Juan Pérez");
        Medico medico2 = new Medico("Dr. María Gómez");


        Administrativo admin1 = new Administrativo("Licenciado en Administración", "Ana Rodríguez", "Calle Principal 123", "Soltera", "12345678-9", "Lunes a Viernes, de 9:00 a 17:00", "Administración");
        Administrativo admin2 = new Administrativo("Licenciado en Contabilidad", "Pedro López", "Avenida Principal 456", "Casado", "98765432-1", "Lunes a Viernes, de 8:00 a 16:00", "Finanzas");
        // Agregar administrativos a los médicos
        medico1.agregarAdministrativo(admin1);

        // Agregar médicos a las especialidades
        especialidad1.agregarMedico(medico1);
        especialidad2.agregarMedico(medico2);

        // Agregar especialidades a la clínica
        clinica.agregarEspecialidad(especialidad1);
        clinica.agregarEspecialidad(especialidad2);

        // Obtener todos los médicos de la clínica
        List<Medico> todosLosMedicos = clinica.obtenerMedicos();
        System.out.println("Todos los médicos de la clínica:");
        for (Medico medico : todosLosMedicos) {
            System.out.println(medico.getNombre());
        }

        // Obtener todos los administrativos de la clínica
        List<Administrativo> todosLosAdministrativos = clinica.obtenerAdministrativos();
        System.out.println("\nTodos los administrativos de la clínica:");
        for (Administrativo administrativo : todosLosAdministrativos) {
            System.out.println(administrativo.getNombre());
        }

        // Obtener una lista de médicos de una especialidad médica específica
        String nombreEspecialidad = "Cardiología";
        List<Medico> medicosPorEspecialidad = clinica.obtenerMedicosPorEspecialidad(nombreEspecialidad);
        System.out.println("\nMédicos de la especialidad " + nombreEspecialidad + ":");
        for (Medico medico : medicosPorEspecialidad) {
            System.out.println(medico.getNombre());
        }

        // Obtener un administrativo de una especialidad clínica específica según su nombre y rut
        String nombreEspecialidad2 = "Dermatología";
        String nombreAdministrativo = "Pedro López";
        String rutAdministrativo = "98765432-1";
        Administrativo administrativoBuscado = clinica.obtenerAdministrativoPorEspecialidad(nombreEspecialidad2, nombreAdministrativo, rutAdministrativo);
        if (administrativoBuscado != null) {
            System.out.println("\nAdministrativo encontrado:");
            System.out.println("Nombre: " + administrativoBuscado.getNombre());
            System.out.println("RUT: " + administrativoBuscado.getRut());
        } else {
            System.out.println("\nAdministrativo no encontrado.");
        }
    }
}