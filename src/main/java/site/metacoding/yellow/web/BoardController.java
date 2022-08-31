package site.metacoding.yellow.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.metacoding.yellow.domain.Board;

@Controller
public class BoardController { // board테이블이 있다고 가정하기

	@GetMapping("/board")	// board테이블을 줘! + @controller = board테이블의 데이터를 view에 담아 줘!
	public String getBoard(Model model) { //전체를 view에 들고갈거기때문에 model만 넣으면 됨
		// 더미 데이터 만들기(가짜)
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board(1, "스프링1강", "컨트롤러 배우기"));
		boardList.add(new Board(2, "스프링2강", "템플릿엔진 배우기"));
		boardList.add(new Board(3, "스프링3강", "디비 연결하 기"));
		
		model.addAttribute("boardList", boardList);	// boardList가 키 값
		return "board/list";
	}
	
	@GetMapping("/board/{id}")
	public String getBoardOne(@PathVariable Integer id, Model model) {
		// 더미 데이터 만들기 (DB가 없지만 있는것처럼!)
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board(1, "스프링1강", "컨트롤러 배우기"));
		boardList.add(new Board(2, "스프링2강", "템플릿엔진 배우기"));
		boardList.add(new Board(3, "스프링3강", "디비 연결하기"));
		
		// 모델에 담기
		if(id==1) {
			model.addAttribute("board",boardList.get(0)); // 0번지에 1이 있음
		}
		if(id==2) {
			model.addAttribute("board",boardList.get(1)); // 0번지에 1이 있음
		}
		if(id==3) {
			model.addAttribute("board",boardList.get(2)); // 0번지에 1이 있음
		}
		
		return "board/detail";
	}
	
	
	
	
}
