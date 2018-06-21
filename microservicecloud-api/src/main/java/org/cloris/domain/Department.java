package org.cloris.domain;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Department implements Serializable {

	private static final long serialVersionUID = -5469013131307864362L;

	private Long deptno;
	private String dname;
	private String db_source;

	public Department(String dname) {
		super();
		this.dname = dname;
	}

}
