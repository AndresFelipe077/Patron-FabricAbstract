package clases;

public class SaborAmericana implements IElementoSabor{
	@Override
	public void seleccion()
	{
		System.out.println("Se seleccionó pizza Americana");
	}
	@Override
	public String getInformacion()
	{
		return " con maíz tierno y tocineta con un toque picante de pepperoni";
	}
}
