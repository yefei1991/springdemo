package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.model.Yefei;

  /**    
 * @author yefei       
 * @created 2016年6月13日 下午3:13:33 
 */
@Component
public interface YefeiDao extends CrudRepository<Yefei, Long>  {

}
