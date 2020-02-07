package com.marcos.muroMensajes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marcos.muroMensajes.servicios.Autenticacion;




@Controller
public class RutasGenericas {
	

	
	@GetMapping("/")
	public String inicial(Authentication authentication) {
		
		System.out.println(authentication.isAuthenticated());
		System.out.println(authentication.getName());
		List<GrantedAuthority> permisos = (List<GrantedAuthority>)authentication.getAuthorities();
		
		

		
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/login")
	public String seguridad() {
		
		return "start";
	}	
	
}
