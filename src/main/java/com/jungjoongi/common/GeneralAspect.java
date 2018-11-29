///*package com.jungjoongi.common;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//
//
//@Aspect
//@Component
//public class GeneralAspect {
//
//    @Before("execution(* com.kt.service..*Controller.*(..))")
//    public void beforeInterceptor(JoinPoint joinpoint) throws Throwable {
//        Object[] args = joinpoint.getArgs();
//        if(args == null || args.length <= 0) {
//            return;
//        }
//        
//        for(int i=0;i<args.length;i++) {
//            Object arg = args[i];
//            if(arg != null && arg.getClass() != null) {
//                String simpleName = arg.getClass().getSimpleName();
//                
//                if(simpleName.endsWith("ReqDto")) {
//                    GeneralLogInfo generalLogInfo = GeneralLogThreadLocal.currentGeneralLogInfo();
//                    generalLogInfo.setRequest(arg);
//                }
//            }
//        }
//    }
//    
//	@AfterReturning(pointcut="execution(* com.kt.service..*Controller.*(..))", returning="response")
//	public Object responseInterceptor(JoinPoint joinpoint, Object response) throws Throwable {
//		GeneralLogInfo generalLogInfo = GeneralLogThreadLocal.currentGeneralLogInfo();
//		String runningTime 	= SimpleStopWatch.getRunningTime(generalLogInfo.getLogStartNanoTime());
//		
//		generalLogInfo.setResponse(response);
//		generalLogInfo.setRunningTime(runningTime);
//		return response;
//	}
//	
//	@AfterReturning(pointcut="execution(* com.kt.common.controller.WebGeneralController.*ExceptionHandler(..))", returning="response")
//	public Object exceptionResultInterceptor(JoinPoint joinpoint, Object response) throws Throwable {
//		GeneralLogInfo generalLogInfo = GeneralLogThreadLocal.currentGeneralLogInfo();
//		String runningTime 	= SimpleStopWatch.getRunningTime(generalLogInfo.getLogStartNanoTime());
//		
//		generalLogInfo.setResponse(response);
//		generalLogInfo.setRunningTime(runningTime);
//		return response;
//	}
//	
//	protected HttpServletRequest getHttpServletRequest(JoinPoint joinpoint) {
//		for(Object obj:joinpoint.getArgs() ){
//			if(obj instanceof HttpServletRequest) {
//				return (HttpServletRequest) obj;      
//			}    	
//        }
//		return null;
//	}
//}
