package iie.cas.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @todo TODO
 * @author huangyuchen
 * @date 2019年10月14日 下午4:16:36
 * @version
 */
@RestController
@CrossOrigin
@RequestMapping("/allProcess")
public class AllProcessController {

	/**
	 * 
	 * @param userCode用户编号
	 * @param type类型  1:绩效 2：需求 3：指南 4：项目 5 成果 6 全过程
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "test")
	public Map<String, Object> configAllProcessTableHead() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", "2");
		return map;
	}
	
}
