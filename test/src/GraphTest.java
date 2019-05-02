package src;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.data_structures.Graph;

public class GraphTest 
{

	private Graph<Integer, String, Double> grafo;

	@Before
	public void setupEscenario1()
	{
		grafo = new Graph<Integer, String, Double>();
	}

	@Before 
	public void setupEscenario2()
	{
		grafo = new Graph<Integer, String, Double>();

		for(int i = 0; i < 100000; i++)
		{
			grafo.addVertex(i, "Numero: " + i);
		}
	}

	@Test
	public void addVertexTest()
	{
		setupEscenario1();
		try
		{
			assertTrue(grafo.isEmpty());
			for(int i = 0; i < 100000; i++)
			{
				grafo.addVertex(i, "Numero: " + i);
			}
			assertFalse(grafo.isEmpty());
			assertEquals(grafo.V(), 100000);
		}
		catch(Exception e)
		{
			fail("No deberia generar excepcion.");
		}
	}
}
