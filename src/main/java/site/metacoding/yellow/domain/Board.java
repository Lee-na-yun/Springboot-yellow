package site.metacoding.yellow.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 	// no와 all은 같이 만들기
@AllArgsConstructor
@Setter
@Getter
public class Board {

	private Integer id;
	private String title;
	private String content;
}
