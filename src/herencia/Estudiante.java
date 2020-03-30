/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Usuario
 */
import javax.swing.JOptionPane;

public class Estudiante extends Persona{
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
    private double definitiva;
    
    
public Estudiante(){
}   
public Estudiante(String nombre,String apellido, int edad, int peso, String carnet,double promedioNotas, int numeroMaterias,double definitiva){
      super(nombre, apellido, edad, peso);
      this.carnet=carnet;
      this.promedioNotas=promedioNotas;
      this.numeroMaterias=numeroMaterias;
      this.definitiva=definitiva;
}
public String getCarnet(){
return carnet;}
public void setCarnet(String carnet){
    this.carnet= carnet;
}
public double getPromedioNotas(){
return promedioNotas;}
public void setPromedioNotas(double promedioNotas){
    this.promedioNotas= promedioNotas;
}
public double getDefinitiva(){
return promedioNotas;}
public void setDefinitiva(double definitiva){
    this.definitiva= definitiva;
}
public int getNumeroMaterias(){
return numeroMaterias;}
public void setNumeroMaterias(int numeroMaterias){
    this.numeroMaterias= numeroMaterias;
}
public double calcularPromedio(int numeroMaterias,double nota){
    double promedio=0.0;
    promedio =nota/numeroMaterias;
        return promedio;
}
double nota = 0;
public double leerNotas(double numNota){
        int i=0;
        
       while(i<numNota){
           nota=Double.parseDouble(JOptionPane.showInputDialog("digite la nota"));
           setPromedioNotas(nota);
           nota=nota+getPromedioNotas(); 
        i++;
} 
        return nota;
    
}
public Estudiante ingresarDatosEstudiante(){
        Estudiante est =new Estudiante();
   String nombre=leerDatoTipoCadena("Ingrese el nombre del estudiante ");
   String apellido=leerDatoTipoCadena("Ingrese el apellido del estudiante ");
   int edad =leerDatoTipoEntero("Ingrese la edad del estudiante ");
   double peso = leerDatoTipoReal("Ingrese el peso del estudiante ");
 
   int numeroMaterias=leerDatoTipoEntero("Ingrese el numero de materias");
   double suma=leerNotas(numeroMaterias);
   
   double definitiva=calcularPromedio(numeroMaterias, suma);
   est.setNombre(nombre);
   est.setApellido(apellido);
   est.setEdad(edad);
   est.setPeso(peso);
   est.setDefinitiva(definitiva);
   
   est.setNumeroMaterias(numeroMaterias);
   return est;
}
public void imprimirReporteEstudianteNotasEstudiante(){
    
    imprimirDatosPersona();
    JOptionPane.showConfirmDialog(null,"numero de materias: "+numeroMaterias+" promedio: "+ definitiva );
    
    

}

}


