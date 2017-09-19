package com.agro;

import org.testng.TestNG;

public class Runa {

	public static void main(String[] args) {
	
					TestNG testng=new  TestNG();
					Class[] classes=new Class[]{TestCase.class};
					testng.setTestClasses(classes);
					testng.run();

				}

	}


