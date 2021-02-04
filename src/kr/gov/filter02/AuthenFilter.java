package kr.gov.filter02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter implements Filter{
	
	public AuthenFilter() {
		System.out.println("AuthenFilter 생성자 호출");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter01 초기화");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter01.jsp 요청");
		
		String name = request.getParameter("name");
		
		if(name == null || name.equals("")) {			//name값이 null이라면 아래 doFilter()는 호출안됨
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("입력된 name은 null입니다.");
			return;
		}
		
		chain.doFilter(request, response);
		System.out.println("filter01.jsp 응답");
		
	}

	@Override
	public void destroy() {
		System.out.println("filter01 해제");
	}

}







