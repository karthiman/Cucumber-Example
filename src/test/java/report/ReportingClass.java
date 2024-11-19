package report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	public static void generateJVMReport(String json) {
		File file = new File("C:\\Users\\91737\\eclipse-workspace\\cuc\\target\\cucumber-report");
		Configuration configuration = new Configuration (file, "Adactin Login");
		configuration.addClassifications ("Browser", "Chrome");
		configuration.addClassifications ("platform", "win-11");
		configuration.addClassifications ("Sprint No", "13");
		configuration. addClassifications ("Environment", "UI");
		// json will receive Collection of string values are going to add
		List <String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder builder = new ReportBuilder (li, configuration);
		builder.generateReports ();
		}
}