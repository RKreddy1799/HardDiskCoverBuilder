package builder;



public class HardDiskCoverBuilder {

	public static void main(String[] args) {
		CoverStateController diskCover = new CoverStateController();

		System.out.println(diskCover);
		diskCover.powerOn();
		diskCover.powerOff();
		diskCover.eject();
		diskCover.read();
		diskCover.write();

	}

}
