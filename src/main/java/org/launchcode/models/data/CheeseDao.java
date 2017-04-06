package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Brady on 4/6/17.
 */
@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer>{
}
