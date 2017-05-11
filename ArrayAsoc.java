package prArrayAsoc;

public class ArrayAsoc {
	//Clases internas
	private class Nodo{
		private String clave;
		private String valor;
		private Nodo sig; //siguiente nodo
		
		public Nodo(String c, String v, Nodo s){
			clave = c;
			valor = v;
			sig = s;
		}
	}
	
	//Variables de instancia
	private Nodo primero;
	
	
	//Constructores
	public ArrayAsoc(){
		primero = null;
	}
	
	public ArrayAsoc(String[] claves, String[] valores){
		this();
		if (claves.length > 0){
			primero = new Nodo(claves[0], valores[0],null);
			for (int i = 1; i< claves.length; i++){
				Nodo nuevo = new Nodo(claves[i], valores[i],primero);
				primero = nuevo;
			}
		}
	}
	
	//Métodos de instancia
	public int size(){
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public String get(String clave){
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public void	put	(String	clave, String valor){
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public String getOrElse(String clave, String valorPorDefecto){
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public boolean containsKey(String clave){
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public boolean remove(String clave){
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
