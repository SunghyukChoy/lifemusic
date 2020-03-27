package my.sunghyuk.lifemusic.domain;

public class Genre {

	private long id;
	private Genre parent;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Genre getParent() {
		return parent;
	}

	public void setParent(Genre parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
