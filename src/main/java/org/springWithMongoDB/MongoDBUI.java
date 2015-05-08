package org.springWithMongoDB;

import org.springWithMongoDB.dao.MongoUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MongoDBUI {

	@RequestMapping("/getdata")
	public @ResponseBody String getDBData() {
		return MongoUtils.main2(null);
	}

}
