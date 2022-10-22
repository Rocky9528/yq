package org.students.server.impl;

import org.students.server.StudentServer;

import com.alibaba.dubbo.config.annotation.Service;

@Service//阿里巴巴提供的@Service注解
public class StudentServerImpl  implements StudentServer{

	public String server(String name) {
		return "server:" +name;
	}

}
