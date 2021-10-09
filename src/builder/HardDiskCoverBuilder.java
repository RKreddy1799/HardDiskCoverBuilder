package builder;



public class HardDiskCoverBuilder {

	public static void main(String[] args) {
		CoverStateController diskCover = new CoverStateController();


		diskCover.insert();
		diskCover.powerOn();
		diskCover.read();
		diskCover.write();

		diskCover.powerOff();
		diskCover.eject();
		
		System.out.println(diskCover);
		diskCover.eject();
	}

}
