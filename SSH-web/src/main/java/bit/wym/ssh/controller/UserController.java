package bit.wym.ssh.controller;


import bit.wym.ssh.entity.SshUser;

import bit.wym.ssh.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**  
 * 创建时间：2015-2-7 上午11:49:00  
 * @author andy  
 * @version 2.2  
 * 描述： 用户Controller
 */
@Controller
@RequestMapping("/user")
public class UserController
{

	private static final Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable String userId){
		LOGGER.info("查询用户：" + userId);
		SshUser userInfo = userService.load(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody List<SshUser> showUserInfos(){
		LOGGER.info("查询用户全部用户");
		List<SshUser> userInfos = userService.findAll();
		return userInfos;
	}
}
