/*
* generated by Xtext
*/
package net.winklerweb.cdoxtext.example.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GraphixAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/winklerweb/cdoxtext/example/parser/antlr/internal/InternalGraphix.tokens");
	}
}