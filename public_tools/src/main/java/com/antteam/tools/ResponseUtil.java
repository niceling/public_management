package com.antteam.tools;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {
	public static void renderResponse(HttpServletResponse response,Object obj)throws Exception{
		response.setContentType("application/json;charset=utf-8");
		PrintWriter writer=response.getWriter();
		writer.println(obj);
		writer.flush();
		writer.close();
	}
}
