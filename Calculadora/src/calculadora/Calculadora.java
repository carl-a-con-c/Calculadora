package calculadora;
import java.util.Scanner;
public class Calculadora 
{
    public static void main(String[] args) 
    {
       Scanner dato=new Scanner(System.in);
        
       cCalcul obj= new cCalcul();
       int opc=0;
       
       while(opc != 5)
       {
           System.out.println("¿Qué operación desea realizar? n/1)Suma n/2)Resta n/3)Multiplicación n/4)División n/5)Salir");
           opc=dato.nextInt();
           
           if(opc==1)
           {
               obj.IngresaDatos();
               obj.Suma();
               obj.Res();
           }
           else
           {
               if(opc==2)
               {
                   obj.IngresaDatos();
                   obj.Resta();
                   obj.Res();
               }
               else
               {
                   if(opc==3)
                   {
                       obj.IngresaDatos();
                       obj.Mult();
                       obj.Res();
                   }
                   else
                   {
                       if(opc==4)
                       {
                           obj.IngresaDatos();
                           obj.Div();
                           obj.Res();
                       }
                       else
                       {
                           System.out.println("Opción inválida, intente de nuevo.");
                       }
                   }
               }
           }
       }
    }
    
}
