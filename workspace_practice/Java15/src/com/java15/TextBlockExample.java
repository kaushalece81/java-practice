package com.java15;
//Text blocks enhance readability and writability of string
public class TextBlockExample {
// Text block is multiple feature in string
	public static void main(String[] args) {
		// single line string
		String name = "Kaushlender Kumar sharma";
		System.out.println("name : " + name);
		representJsonAsString();

		representHtmlAsString();

		useFormattedWithTextBlock();

		sppressNewLineUsingTerminator();

		maintainSpace();
	}

	private static void representJsonAsString() {
		String sapleJsonOldWay ="{\"employees\":[\r\n"
				+ "  { \"firstName\":\"John\", \"lastName\":\"Doe\" },\r\n"
				+ "  { \"firstName\":\"Anna\", \"lastName\":\"Smith\" },\r\n"
				+ "  { \"firstName\":\"Peter\", \"lastName\":\"Jones\" }\r\n"
				+ "]}";
		System.out.println("sapleJsonOldWay : "+sapleJsonOldWay);
		//multiline string without \n
		String sampleJsonTextBlock = """
				{"employees":[
					{ "firstName":"John", "lastName":"Doe" },
					{ "firstName":"Anna", "lastName":"Smith" },
					{ "firstName":"Peter", "lastName":"Jones" }
				]}
				""";  // adding here adds new line to avoid add at the end of string
		System.out.println("sampleJsonTextBlock : "+sampleJsonTextBlock);
		System.out.println("HelloWorld");
		String sampleJsonTextBlockWithoutEndline = """
				{"employees":[
					{ "firstName":"John", "lastName":"Doe" },
					{ "firstName":"Anna", "lastName":"Smith" },
					{ "firstName":"Peter", "lastName":"Jones" }
				]}""";  // adding here at the end of string avoids new line 
		System.out.println("sampleJsonTextBlockWithoutEndline : "+sampleJsonTextBlockWithoutEndline);
		System.out.println("HelloWorld");
	}

	private static void representHtmlAsString() {
		// html as text block 
		//Old way
		String sampleHtmlOldWay = "<!DOCTYPE html>\r\n"
				+ "				<html>\r\n"
				+ "				<body>\r\n"
				+ "				<h1>Heading 1</h1>\r\n"
				+ "				<h2>Heading 2</h2>\r\n"
				+ "				<h3>Heading 3</h3>\r\n"
				+ "				<h4>Heading 4</h4>\r\n"
				+ "				<h5>Heading 5</h5>\r\n"
				+ "				<h6>Heading 6</h6>\r\n"
				+ "				</body>\r\n"
				+ "				</html>";
		
		System.out.println("sampleHtmlOldWay: "+sampleHtmlOldWay);
		String sampleHtmlTextBlock ="""
				<!DOCTYPE html>
				<html>
				<body>
				<h1>Heading 1</h1>
				<h2>Heading 2</h2>
				<h3>Heading 3</h3>
				<h4>Heading 4</h4>
				<h5>Heading 5</h5>
				<h6>Heading 6</h6>
				</body>
				</html>
				""";
		System.out.println("sampleHtmlTextBlock: "+sampleHtmlTextBlock);
	}

	private static void useFormattedWithTextBlock() {
		String sampleHtmlTextBlockMakeDyanamicValueInHtml ="""
				<html>
				<head><title>%s</title></head>
				<body>
				<h1>Heading 1</h1>
				<h2>Heading 2</h2>
				<h3>Heading 3</h3>
				<h4>Heading 4</h4>
				<h5>Heading 5</h5>
				<h6>%s</h6>
				</body>
				</html>
				""".formatted("Text Blocks  for title", "Hello Text Blocks for heading6 ");
		System.out.println("sampleHtmlTextBlockMakeDyanamicValueInHtml: "+sampleHtmlTextBlockMakeDyanamicValueInHtml);
	}

private static void sppressNewLineUsingTerminator() {
	String data = """
			This is supposed to on same line 
			but displayed on different line
			what we should do in order to 
			display the lines in single line.
			""";
	System.out.println("data : "+data);
	//use of line terminator which suppress new line and brings everything in one line
	String dataUsingLineTerminator = """
			This is supposed to on same line \
			but displayed on different line \
			what we should do in order to \
			display the lines in single line.
			""";
	System.out.println("dataUsingLineTerminator : "+dataUsingLineTerminator);
}

	private static void maintainSpace() {
		//using \s to act as g=fence to prevent stripping of trainling white spaces
		String dataWithSlashS = """
				-----------------------
						()	\s
					(		)	\s
				(				)	\s
				-----------------------	
				""";
		System.out.println("dataWithSlashS : "+dataWithSlashS);
	}

}
