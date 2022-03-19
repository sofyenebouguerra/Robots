import java.util.Scanner;

public class test {

	public static void main(String[] args) {

    Robot[] robots=new Robot[100];
    robots[0]=new Robot("ahmed");
    robots[1]=new Robot("Selim");
    robots[2]=new RobotNG("Ali");
    robots[3]=new RobotNG("Saddam",100,20,Direction.Nord,50);
    robots[4]=new Robot("Mounir",150,30,Direction.Sud);
  /* for(int i=0;i<5;i++) {
	   System.out.println("robot numéro " +(i+1) );
	   robots[i].afficher();
	   
   }*/
    ((RobotNG)robots[2]).setTurbo(true);
    ((RobotNG)robots[2]).Avance();
    ((RobotNG)robots[2]).gauche();
    ((RobotNG)robots[2]).afficher();
   
    
   
			
		
	}
}
