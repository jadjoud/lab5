
public class SiteStats {

	private String url;
	private int numVisits;

	public SiteStats(String url, int numVisits) {
		this.url = url;
		this.numVisits = numVisits;
	}

	public int getNumVisits() {
		return this.numVisits;
	}

	public String getUrl() {
		return this.url;
	}

	public void setNumVisits(int updatedNumVisits) {
		this.numVisits = updatedNumVisits;
	}

	public String toString() {
		return this.url + " | " + this.numVisits;
	}

}
