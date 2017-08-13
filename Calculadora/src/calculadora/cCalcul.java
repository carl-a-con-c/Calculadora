package calculadora;
import java.util.Scanner;
public class cCalcul 
{
    Scanner dato=new Scanner(System.in);
    double num1=0;
    double num2=0;
    double res=0;
    
    public void IngresaDatos()
    {
        System.out.println("Teclee el primer número:");
        num1=dato.nextDouble();
           
        System.out.println("Teclee el segundo número:");
        num2=dato.nextDouble();
    }
    
    public void Suma()
    {
        res=num1+num2;
    }
    
    public void Resta()
    {
        res=num1-num2;
    }
    
    public void Mult()
    {
        res=num1*num2;
    }
    
    public void Div()
    {
        res=num1/num2;
    }
    
    public void Res()
    {
        System.out.println("El resultado es:" +res);
    }
}
