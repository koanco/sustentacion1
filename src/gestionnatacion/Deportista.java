/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnatacion;

import java.util.Scanner;

/**
 *
 * @author koanco
 */
public class Deportista {
    private String nombreCompleto;
    private String identificacion;
    private String rama;
    private int anoNacimiento;
    private String categoria;

public void ingresarDeportista()
{  int aux=0;
    Scanner lector=new Scanner(System.in);
    System.out.println("Ingresar el nombre completo del deportista");
    this.nombreCompleto=lector.nextLine();
    System.out.println("Ingresar la identificacion");
    this.identificacion=lector.nextLine();
    calcularRama(aux);
     System.out.println("Ingrese el año de nacimiento");
    anoNacimiento=lector.nextInt();
    calcularCategoria();
}
public void calcularRama(int aux)
{ Scanner lector=new Scanner(System.in);
    int bandera=0;

   
    while(bandera!=1)
    {  System.out.println("Ingrese el genero 1. Masculino, 2. Femenino");
    aux=lector.nextInt();
    switch(aux)
   { case 1:
     rama="Masculino";
     break;
     case 2:
     rama="Femenino";
      break;

 }
    if(aux==1 || aux==2)
    {
       bandera=1;
       break;
        
    }
    else
    {         System.out.println("Opcion no valida, intentelo nuevamente");}
    
    }


}

public void calcularCategoria()
{ int anoActual=2016;
  int edad=0;
  edad=anoActual-anoNacimiento;
  if(edad>=6 && edad<=10)
  {
  categoria="Infantil A";
  }
  else if(edad>=11 && edad<=17)
  {
  
  categoria="Infantil B";
  }
  else if(edad>=18 && edad<=25)
  {
  categoria="Juvenil";
  }
  else if(edad>25)
  {
  
  categoria="Senior";
  }
 
  
}

    public String getIdentificacion() {
        return identificacion;
    }

    public void Actualizar()
    {int aux=0;
        System.out.println("Ingrese los datos a actualizar");
    Scanner lector=new Scanner(System.in);
    System.out.println("Ingresar el nombre completo del deportista");
    this.nombreCompleto=lector.nextLine();
    System.out.println("Ingresar la identificacion");
    this.identificacion=lector.nextLine();
    calcularRama(aux);
     System.out.println("Ingrese el año de nacimiento");
    anoNacimiento=lector.nextInt();
    calcularCategoria();
    
    
    
    }
    
    public void Mostrar()
    {
        System.out.println("El nombre comleto es: "+getNombreCompleto());
        System.out.println("La identificacion es: "+getIdentificacion());
        System.out.println("La rama es: "+getRama());
        System.out.println("La categoria es: "+getCategoria());
        System.out.println("El año de nacimiento: "+getAno());
    
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getRama() {
        return rama;
    }


    public String getCategoria() {
        return categoria;
    }
    
    public int getAno()
            
    {
    return anoNacimiento;
    }
    

}