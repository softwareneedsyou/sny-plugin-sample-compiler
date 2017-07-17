/**
 * 
 */
package fr.sny.example.plugin.compile;

import java.util.Map;
import java.util.UUID;

import fr.esgi.projet.softwareneedsyou.api.compiler.PluginCompiler;
import fr.esgi.projet.softwareneedsyou.api.compiler.PluginCompilerDeclare;
import fr.esgi.projet.softwareneedsyou.api.spi.InitialisationException;

/**
 * @author Blixel
 *
 */
public class CompilerExDeclare implements PluginCompilerDeclare {
	private final static UUID uid = new UUID(0L, 0L);

	/**
	 * 
	 */
	public CompilerExDeclare() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.esgi.projet.softwareneedsyou.api.spi.PluginDescriptor#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "a example of description";
	}

	/* (non-Javadoc)
	 * @see fr.esgi.projet.softwareneedsyou.api.spi.PluginDescriptor#getID()
	 */
	@Override
	public UUID getID() {
		// TODO Auto-generated method stub
		return uid;
	}

	/* (non-Javadoc)
	 * @see fr.esgi.projet.softwareneedsyou.api.spi.PluginDescriptor#getInstance(java.util.Map)
	 */
	@Override
	public PluginCompiler getInstance(Map<String, Object> arg0) throws InitialisationException {
		// TODO Auto-generated method stub
		return new CompilerEx();
	}

	/* (non-Javadoc)
	 * @see fr.esgi.projet.softwareneedsyou.api.spi.PluginDescriptor#getResume()
	 */
	@Override
	public String getResume() {
		// TODO Auto-generated method stub
		return "a short example";
	}

}
