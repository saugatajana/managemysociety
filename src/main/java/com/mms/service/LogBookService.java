package com.mms.service;


import java.util.List;

import com.mms.model.LogBook;
import com.mms.model.Response;

public interface LogBookService {
	public List<LogBook> findLog(String visitor);
	public Response addLog(LogBook logBook);
}
