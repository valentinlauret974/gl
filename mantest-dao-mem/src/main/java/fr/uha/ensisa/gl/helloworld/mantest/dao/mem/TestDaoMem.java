package fr.uha.ensisa.gl.helloworld.mantest.dao.mem;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import fr.uha.ensisa.gl.helloworld.mantest.Test;
import fr.uha.ensisa.gl.helloworld.mantest.dao.TestDao;

public class TestDaoMem implements TestDao {
	private final Map<Long, Test> store = Collections.synchronizedMap(new TreeMap<Long, Test>());

	public void persist(Test test) {
		store.put(test.getId(), test);
	}

	public void remove(Test test) {
		store.remove(test.getId());
	}

	public Test find(long id) {
		return store.get(id);
	}

	public Collection<Test> findAll() {
		return store.values();
	}

	public long count() {
		return store.size();
	}
}
