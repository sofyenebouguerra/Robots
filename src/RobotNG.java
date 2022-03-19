
public class RobotNG extends Robot {
	private int nbrePas;
	private boolean turbo;

	public RobotNG(String nom, int x, int y, Direction direction, int nbrePas) {
		super(nom, x, y, direction);
		this.nbrePas = nbrePas;
		turbo=false;
	}
	public RobotNG(String nom) {
		super(nom);
		turbo=false;
	}
	
	@Override
	public void Avance() {
		if(turbo)
			Avance(3);
		else
		super.Avance();
	}
	
	@Override
	public void afficher() {
		if(turbo)
			System.out.println("Turbo Activer ");
		else
			System.out.println("Turbo Désactiver");
		
			super.afficher();
	}
	
	public void Avance(int nbrePas) {
	//for(int i=0;i<nbrePas;i++) {
		//Avance();
		if(turbo) 
			nbrePas*=3;
		
		if(getDirection().equals(Direction.Nord))
			setY(getY()+nbrePas);
		if(getDirection().equals(Direction.Sud))
			setY(getY()-nbrePas);
		if(getDirection().equals(Direction.Est))
			setX(getX()+nbrePas);
		if(getDirection().equals(Direction.Ouest))
			setY(getX()-nbrePas);
			
		
	}
	
	public void gauche() {
		//for(int i=0;i<3;i++) {
			//Droite();
		//}

		 if(getDirection().equals(Direction.Nord)) 
			 setDirection(Direction.Est);
		 else if(getDirection().equals(Direction.Est))
			 setDirection(Direction.Sud);
		 else if(getDirection().equals(Direction.Ouest))
			 setDirection(Direction.Nord);
		 else if(getDirection().equals(Direction.Sud))
			 setDirection(Direction.Ouest);
			
		
		
	}
	public void demiTour() {
		//for(int i=0;i<2;i++) {
			//Droite();
		//}
		 if(getDirection().equals(Direction.Nord)) 
			 setDirection(Direction.Sud);
		 else if(getDirection().equals(Direction.Est))
			 setDirection(Direction.Ouest);
		 else if(getDirection().equals(Direction.Ouest))
			 setDirection(Direction.Est);
		 else if(getDirection().equals(Direction.Sud))
			 setDirection(Direction.Nord);
			
		
	}
	public int getNbrePas() {
		return nbrePas;
	}
	public void setNbrePas(int nbrePas) {
		this.nbrePas = nbrePas;
	}
	public boolean hasTurbo() {
		return turbo;
	}
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	

}
