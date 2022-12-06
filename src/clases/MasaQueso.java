package clases;

public class MasaQueso implements IElementoMasa{
	@Override
	public void producir()
	{
		System.out.println("Generando masa con bordes de queso");
		
	}
	
	@Override
	public String getDatos()
	{
		return "Masa rendonda regular con bordes de queso";
	}
}
