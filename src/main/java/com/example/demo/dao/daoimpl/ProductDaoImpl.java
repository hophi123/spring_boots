package com.example.demo.dao.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.ProductEntity;
import com.example.demo.dao.ProductDao;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	/*
	 * @Autowired private EntityManager entityManager;
	 */

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void createProduct(ProductEntity entity) {
		entityManager.persist(entity);
	}

	@Override
	public ProductEntity getProduct(Integer id) {
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT pe ");
		sql.append(" FROM ");
		sql.append("    ProductEntity pe ");
		sql.append(" WHERE ");
		sql.append("    pe.id = :id ");

		Query query = this.entityManager.createQuery(sql.toString());
		query.setParameter("id", id);
		ProductEntity entity = null;
		try {
			entity = (ProductEntity) query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	@Override
	public int delProduct(Integer id) {
		StringBuilder sql = new StringBuilder();
		sql.append(" DELETE ");
		sql.append(" FROM ");
		
		return 0;
	}

}
