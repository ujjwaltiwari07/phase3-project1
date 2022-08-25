package com.spring.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.UsersDao;
import com.spring.users.UsersEntity;

@Controller
public class UsersController {

	@Autowired
	UsersDao data;

	@GetMapping("/listUser")
	public String getAllDeatials(ModelMap map) {
		List<UsersEntity> list = data.getAllUsers();
		map.addAttribute("list", list);
		return "userslist";
	}

	@GetMapping("/search")
	public String getRequestDetails(ModelMap map, HttpServletRequest request) {
		String id = request.getParameter("userid");
		int user_id = Integer.parseInt(id);
		UsersEntity users = data.getRequestedUser(user_id);
		if (user_id!=0) {
			map.addAttribute("req", users);
			return "searchdetails";
		} else {
			return "errorpage";
		}
	}
	
	 @RequestMapping(value="/edit/{id}")    
	    public String edit(@PathVariable int id, Model map){    
	        UsersEntity user=data.getEmpById(id);    
	        map.addAttribute("command",user);  
	        System.out.println(user.getUserid()+user.getUserName()+user.getPhone());
	        return "editform";   
	 }
	    
	 
	 
	    @RequestMapping(value="/editsave")    
	    public String editsave(@ModelAttribute("req") UsersEntity emp){ 
	    	System.out.println(emp.getUserid()+emp.getUserName()+emp.getPhone());
	        if(emp.getUserid()!=0 && emp.getUserName()!=null&&emp.getPhone()!=0) {
	    	data.update(emp);    
	        return "searchdetails";    
	    }    
	        else {
	        	return "errorpage";
	        }
	    }
}
