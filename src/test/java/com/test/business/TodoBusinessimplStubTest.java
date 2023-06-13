package com.test.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.test.data.api.TodoService;
import com.test.data.api.TodoServiceStub;

public class TodoBusinessimplStubTest {

	@Test
	public void test_usingAStub() {
		
		TodoService todoservicestub=new TodoServiceStub();
			
		TodoBusinessimpl todobusinessimpl=new TodoBusinessimpl(todoservicestub);
		List<String> todo= todobusinessimpl.retrieveTodos("");
		
		assertEquals(2,todo.size());
		
		
	}

}
