package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.YefeiDao;
import com.example.model.Yefei;

  /**    
 * @author yefei       
 * @created 2016年6月13日 下午3:17:30 
 */
@Component
public class YefeiService {
	@Autowired
	private YefeiDao yefeiDao;
	
	public List<Yefei> findAll(){
		return (List<Yefei>)yefeiDao.findAll();
	}
}
