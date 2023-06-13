package com.test.business;

import java.util.*;

import com.test.data.api.TodoService;

public class TodoBusinessimpl {
	private TodoService todoservice;

	public TodoBusinessimpl(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	
	public List<String> retrieveTodos(String user)
	{
		List<String> FilteredTodo=new ArrayList<String>();
	    List<String> todos=todoservice.retrieveTodos(user);
		for(String todo:todos)
		{
			if(todo.contains("spring"))
			{
				FilteredTodo.add(todo);
			}
			
		}
		return FilteredTodo;
	}
	

}
