package com.pokemon.aspect;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.pokemon.entity.Audit;
import com.pokemon.repository.AuditRepository;

@Aspect
@Component
public class AuditAspect {
	
	@Autowired
	private AuditRepository repo;
	
	
	@Before("execution(* com.pokemon.endpoint.PokemonEndpoint.*(..))")
	public void doBefore(JoinPoint joinPoint) {
		ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request=attributes.getRequest();
        String ip = request.getRemoteAddr();
        String method = joinPoint.getSignature().getName();        

		Audit audit = new Audit();
		audit.setIp(ip);
		audit.setExecutedMethod(method);
		audit.setRequestDate(new Date());
		repo.save(audit);		
	}
	
}
