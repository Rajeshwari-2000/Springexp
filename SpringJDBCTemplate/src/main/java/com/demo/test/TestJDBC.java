package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJDBC {
  public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
	Scanner sc=new Scanner(System.in);
	ProductService pservice=(ProductService)ctx.getBean("productServiceImpl");
	int choice=0;
	do {
		System.out.println("1.add new product\n2.delete product\n3.modify product");
		System.out.println("4.display by id\n5.display all\n6.display by price\n7.exit\nchoice: ");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			pservice.addnewProduct();
			break;
			
			
		case 2:
			System.out.println("Enter the id to delete");
			int pid=sc.nextInt();
			boolean status=pservice.removebyId(pid);
			if(status)
				System.out.println("Product is deleted Successfully");
			else {
				System.out.println("Product Not Found...");
			}
			
			break;
		case 3:
			System.out.println("Enter the id to update");
			int pid1=sc.nextInt();
			System.out.println("Enter the qty");
			int qty=sc.nextInt();
			System.out.println("Enter the price of the product");
			double price=sc.nextDouble();
			boolean status1=pservice.updateById(pid1,qty,price);
			if(status1) {
				System.out.println("product Updated successfully");
			}else {
				System.out.println("product not found...");
			}
			break;
			
			
		case 4:
			System.out.println("Enter the id to search");
			int pid2=sc.nextInt();
			Product p=pservice.getById(pid2);
			if(p!=null) {
				System.out.println(p);
			}else {
				System.out.println("product not found");
			}
			break;
			
			
		case 5:
			List<Product>plist=pservice.getAllProducts();
			plist.forEach(System.out::println);
			break;
			
			
		case 6:
			System.out.println("Enter the price of the product");
			double price1=sc.nextDouble();
			plist=pservice.getByPrice(price1);
			if(plist!=null) {
				plist.forEach(System.out::println);
			}else {
				System.out.println("Product not found");
			}
			break;
			
			
		case 7:
			System.out.println("Thank you for visiting");
			sc.close();
			break;
			
			
		default:
			System.out.println("invalid choice");
			break;
		}
	}while(choice!=7);
}
}
