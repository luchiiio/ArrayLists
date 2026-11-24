import java.util.*
        ;

public class Main {
    void main() {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        ArrayList<Float> notasAlumnos = new ArrayList<>();
        ArrayList<String> alumnos = new ArrayList<>();

        do {

            System.out.println("-------Menu Principal-------");
            System.out.println("1. Introducir Nota");
            System.out.println("2. Consultar Nota");
            System.out.println("3. Eliminar Nota");
            System.out.println("4. Modificar Nota");
            System.out.println("5. Salir\n");
            System.out.print("Escribe una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {


                case 1:
                    System.out.println("añadir nota del alumno: ");
                    notasAlumnos.add(sc.nextFloat());
                    break;
                case 2:
                    System.out.println("Ver las notas por el index: ");
                    int index = sc.nextInt();
                    if (index < 0 && index )
                        System.out.println("La nota buscada es: " + notasAlumnos.get(index));
                    break;
                case 3:
                    System.out.println("\nIndica el index a eliminar: ");
                    int indexEliminar = sc.nextInt();
                    System.out.println("NOTA ELIMINADA! " + notasAlumnos.remove(indexEliminar));
                    break;
                case 4:
                    System.out.println("\nIndica el index a cambiar: ");
                    int indexSet = sc.nextInt();
                    System.out.println("Indica la nueva nota: ");
                    float notaAnterior = notasAlumnos.set(indexSet, sc.nextFloat());
                    System.out.println("Nota cambiada. Antes era: " + notaAnterior);
                    break;
                case 5:
                    System.out.println("saliedno del progrma...");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        } while (opcion != 5);

        System.out.println(notasAlumnos);
    }
}
