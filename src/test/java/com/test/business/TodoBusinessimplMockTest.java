package com.test.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.test.data.api.TodoService;


public class TodoBusinessimplMockTest {

	@Test
	public void test_usingAMock() {
		
		TodoService mocktodoservice=mock(TodoService.class);
		 List<String> todo=Arrays.asList("I am spring","You can also be spring","Going Home");
		when(mocktodoservice.retrieveTodos("")).thenReturn(todo);

		TodoBusinessimpl todobusinessimpl=new TodoBusinessimpl(mocktodoservice);
		List<String> filteredtodo= todobusinessimpl.retrieveTodos("");
		
		assertEquals(2,filteredtodo.size());
		
		
	}

}
