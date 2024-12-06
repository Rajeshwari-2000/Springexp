package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void saveProduct(Product p) {
		int n=jdbcTemplate.update("insert into product1 values(?,?,?,?,?,?)", new Object[]{
				p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getLdt(),p.getCid()
		});
	
		
	}
	@Override
	public boolean deleteById(int pid) {
		int n=jdbcTemplate.update("delete from product1 where pid=?",new Object[] {pid});
		return n>0;
	}
	
	@Override
	public boolean modifyById(int pid1, int qty, double price) {
		int n=jdbcTemplate.update("update product1 set qty=?,price=?,where pid=?",new Object[] {pid1,qty,price});
		return n>0;
	}
	
	@Override
	public Product FindById(int pid2) {
		try {
			Product p=jdbcTemplate.queryForObject("select * from product1 where pid=?",new Object[] {pid2}, BeanPropertyRowMapper.newInstance(Product.class));
			return p;
		}catch(EmptyResultDataAccessException e) {
			System.out.println("in exception product not found");
			return null;
		}
	}
	
	@Override
	public List<Product> FindAll() {
		List<Product> plist=jdbcTemplate.query("select * from product1", (rs,numrows)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setLdt(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			return p;
		});
		return plist;
	}
	
	@Override
	public List<Product> FindByPrice(double price1) {
		List<Product>plist=jdbcTemplate.query("Select * from product1 where price>?", new Object[] {price1}, BeanPropertyRowMapper.newInstance(Product.class));
		if(plist.size()>0)
			return plist;
		else
			return null;
	}

}
