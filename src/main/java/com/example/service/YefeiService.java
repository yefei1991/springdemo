package com.example.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
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
	
	public List<Yefei> findByPage(){
		Sort s=new Sort(Direction.DESC, "id");
		PageRequest page=new PageRequest(1,10,s);
		Page<Yefei> yefeiPage=yefeiDao.findAll(page);
		return yefeiPage.getContent();
	}
	
	public List<Yefei> findWithCondition(){
		List<Yefei> yefeList=yefeiDao.findAll(new Specification<Yefei>(){
			@Override
			public Predicate toPredicate(Root<Yefei> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				Path<String> id = root.get("id");  
				query.where(cb.equal(id, 59));
				return null;
			}
		});
		return yefeList;
	}
}
