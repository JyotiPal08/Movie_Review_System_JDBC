package pojos;

public class Movie {
	private int id;
	private String title;
	private String relDate;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int id, String title, String relDate) {
		super();
		this.id = id;
		this.title = title;
		this.relDate = relDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRelDate() {
		return relDate;
	}
	public void setRelDate(String relDate) {
		this.relDate = relDate;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", relDate=" + relDate + "]";
	}
	
	
}
