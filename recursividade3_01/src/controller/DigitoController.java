package controller;

public class DigitoController
{
  public DigitoController()
  {
  super();
  }
 
  public int RecDig(int numero,int cta)
  {
   if(numero < 10)
   {
   return cta;
   }
   else
   {
   
   return cta + RecDig(numero / 10, cta);
   }
  }
}
