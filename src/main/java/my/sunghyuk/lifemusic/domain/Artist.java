package my.sunghyuk.lifemusic.domain;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
public class Artist {

	private int id;
	private String name;
	private LocalDate debutDate;
	private List<Genre> genres;
	private String description;
	private String birth;
	private String gender;

}
