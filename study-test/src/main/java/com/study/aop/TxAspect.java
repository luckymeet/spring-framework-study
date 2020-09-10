package com.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author yuminjun yuminjun@lexiangbao.com
 * @version 1.00
 * @date 2020/9/3 15:37
 * @record <pre>
 * version  author      date      desc
 * -------------------------------------------------
 * 1.00     yuminjun    2020/9/3   新建
 * -------------------------------------------------
 * </pre>
 */
@Component
@Aspect
public class TxAspect {

//    @Pointcut("execution(public * com.study.circulardependency..*.*(..))")
	@Pointcut("@annotation(com.study.aop.AopTest)")
    private void pointcut() {
    }

    @Around("pointcut()")
    public Object around(JoinPoint joinPoint) throws Throwable {
    	String className = joinPoint.getTarget().getClass().getSimpleName();
		System.out.println(className + ":AOP before");
        // 执行业务逻辑
		ProceedingJoinPoint method = (ProceedingJoinPoint) joinPoint;
		Object proceed = method.proceed();
		System.out.println(className + ":AOP after\n");
        return proceed;
    }

}
