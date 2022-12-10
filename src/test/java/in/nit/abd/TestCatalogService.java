package in.nit.abd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Observable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestCatalogService {
	@Mock
	private OperService ops;
	
	private CatalogService cs;
	private double cost, per,amt;
	private String expected, actual;
	
	@BeforeEach
	public void setupData() {
		MockitoAnnotations.initMocks(this);
		cs = new CatalogService(ops);
		cost=100.0;	
		per=10.0;
		amt=10.0;
		expected="Final cost:110.0";
	}
	
	@Test
	public void testFindCost() {
		when(ops.findGst(cost, per)).thenReturn(amt);
		
		actual = cs.findCost(cost);
		assertEquals(expected, actual);
	}
	@AfterEach
	public void cleanData() {
		expected = actual =null;
		cost = per =amt=0.0;
	}
}
