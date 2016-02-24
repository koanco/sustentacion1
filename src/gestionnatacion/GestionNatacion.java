/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnatacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author koanco
 */
public class GestionNatacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int opcion=0,bandera=0,opcionInscripcion=0,bandera2=0;
     String identificacion="",opcionPrueba="";
     Scanner lector=new Scanner(System.in);
     Deportista obj=new Deportista();
     ArrayList<Deportista> lista=new ArrayList<Deportista>();
     ArrayList<Deportista> prueba1=new ArrayList<>();
     ArrayList<Deportista> prueba2=new ArrayList<>();
     ArrayList<Deportista> prueba3=new ArrayList<>();
     ArrayList<Deportista> prueba4=new ArrayList<>();
     while(opcion!=3)
   { 
       System.out.println("Seleccione la opcion deseada");
       System.out.println("1. Gestion de deportista");
       System.out.println("2. Inscripcion en competenecia");
       System.out.println("3. Salir");
       opcion=lector.nextInt();
       if(opcion==1)
     {   
     while(opcion!=5)
     { System.out.println("Ingrese la opcion deseada:");
         System.out.println("1. Ingresar deportista");
         System.out.println("2. Actualizar deportista");
         System.out.println("3.Eliminar deportista");
         System.out.println("4.Buscar deportista");
         System.out.println("5. Salir de Gestion de deportista");
         opcion=lector.nextInt();
         
         switch(opcion)
         
         { case 1:
             obj=new Deportista();
             obj.ingresarDeportista();
             if(lista.size()==0)
             {
             lista.add(obj);
             }
             else
             {     
             for(int i=0;i<lista.size();i++)
             {
               if(obj.getIdentificacion().equals(lista.get(i).getIdentificacion()))
             {
                 System.out.println("Lo siento, esta identificacion, ya se encuentra");
                 break;
             }
               if(i==lista.size()-1)
               {
               
                  lista.add(obj);
                  i=lista.size();
               }
             }
             }
             break;
             
         case 2:
             bandera=0;
             lector.nextLine();
             obj=new Deportista();
              System.out.println("Ingrese la identificacion del usuario que quiere actualizar");
              identificacion=lector.nextLine();
              for(int i=0;i<lista.size();i++)
              {
                 if(lista.get(i).getIdentificacion().equals(identificacion))
                 {
                    obj=lista.get(i);
                    obj.Actualizar();
                     System.out.println("Se ha actualizado el deportista");
                     bandera=1;
                    break;
                    
                 }
              
              }
              if(bandera==0){
              
                  System.out.println("No se encontro el usuario");
              }
              
              
              break;
         case 3:
               bandera=0;
              lector.nextLine();
              System.out.println("Ingrese la identificacion del usuario que quiere eliminar");
              identificacion=lector.nextLine();
              for(int i=0;i<lista.size();i++)
              {
                 if(lista.get(i).getIdentificacion().equals(identificacion))
                 {
                    lista.remove(i);
                     System.out.println("Se ha eliminado el deportista");       
                    bandera=1;
                     break;
                    
                 }
              
              }
              if(bandera==0)
              {
                  System.out.println("No se encontro el usuario");
              }
              
             break;
             
         case 4:
              lector.nextLine();
              bandera=0;
          System.out.println("Ingrese la identificacion del usuario que quiere buscar");
              identificacion=lector.nextLine();
              for(int i=0;i<lista.size();i++)
              {
                 if(lista.get(i).getIdentificacion().equals(identificacion))
                 {  System.out.println("Los datos del deportista son:");
                    lista.get(i).Mostrar();
                    bandera=1;
                    break;
                    
                 }
                 
              
              }
              if(bandera==0)
              {
                  System.out.println("No se encontro el usuario");
              }
              break;
            
              
             
             
             
              
         }
     }
     opcion=0;
       }
       else if(opcion==2)
       { 
         System.out.println("Incripcion en competencia");
         System.out.println("Seleccione la opcion deseaaa");
         System.out.println("1. Inscribir nadador a prueba ");
         System.out.println("2. Eliminar nadador en prueba ");
         System.out.println("3. Mostrar prueba");
         System.out.println("4. Salir");
         opcionInscripcion=lector.nextInt();
          lector.nextLine();
         if(opcionInscripcion==1)
         {  
             System.out.println("Ingrese la identificacion del nadador a buscar");
             identificacion=lector.nextLine();
             
           for(int i=0;i<lista.size();i++)
           {
             if(lista.get(i).getIdentificacion().equals(identificacion))
             {
                 System.out.println("Se encontro nadador");
                 System.out.println("¿Cual de las 4 las pruebas lo desea inscribir?");
                 System.out.println("1. Estilo libre");
                 System.out.println("2. Mariposa");
                 System.out.println("3. Pecho");        
                 System.out.println("4. Espalda");
                 opcionPrueba=lector.nextLine();
                 switch(opcionPrueba)
                 {   case "1":
                     prueba1.add(lista.get(i));
                     System.out.println("Se ha incrito: "+lista.get(i).getNombreCompleto()+" en la prueba estilo libre");                            
                     break;
                  case  "2":
                      prueba2.add(lista.get(i));
                       System.out.println("Se ha incrito: "+lista.get(i).getNombreCompleto()+" en la prueba mariposa");                            
                      break;
                 case  "3":
                      prueba3.add(lista.get(i));
                       System.out.println("Se ha incrito: "+lista.get(i).getNombreCompleto()+" en la prueba pecho");                            
                      break;
                 case  "4":
                      prueba4.add(lista.get(i));
                       System.out.println("Se ha incrito: "+lista.get(i).getNombreCompleto()+" en la espalda");                            
                      break;
                 
                 }
             }
           }
       
         }
         else if(opcionInscripcion==2)
         {
             System.out.println("Ingrese la identificacion del nadador a eliminar");
             identificacion=lector.nextLine();
           
           for(int i=0;i<lista.size();i++)
           {
             if(lista.get(i).getIdentificacion().equals(identificacion))
             {   bandera2=0;
                 System.out.println("Se encontro nadador");
                 System.out.println("¿Cual de las 4 las pruebas lo desea eliminar?");
                 System.out.println("1. Estilo libre");
                 System.out.println("2. Mariposa");
                 System.out.println("3. Pecho");        
                 System.out.println("4. Espalda");
                 opcionPrueba=lector.nextLine();
                 switch(opcionPrueba)
                 {   case "1":
                     bandera2=0;
                     for(int j=0;j<prueba1.size();i++)
                     {
                      if(prueba1.get(j).getIdentificacion().equals(identificacion))   
                      {prueba1.remove(j);
                       System.out.println("Se ha eliminado de la prueba libre");
                       bandera2=1;
                      }
                     }
                     if(bandera2==0)
                     {
                         System.out.println("No existe en la prueba libre");
                     
                     }
                         
                     break;
                  case  "2":
                      bandera2=0;
                      for(int j=0;j<prueba2.size();i++)
                     {
                      if(prueba2.get(j).getIdentificacion().equals(identificacion))   
                      {prueba2.remove(j);
                       System.out.println("Se ha eliminado de la prueba mariposa");  
                       bandera2=1;
                      }
                     }
                     if(bandera2==0)
                     {
                         System.out.println("No existe en la prueba mariposa");
                     }
                      break;
                 case  "3":
                     bandera2=0;
                      for(int j=0;j<prueba3.size();i++)
                     {
                      if(prueba3.get(j).getIdentificacion().equals(identificacion))   
                      {prueba3.remove(j);
                       System.out.println("Se ha eliminado de la prueba pecho");  
                       bandera2=1;
                      }
                     }
                     if(bandera2==0)
                     {
                         System.out.println("No existe en la prueba pecho");
                     }
                      break;
                 case  "4":
                     bandera2=0;
                      for(int j=0;j<prueba4.size();i++)
                     {
                      if(prueba4.get(j).getIdentificacion().equals(identificacion))   
                      {prueba4.remove(j);
                       System.out.println("Se ha eliminado de la prueba espalda");  
                       bandera2=1;
                      }
                     }
                     if(bandera2==0)
                     {
                         System.out.println("No existe en la prueba espalda");
                     }
                      break;
                 
                 }
             }
           }
        
         
         }
         else if(opcionInscripcion==3)
         {  System.out.println("Seleccione una prueba a mostrar los deportistas");
             System.out.println("1. Estilo libre");
             System.out.println("2. Mariposa");
             System.out.println("3. Pecho");        
             System.out.println("4. Espalda");
             opcionPrueba=lector.nextLine();
             switch(opcionPrueba)
             {
                 case "1":
                     System.out.println("Estudiantes de prueba 1-Estilo libre");
                     for(int i=0;i<prueba1.size();i++)
                     {
                                             
                         System.out.println("Nombre: "+prueba1.get(i).getNombreCompleto());
                         System.out.println("Categoria: "+prueba1.get(i).getCategoria());
                     }
                     break;
                 case "2":
                     System.out.println("Estudiantes de prueba 2 Mariposa");
                     for(int i=0;i<prueba2.size();i++)
                     {
                                             
                         System.out.println("Nombre: "+prueba2.get(i).getNombreCompleto());
                         System.out.println("Categoria: "+prueba2.get(i).getCategoria());
                     }
                     break;
                 case "3":
                    System.out.println("Estudiantes de prueba 3-Pecho");
                     for(int i=0;i<prueba3.size();i++)
                     {
                                             
                         System.out.println("Nombre: "+prueba3.get(i).getNombreCompleto());
                         System.out.println("Categoria: "+prueba3.get(i).getCategoria());
                     }
                     break;
                     
                 case "4":
                     System.out.println("Estudiantes de prueba 4-Espalda");
                     for(int i=0;i<prueba4.size();i++)
                     {
                                             
                         System.out.println("Nombre: "+prueba4.get(i).getNombreCompleto());
                         System.out.println("Categoria: "+prueba4.get(i).getCategoria());
                     }
             
             
             
             }
                 
             
             
         }
         
           
       
       }
       
   }
     
    }
    
}
