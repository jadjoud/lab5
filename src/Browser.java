
public class Browser {

	MyStack<SiteStats> history = new MyStack<SiteStats>();

	public Boolean isBrowsingHistoryEmpty() {
		if (history.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public String mostRecentlyVisitedSite() {
		return history.peek().getUrl();

	}

	public void addSiteToHistory(String url) {
		SiteStats site = new SiteStats(url, 1);
		history.push(site);
	}

	public void goBackInTime(int n) {
		if (!isBrowsingHistoryEmpty()) {
			for (int i = 1; i <= n && !history.isEmpty(); i++) {
				history.pop();
			}
		}
	}

	public void printBrowsingHistory() {
		if(!isBrowsingHistoryEmpty()) {
		System.out.println(history.toString());}
		else {
			System.out.println("no browsing history");
		}

	}
	MyQueue<SiteStats> sites = new MyQueue<SiteStats>();
	public void listTopVisitedSites(MyQueue sites, int n) {
		 
	}

}
