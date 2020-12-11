package com.example.demo.controller;

import com.example.demo.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Console;

@Controller
@RequestMapping(value = "/user")
public class LoginFlowController {

    @Autowired
    UserDaoImpl userDao;






    @ResponseBody
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public Object log_in(HttpServletRequest request)
    {
        return userDao.isValidate(request);
    }






    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(HttpServletRequest request){
        Object registerResult = userDao.register(request);
        return registerResult;
    }





}
