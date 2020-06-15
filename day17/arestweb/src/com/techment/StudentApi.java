package com.techment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/students")
public class StudentApi {

	@GET
	@Path("/studentdetails")
	public String getStudentDetails()  {
		return "student details";
	}
	
	@GET
	@Path("/byname/(name)")
	public String getStudentDetailsbyname( @PathParam("name") String name)  {
		return "Your name is " +name;
	}
	
	
	@GET
	@Path("/getstudent")
	@Produces(MediaType.APPLICATION_JSON)
	public student getStudentdetails2() {
		student std = new student();
		std.setId(1);
		std.setName("Arvind");
		std.setDept("CSE");
		return std;
	}
	
}
