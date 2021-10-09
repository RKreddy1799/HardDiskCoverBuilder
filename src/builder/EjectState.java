package builder;


public class EjectState implements State {
	CoverStateController diskCover;
	public EjectState(CoverStateController diskCover) {
		this.diskCover = diskCover;
	}

	@Override
	public void insertHDD() {
		System.out.println("Inserting HDD");
		diskCover.setState(diskCover.getInsertState());
	}

	@Override
	public void ejectHDD() {
		System.out.println("Ejected HDD");
		System.out.println("Creating new HardDiskCover");
		CoverBuilder plasticCoverBuilder = new PlasticCoverBuilder();
		DiskCover plasticCover = plasticCoverBuilder.addAbcPlastic().addAcrylic().addCopper().addNickel().addNylon().addPVC().addZinc().build();
		plasticCover.prepare();
		plasticCover.heat();
		plasticCover.drawing();
		plasticCover.rolling();
		plasticCover.extrusion();
		plasticCover.forging();
		plasticCover.pack();
		System.out.println(plasticCover);

	}

	@Override
	public void powerOn() {
		System.out.println("Cannot power on HDD removed");

	}

	@Override
	public void powerOff() {
		System.out.println("No HDD found to Power off");

	}

	@Override
	public void read() {
		System.out.println("No HDD found to read");

	}

	@Override
	public void write() {
		System.out.println("No HDD found to write");
	}
	public String toString() {
		return " eject state";
	}
}
