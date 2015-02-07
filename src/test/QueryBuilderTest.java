package test;
import junit.framework.Assert;

import org.junit.Test;

import es.edu.android.whatsthat.builder.SqlQueryBuilder;


public class QueryBuilderTest {
	SqlQueryBuilder queryBuilder;
	
	@Test
	private void test() {
		queryBuilder = new SqlQueryBuilder("ir_codes");
		
		String query = queryBuilder.buildRawQuery();
		
		Assert.assertNotNull(query);
	}
}
