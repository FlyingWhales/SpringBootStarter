package com.ugur._1.policy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
	
	private String property;
	
	public PolicyService() {
		System.out.println("PolicyService.constructor.empty");
		System.out.println(this.toString());
	}
	
	//@Autowired //Springe hangi constructorı kullanacağını söylüyoruz
	public PolicyService(@Value("INJECTED") String property) {
		System.out.println("PolicyService.constructor.notEmpty");
		this.property = property;
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "PolicyService [property=" + property + "]";
	}

	public List<Policy> getAllPolicies() {
		
		List<Policy> result = new ArrayList<Policy>();
		
		int i = 0;
		do {
			Policy p = new Policy();
			p.setPolicyNumber(i);
			p.setPolicyDate(new Date());
			result.add(p);
			i++;
			
		} while (i < 5);
		
		return result;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
}
