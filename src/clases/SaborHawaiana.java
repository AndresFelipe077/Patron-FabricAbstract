package clases;

public class SaborHawaiana implements IElementoSabor{
	@Override
	public void seleccion()
	{
		System.out.println("Se seleccionó pizza Hawaina");
	}
	@Override
	public String getInformacion()
	{
		return " con cebolla, pimentón, champiñon, piña y tomate";
	}
}
