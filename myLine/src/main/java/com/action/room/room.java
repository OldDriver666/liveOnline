package com.action.room;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.state.Ram;

/**
 * 
 * @author Allen 2017年4月10日
 * 
 */
@Controller
public class room {

	@ResponseBody
	@RequestMapping("/roomsize")
	public String hello() {
		return "当前房间数: " + Ram.roomHm.size();
	}

}