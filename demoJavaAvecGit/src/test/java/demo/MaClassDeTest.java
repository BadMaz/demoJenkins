package demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import demoJavaAvecGit.FactorielException;
import demoJavaAvecGit.FonctionMathématique;

class MaClassDeTest {

	FonctionMathématique fct;
	
	@BeforeEach
	void anvantChaqueTest() {
		fct =  new FonctionMathématique();
	}
	
	@AfterEach
	void apresCahqueTest() {
		fct=null;
	}
	
	@BeforeAll
	static void avantLePremierTest() {
		//execute une fois avant le dernier test

	}
	
	@AfterAll
	static void apresLeDernierTest() {
		//execute une fois après le dernier test
	}
	
	@Test
	void additionTest() {
		FonctionMathématique fct = new FonctionMathématique();
		assertEquals(10, fct.addition(2, 8));
		assertEquals(15, fct.addition(10, 5));
		//assertEquals(15, fct.addition(10, 6));
		//assertEquals(10, 5+5);
		//fail("Not yet implemented");
	}
	
	@Test
	void factorielExceptionTest() {
		FonctionMathématique fct = new FonctionMathématique();
		assertThrows(FactorielException.class,()->{
			fct.factoriel(-1);	
		});
	}

	@Test
	void factorielTest() {
		FonctionMathématique fct= new FonctionMathématique();
		assertEquals(6, fct.factoriel(3));
		//assertTrue(true);
		//fail("pas défini");
	}
}
