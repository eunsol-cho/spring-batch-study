package com.example.springbatchsample.restapi;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobLaunchingController {

	/**
	 * JOB이 실행 되기 위해서는
	 * : 잡을 실행하는 jobLauncher + 어떤 job 을 실행시킬지 등록된 bean 을 찾기위한 applicationContext 가 필요
	 * */
	/*@Autowired
	private JobLauncher launcher;

	@Autowired
	private ApplicationContext context;

	@PostMapping(path = "/run")
	public ExitStatus runJob(@RequestBody JobLaunchRequest request) {



	}*/
}
