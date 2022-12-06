package main;
import clases.*;

public class Main {

	public static void main(String []args)
	{
		IFabrica miFabrica =  new FabricaPizza();
		miFabrica.crearElementos();
		IElementoMasa miMasa   =  miFabrica.getElementoMasa();
		IElementoSabor miSabor = miFabrica.getElementoSabor();
		
		System.out.println("Mi pizza tiene: " + miMasa.getDatos() + miSabor.getInformacion());
		
	}
	
}
