package es.edu.android.whatsthat.builder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SqlQueryBuilder {
	public static final String LEFT_JOIN = "LEFT";
	public static final String RIGHT_JOIN = "RIGHT";
	public static final String INNER_JOIN = "INNER";
	public static final String OUTER_JOIN = "OUTER";
	
	
	private String tableName;
	private String[] selection;
	private List<SqlQueryBuilder> joins = new ArrayList<SqlQueryBuilder>();
	private String joinType;
	
	public SqlQueryBuilder(String _tableName) {
		tableName = _tableName;
	}
	
	public SqlQueryBuilder(String _tableName, String[] _selection) {
		this(_tableName);
		
		selection = _selection;
	}
	
	public void addJoin(String _tableName, String joinType) {
		addJoin(_tableName, joinType, null);
	}
	
	public void addJoin(String _tableName, String _joinType, String[] _selection) {
		SqlQueryBuilder joinBuilder = new SqlQueryBuilder(_tableName, _selection);
		joinBuilder.joinType = _joinType;
		joins.add(joinBuilder);
	}
	
	public String buildSelection() {
		String str = " ";
		
		if (selection != null) {
			for (int i = 0; i < selection.length; i++) {
				String sel = selection[i];
				
				str += " a." + sel + " ";
				if (i < selection.length - 1) {
					str += " , ";
				}
			}
		} else {
			str += " a.* ";
		}
		
		if (joins != null && joins.size() > 0) {str += " , ";
			for (int i = 0; i < joins.size(); i++) {
				SqlQueryBuilder join = joins.get(i);
				
				String tableAbb = "b" + (i+1);
				if (join.selection != null) {
					for (int j = 0; j < join.selection.length; j++) {
						String sel = join.selection[j];
						
						str += " " + tableAbb + "." + sel + " ";
						if (j < join.selection.length - 1) {
							str += " , ";
						}
					}
				} else {
					str += " " + tableAbb + ".* ";
				}
				
				if (i < joins.size() - 1) {
					str += " , ";
				}
			}
		}
		
		return str;
	}
	
	public String buildJoins() {
		String str = "";
		
		if (joins != null && joins.size() > 0) {
			for (int i = 0; i < joins.size(); i++) {
				SqlQueryBuilder join = joins.get(i);
				
				str += " " + join.joinType + " JOIN ";
				str += " " + join.tableName + " ";
			}
		}
		
		
		return str;
	}
	
	public String buildRawQuery() {
		String query = "";
		
		query = " SELECT ";

		query += buildSelection();
		
		query += " FROM ";
		query += tableName + " a ";
		
		return query;
	}
}
