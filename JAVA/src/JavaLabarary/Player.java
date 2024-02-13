package JavaLabarary;

public class Player {
	
	String pname;
	int highScore;
	int jersyNo;
	int playerAge;
	
	Player(String pname,int highScore,int jersyNo,int playerAge){
		
		this.pname=pname;
		this.highScore=highScore;
		this.jersyNo=jersyNo;
		this.playerAge=playerAge;
	}
	
	public String toString() {
		return "Player[pname="+pname+",highScore="+highScore+",jersyNo="+jersyNo+",playerAge="+playerAge+"]";
		
	}
	

	public static void main(String[] args) {
		Player p = new Player("Dhoni", 183, 7, 41);
		Player p1 = new Player("Sehwag", 360, 7, 50);
		Player p2 = new Player("Kohli", 260, 10, 40);
		Player p3 = new Player("sachine", 400, 10, 52);
		
//		System.out.println(p);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);

		Player [] plyr = {p,p1,p2,p3};
		for(int i=0; i<=3; i++) {
			System.out.println(plyr[i]);
		}
	}

}
