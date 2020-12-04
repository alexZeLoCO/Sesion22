
public class Dado {
	
	private Dado () {		//PRIVATE PARA NO 
					//CONSTRUCTOR DEFAULT VACÍO
	}	

	public static int lanza() {			//LANZA
		return(int)(Math.random()*6)+1;
		
	}
}
