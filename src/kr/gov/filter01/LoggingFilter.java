package kr.gov.filter01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 	*필터
 * 		- 브라우저에서 서블릿에 요청하거나 응답할 때 미리 요청이나 응답과 관련된 여러 작업을 처리
 * 		- 요청이나 응답시 공통적인 작업을 처리
 * 		- 요청필터 : 사용자 인증 및 권한 검사, 요청시 요청 관련 로그 작업, 인코딩 기능
 * 		- 응답필터 : 응답결과에 대한 암호화 작업, 서비스 시간 층정
 */

public class LoggingFilter implements Filter {

	//필터가 생성될 때 한 번 호출됨.
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("필터 초기화 됨");
		
	}

	//요청 시마다 실행되는 필터 메서드
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("요청이 필터에서 처리됨");
		chain.doFilter(request, response);
		System.out.println("응답이 필터에서 처리됨");

	}

	//필터가 제거될 때 실행
	@Override
	public void destroy() {
		System.out.println("필터 제거됨");
		
	}

}






















