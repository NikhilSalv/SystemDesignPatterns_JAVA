package BuilderPattern;

public class Scorpio implements ICar {
	
	private String engine;
	private String tyre;
	private String bodyShell;
	private String chassis;
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	public void setBodyShell(String bodyShell) {
		this.bodyShell = bodyShell;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	@Override
	public String toString() {
		return "Scorpio [engine=" + engine + ", tyre=" + tyre + ", bodyShell=" + bodyShell + ", chassis=" + chassis
				+ "]";
	}
	



}
