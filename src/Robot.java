
public class Robot {
	
	private String nom;
	private int x,y;
	private Direction direction;
	
	
	
	
	public Robot(String nom, int x, int y, Direction direction) {
		super();
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	
	public Robot(String nom) {
		super();
		this.nom = nom;
		x=0;
		y=0;
		direction=direction.Est;
	}


	public void Avance() {
		if(direction.equals(Direction.Est)) 
	
		x++;
		else if(direction.equals(Direction.Nord)) 
			y++;
		else if(direction.equals(Direction.Ouest)) 
			x--;
		
		else if(direction.equals(Direction.Sud)) 
			y--;
		
		
		
	}
	public void Droite() {
		
		 if(direction.equals(Direction.Nord)) 
			 direction=Direction.Est;
		 else if(direction.equals(Direction.Est))
			 direction=Direction.Sud;
		 else if(direction.equals(Direction.Ouest))
			 direction=Direction.Nord;
		 else if(direction.equals(Direction.Sud))
			 direction=Direction.Ouest;
			
		}
		public void afficher() {
			System.out.println("le nom de robot est " +nom);
			System.out.println("les positons  de robot sont "  +(x)+  " " +(y) );
			System.out.println("le direction de robot est  " +direction.toString());
	
			}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}


		public void setY(int y) {
			this.y = y;
		}


		public Direction getDirection() {
			return direction;
		}


		public void setDirection(Direction direction) {
			this.direction = direction;
		}


		
		
	}
	
	


