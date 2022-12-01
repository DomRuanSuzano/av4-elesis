/**
 * Curso: Elementos de Sistemas
 * Arquivo: CodeTest.java
 * Created by Luciano Soares <lpsoares@insper.edu.br>
 * Date: 16/04/2017
 */

package assembler;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Rule;

import java.io.IOException;
import java.io.PrintWriter;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static org.junit.Assert.assertTrue;

public class CodeTest  {

	private static StringBuilder builder = new StringBuilder();

	/**
	 * Create the test case
	 */
	public CodeTest() {
	}

	/**
	 * Teste para geração de código para Destino
	 */
	@Test
	public void testCode_Computation() {

		try {

			assertTrue("addw %A   %D %D",Code.comp(new String[] {"addw","%A","%D","%D"}).equals("000000010"));
			assertTrue("addw (%A) %D %D",Code.comp(new String[] {"addw","(%A)","%D","%D"}).equals("001000010"));
			assertTrue("addw $1 (%A) %D",Code.comp(new String[] {"addw","$1","(%A)","%D"}).equals("001110111"));
			assertTrue("addw $1 %A %D",Code.comp(new String[] {"addw","$1","%A","%D"}).equals("000110111"));
			assertTrue("addw $1 %D %D",Code.comp(new String[] {"addw","$1","%D","%D"}).equals("000011111"));
			assertTrue("addw (%A) (%A) %D",Code.comp(new String[] {"addw","(%A)","(%A)","%D"}).equals("011000010"));
			assertTrue("addw (%A) %A %D",Code.comp(new String[] {"addw","(%A)","%A","%D"}).equals("010000010"));
		} catch(Exception e) {
			e.printStackTrace();
		}

	}


}
