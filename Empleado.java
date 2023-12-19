// CLASE BASE - EMPLEADO    
public class Empleado {

    public String nombre;
    public double salarioBase;
    
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    
    public double calcularSalario() {
        return salarioBase;
    }
}

// clase derivada de empleado
public class Gerente extends Empleado {
    
    // Atributo propio de la clase Gerente
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        
        // herencia de la clase Empleado
        super(nombre, salarioBase);
        this.bono = bono;
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}

//clase derivada de Empleado
public class Desarrollador extends Empleado {
    // Atributo propio de la clase Gerente
    private int horasExtras;

    public Desarrollador(String nombre, double salarioBase, int horasExtras) {
        
        // herencia de la clase Empleado
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horasExtras * 20); //Asuminedo que gana 20$ por hora
    }
}

//Clase principal MAIN
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 2000.0);
        Gerente gerente = new Gerente("Maria", 3000.0, 1000.0);
        Desarrollador desarrollador = new Desarrollador("Carlos", 2500.0, 5);

        System.out.println("Salario de empleado: " + empleado.calcularSalario());
        System.out.println("Salario de gerente: " + gerente.calcularSalario());
        System.out.println("Salario de desarrollador: " + desarrollador.calcularSalario());
    }
}
