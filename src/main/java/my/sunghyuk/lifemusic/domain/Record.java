package my.sunghyuk.lifemusic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Record {

	private long id;
	private String name;
	private String description;
	private String imgURL;
	private String artist;
	private LocalDate releaseDate;
	private String writer;
	private int likeCount;
	private List<Genre> genres;
	private String genreNames;
	private LocalDateTime createdDateTime;
	private int views;
	private double rate;

	public String getGenreNames() {
		if (genreNames == null) {
			genreNames = "";

			for (int i = 0; i < genres.size(); i++) {
				Genre genre = genres.get(i);
				genreNames += genre.getName() + (i == genres.size() ? "" : ", ");
			}
		}
		return genreNames;
	}
}