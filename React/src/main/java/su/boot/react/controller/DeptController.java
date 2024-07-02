package su.boot.react.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 빈으로 컨트롤러 스캔을 구성하고 컨트롤러를 구현한다.
@Controller
public class DeptController {
	private static final Logger logger = LogManager.getLogger(DeptController.class);

//@RestController 어노테이션에서는 <a> 태그로 매핑명에 접근할 수 없으므로 @Controller 어노테이션에서 설정한다.
	@GetMapping("/DeptSelectView")
	public String selectAllView() {
		logger.info("내용");
		return "./dept/dept_axiosreact";
	}
}