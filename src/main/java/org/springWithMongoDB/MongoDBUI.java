package org.springWithMongoDB;

import org.springWithMongoDB.dao.MongoUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MongoDBUI {

	@RequestMapping("/getdata")
	public @ResponseBody String getDBData() {
		return "<html>"+ +
"<head>\n" +
"<style>\n" +
"html, body, .container\n" +
"{\n" +
"    height: 100%; \n" +
"    min-height: 100%;\n" +
"}\n" +
"body{\n" +
"	font-family:'Century Gothic';\n" +
"	font-size: 2em;\n" +
"}\n" +
".first {\n" +
"    float: left;\n" +
"    width: 20%;\n" +
"    height: 30%;\n" +
"    background-color: red;\n" +
"}\n" +
"\n" +
".second{\n" +
"    float: left;\n" +
"    width: 20%;\n" +
"    height: 70%;\n" +
"    background-color: green;\n" +
"}\n" +
"\n" +
"\n" +
".third{\n" +
"    float: right;\n" +
"    width: 80%;\n" +
"    height: 80%;\n" +
"    background-color: blue;\n" +
"}\n" +
"\n" +
".fourth {\n" +
"    float: right;\n" +
"    width: 40%;\n" +
"    height: 20%;\n" +
"    background-color: #DDDDDD;\n" +
"}\n" +
"  \n" +
".basicDiv {\n" +
"-moz-box-shadow: 10px 10px 5px #888;\n" +
"-webkit-box-shadow: 10px 10px 5px #888;\n" +
"box-shadow: 4px 5px 9px #888;\n" +
"cursor:pointer;\n" +
"}\n" +
"\n" +
".basicDiv:hover { \n" +
"    background-color: aliceblue;\n" +
"box-shadow: 4px 14px 9px #888\n" +
"}\n" +
"\n" +
"\n" +
"a{\n" +
"text-decoration:none;\n" +
"}\n" +
".spanA{\n" +
"display:none;\n" +
"}\n" +
"</style>\n" +
"</head>\n" +"<body style=\"font-family:'Century Gothic';font-size: 2em;\">"MongoUtils.main2(null)+"</body></html>";
	}

	@RequestMapping("/")
	public @ResponseBody String getDBData2() {
		 String html="<html>\n" +
"<head>\n" +
"<style>\n" +
"html, body, .container\n" +
"{\n" +
"    height: 100%; \n" +
"    min-height: 100%;\n" +
"}\n" +
"body{\n" +
"	font-family:'Century Gothic';\n" +
"	font-size: 2em;\n" +
"}\n" +
".first {\n" +
"    float: left;\n" +
"    width: 20%;\n" +
"    height: 30%;\n" +
"    background-color: red;\n" +
"}\n" +
"\n" +
".second{\n" +
"    float: left;\n" +
"    width: 20%;\n" +
"    height: 70%;\n" +
"    background-color: green;\n" +
"}\n" +
"\n" +
"\n" +
".third{\n" +
"    float: right;\n" +
"    width: 80%;\n" +
"    height: 80%;\n" +
"    background-color: blue;\n" +
"}\n" +
"\n" +
".fourth {\n" +
"    float: right;\n" +
"    width: 40%;\n" +
"    height: 20%;\n" +
"    background-color: #DDDDDD;\n" +
"}\n" +
"  \n" +
".basicDiv {\n" +
"-moz-box-shadow: 10px 10px 5px #888;\n" +
"-webkit-box-shadow: 10px 10px 5px #888;\n" +
"box-shadow: 4px 5px 9px #888;\n" +
"cursor:pointer;\n" +
"}\n" +
"\n" +
".basicDiv:hover { \n" +
"    background-color: aliceblue;\n" +
"box-shadow: 4px 14px 9px #888\n" +
"}\n" +
"\n" +
"\n" +
"a{\n" +
"text-decoration:none;\n" +
"}\n" +
".spanA{\n" +
"display:none;\n" +
"}\n" +
"</style>\n" +
"</head>\n" +
"<body>\n" +
"<br/>\n" +
"<fieldset style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\">\n" +
"<legend style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\">AWS EC2&nbsp;&nbsp;&nbsp;\n" +
"  <input  style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\" type=\"text\" value=\"52.74.180.59\"\n" +
"  id=\"awsInstanceIP\"/>&nbsp;&nbsp;\n" +
"  <input   style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\"  type=\"button\" value=\"Reset\" onclick=\"document.getElementById('awsInstanceIP').value = '52.74.180.59';\"/></legend>\n" +
"  \n" +
"<table style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\" cellpadding=\"20px\">\n" +
"\n" +
"<tr>\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 90px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 6px;\n" +
"\">\n" +
"<img src=\"images/300px-Tomcat-logo.svg.png \" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 155px;\" onclick=\"this.href=getUrl(':8181/manager/html');\" href=\"return getUrl(':8080/manager/html');\">EC2 Tomcat</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 100px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/cloudbees-logo-notag.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 255px;\" onclick=\"this.href=getUrl(':8181/jenkins');\" href=\"http://52.74.180.59:8080/jenkins\" >EC2 Jenkins</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td> \n" +
"\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 90px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 6px;\n" +
"\">\n" +
"<img src=\"images/artifactory.gif\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 155px;\" onclick=\"alert('Oops! Sorry. Not yet installed.');return false;this.href=getUrl(':8081/artifactory');\" href=\"http://localhost:8081/artifactory\">EC2 Artifactory</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"\n" +
"\n" +
"</tr>\n" +
"<tr>\n" +
"\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height:70px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 13px;\n" +
"  margin-left: 10px;\n" +
"\">\n" +
"<img src=\"images/800px-JIRA_logo.svg.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div style=\"\n" +
"    margin-top: 13px;\n" +
"    margin-left: 42px;\n" +
"\">\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 130px;\" onclick=\"this.href=getUrl(':8081');\" href=\"http://localhost:8081/\">EC2 JIRA</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td> \n" +
"\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height:70px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 17px;\n" +
"  margin-left: 13px;\n" +
"\">\n" +
"<img src=\"images/confl.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div style=\"\n" +
"    margin-top: 13px;\n" +
"    margin-left: 273px;\n" +
"\">\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 130px;\" onclick=\"this.href=getUrl(':8090');\" href=\"http://localhost:8090/\">EC2</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height:70px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 17px;\n" +
"  margin-left: 13px;\n" +
"\">\n" +
"<img src=\"images/gitlab-logo.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div style=\"\n" +
"    margin-top: 13px;\n" +
"    margin-left: 153px;\n" +
"\">\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 130px;\" onclick=\"this.href=getUrl('');\" href=\"http://localhost:8090/\">EC2 GitLab</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"\n" +
"\n" +
"\n" +
"</tr>\n" +
"</table>\n" +
"</fieldset>\n" +
"<br/>\n" +
"<fieldset style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\">\n" +
"  \n" +
"<legend style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\">Cloud</legend>\n" +
"<table style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\" cellpadding=\"20px\">\n" +
"<tr>\n" +
"	<td><div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"  \n" +
"    height: 70px;\n" +
"  align-content: left;\n" +
"  display: inline-block;\n" +
"  margin-top: 20px;\n" +
"    margin-left: 10px;\n" +
"\">\n" +
"<img src=\"images/logo.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" href=\"https://console.run.pivotal.io/organizations/667a71ce-07ce-4fb1-8a00-f7e7682cb814#spaces\" style=\"    text-decoration: none;\n" +
"      margin-top: -54px;\n" +
"      margin-left: 213px;\n" +
"  display: block;\">PWS</a>\n" +
"</div>\n" +
"<br> \n" +
"</div>\n" +
"	</td>\n" +
"	\n" +
"	<td><div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"  width: 72px;\n" +
"  height: 100px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/Google_Drive_Logo.svg\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" href=\"https://drive.google.com/drive/u/0/?tab=mo#folders/0B5uC_ogpIvp8fmVDUGZ1dk02bzBKamtKZDF0UDR4c1hEc1pmcnQwUi1mWk5IdGxlWHNESGs\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 95px;\">Google Drive ndVOR</a>\n" +
"</div>\n" +
"<br> \n" +
"</div>\n" +
"	</td>\n" +
"	\n" +
"	<td><div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"  width: 72px;\n" +
"  height: 100px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/Google_Drive_Logo.svg\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" href=\"https://drive.google.com/drive/u/2\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 95px;\">Google Drive QIOTEC</a>\n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"	\n" +
"</tr>\n" +
"\n" +
"<tr>\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 100px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/cloudbees-logo-notag.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 255px;\" href=\"https://ndvor.ci.cloudbees.com/?cloudbees.platform\" >Jenkins</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height:70px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 5px;padding:10px;\n" +
"  margin-left: 10px;background:#2e3843;\n" +
"\">\n" +
"<img src=\"images/mongolab-logo-250x65.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div style=\"\n" +
"    margin-top: 13px;\n" +
"    margin-left: 42px;\n" +
"\">\n" +
"<a target=\"_blank\" style=\"text-decoration: none;\n" +
"  margin-top: -74px;\n" +
"  display: inline-block;\n" +
"  margin-left: 268px; \" href=\"https://mongolab.com/login/\">Mongo DB</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"\n" +
"\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height:70px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 13px;\n" +
"  margin-left: 10px;\n" +
"\">\n" +
"<img src=\"images/800px-JIRA_logo.svg.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div style=\"\n" +
"    margin-top: 13px;\n" +
"    margin-left: 42px;\n" +
"\">\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 130px;\" href=\"https://qiotec.atlassian.net/secure/RapidBoard.jspa\">QIO JIRA</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td> \n" +
"</tr>\n" +
"</table>\n" +
"</fieldset>\n" +
"<br/> \n" +
"<fieldset style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\">\n" +
"<legend style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\">&nbsp;&nbsp;Local&nbsp;&nbsp;</legend>\n" +
"<table style=\"  font-family: 'Century Gothic';\n" +
"  font-size: 1em;\" cellpadding=\"20px\">\n" +
"<tr>\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 90px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 6px;\n" +
"\">\n" +
"<img src=\"images/300px-Tomcat-logo.svg.png \" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 155px;\" href=\"http://localhost:8080/manager/html\">Local Tomcat</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 100px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/cloudbees-logo-notag.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 255px;\" href=\"http://localhost:8080/jenkins\" >Local Jenkins</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td> \n" +
"\n" +
"<td>\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 90px;margin-left: 10px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 6px;\n" +
"\">\n" +
"<img src=\"images/artifactory.gif\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 155px;\" href=\"http://localhost:8081/artifactory\">Local Artifactory</a> \n" +
"</div>\n" +
"<br> \n" +
"</div></td>\n" +
"\n" +
"\n" +
"</tr>\n" +
"</table>\n" +
"</fieldset>\n" +
"<br/><br/>\n" +
" <script>\n" +
" function getUrl(suffix){\n" +
" //alert(\"http://\"+document.getElementById('awsInstanceIP').value+suffix);\n" +
" return \"http://\"+document.getElementById('awsInstanceIP').value+suffix;\n" +
" }\n" +
" </script>\n" +
"<!--\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"  \n" +
"    height: 70px;\n" +
"  align-content: left;\n" +
"  display: inline-block;\n" +
"  margin-top: 20px;\">\n" +
"<img src=\"images/logo.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" href=\"https://console.run.pivotal.io/organizations/667a71ce-07ce-4fb1-8a00-f7e7682cb814#spaces\" style=\"    text-decoration: none;\n" +
"  margin-top: -48px;\n" +
"  margin-left: 193px;\n" +
"  display: block;\">PWS</a>\n" +
"</div>\n" +
"<br> \n" +
"</div>\n" +
"<br/>\n" +
"<br/>\n" +
" \n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"  width: 72px;\n" +
"  height: 100px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/Google_Drive_Logo.svg\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" href=\"https://drive.google.com/drive/u/0/?tab=mo#folders/0B5uC_ogpIvp8fmVDUGZ1dk02bzBKamtKZDF0UDR4c1hEc1pmcnQwUi1mWk5IdGxlWHNESGs\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 95px;\">Google Drive ndVOR</a>\n" +
"</div>\n" +
"<br> \n" +
"</div>\n" +
"<br/>\n" +
"<br/>\n" +
"\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"  width: 72px;\n" +
"  height: 100px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/Google_Drive_Logo.svg\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" href=\"https://drive.google.com/drive/u/2\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 95px;\">Google Drive QIOTEC</a>\n" +
"</div>\n" +
"<br> \n" +
"</div>\n" +
"<br/>\n" +
"<br/>\n" +
"\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\">\n" +
"<div style=\"   \n" +
"  height: 100px;\n" +
"  align-content: left;  display: inline-block;\">\n" +
"<img src=\"images/cloudbees-logo-notag.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div>\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 255px;\" href=\"https://ndvor.ci.cloudbees.com/?cloudbees.platform\" >Jenkins</a> \n" +
"</div>\n" +
"<br> \n" +
"</div>\n" +
"<br/>\n" +
"<br/>\n" +
"\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;background:#2e3843;\">\n" +
"<div style=\"   \n" +
"  height:70px;\n" +
"  align-content: left;  display: inline-block;\n" +
"  margin-top: 13px;\n" +
"  margin-left: 10px;\n" +
"\">\n" +
"<img src=\"images/mongolab-logo-250x65.png\" style=\"  width: inherit;  height: inherit;\"></div>\n" +
"<div style=\"\n" +
"    margin-top: 13px;\n" +
"    margin-left: 42px;\n" +
"\">\n" +
"<a target=\"_blank\" style=\"text-decoration:none;margin-top: -65px;display: inline-block;margin-left: 255px;color:white;\" href=\"https://mongolab.com/login/\">Mongo DB</a> \n" +
"</div>\n" +
"<br> \n" +
"</div>\n" +
"<br/>\n" +
"<br/>\n" +
"\n" +
" \n" +
"\n" +
"\n" +
"<div class=\"basicDiv\" style=\"width:500px;height:100px;\"   >\n" +
"<a target=\"_blank\" href=\"https://mongolab.com/login/\" style=\"text-decoration:none;\">Mongo DB</a>\n" +
"<br/>\n" +
"<span  class=\"spanA\" style=\"font-size:50%;\"><a target=\"_blank\" href=\"https://mongolab.com/login/\">https://mongolab.com/login/</a></span>\n" +
"</div>\n" +
"\n" +
"<iframe src=\"https://qiotec.atlassian.net/secure/RapidBoard.jspa?rapidView=2&view=planning.nodetail\">\n" +
"</iframe>\n" +
"\n" +
"-->\n" +
"</body>\n" +
"</html>";
		
		return html;
	}

}
