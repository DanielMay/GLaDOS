package cda;

public class Gun {
	
	private GLaDOS owner;
	
	public Gun(GLaDOS g){
		owner = g;
	}
	
	public void update() {
		if (owner.getRadar().didSeeRobot())
			owner.fire(1);
	}
	
}