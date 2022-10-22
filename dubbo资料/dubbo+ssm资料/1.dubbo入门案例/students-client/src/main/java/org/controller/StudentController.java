package org.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.students.server.StudentServer;

import com.alibaba.dubbo.config.annotation.Reference;
//@Controller
//@ResponseBody
@RestController
@RequestMapping("controller")
public class StudentController {
	
	@Reference//��Զ�̷����е�StudentServer ע�뵽��������
	private StudentServer stuServer ;
	
	@RequestMapping("rpcSerer")
	public String rpcSerer() {//�������˴���
		String result = stuServer.server("zs") ;
		
		return result ;//将结果显示在控制台
		
		
		
	}
}