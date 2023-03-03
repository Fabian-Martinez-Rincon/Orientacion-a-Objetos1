public class Farola {
	private boolean estado;
	private List<Farola> farolas;
	
	public Farola(){
		this.estado=false;
		farolas= new ArrayList<>();
	}
	
	private void addNeighbor(Farola otraFarola){
		this.farolas.add(otraFarola);
	}
	
	public void pairWithNeighbor(Farola otraFarola){
		this.farolas.add(otraFarola);
		otraFarola.addNeighbor(this);
	}

	//si se modifican los elementos de la copia, no se altera el original pero si se alteran los objetos si, ya que la lista contiene la direccion de donde esta ubicado cada objeto
    
	public List<Farola> getNeighbors(){
		List<Farola> farolasCopia = List.copyOf(this.farolas); 
		return farolasCopia;
	}
	
	public boolean isOn(){
		return estado;
	}
	
	public void turnOn(){
		this.turn(true);
	}
	
	public void turnOff(){
		this.turn(false);
	}
	
	private void setEstado(boolean nuevoEstado){
		this.estado=nuevoEstado;
	}
	
	private void turn(boolean nuevoEstado){
		if(nuevoEstado != this.isOn()){
			this.setEstado(nuevoEstado);
			
		}
	}
	
}