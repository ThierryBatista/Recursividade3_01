package view;

import controller.DigitoController;

public class Digito
{
public static void main(String Args[])
 {
 DigitoController QtdD = new DigitoController();
 int numero = 3690;
 int cta = 1;

 int digitos = QtdD.RecDig(numero, cta);
 System.out.println(digitos);
 }
}
