package org.sid.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class CompanyRestService {
@Value("${xParam}")
 int xParam;
@Value("${yParam}")
 int yParam;

@GetMapping("/myConfig")
public Map<String,Object> myConfig()
{
 Map<String,Object> params=new HashMap<>();
 params.put("x", xParam);
 params.put("y", yParam);
 
 return params;
}
}
